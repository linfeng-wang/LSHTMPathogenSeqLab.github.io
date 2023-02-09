import json
from urllib.parse import urlsplit, parse_qsl
from serpapi import GoogleSearch
import pandas as pd

author_article_results_data = []

params = {
    "api_key": "3a2872f73de2497a4f8312368de4546299a8e4ee3eddc9455b9466bb0718585c",
    "engine": "google_scholar_author",
    "hl": "en",
    "sort": "pubdate",
    "author_id": "EicYvbwAAAAJ"
}

search = GoogleSearch(params)

articles_is_present = True
while articles_is_present:
    results = search.get_dict()
    for article in results.get("articles", []):
        title = article.get("title")
        link = article.get("link")
        citation_id = article.get("citation_id")
        authors = article.get("authors")
        publication = article.get("publication")
        cited_by_value = article.get("cited_by", {}).get("value")
        cited_by_link = article.get("cited_by", {}).get("link")
        cited_by_cites_id = article.get("cited_by", {}).get("cites_id")
        year = article.get("year")

        author_article_results_data.append({
            "article_title": title,
            "article_link": link,
            "article_year": year,
            "article_citation_id": citation_id,
            "article_authors": authors,
            "article_publication": publication,
            "article_cited_by_value": cited_by_value,
            "article_cited_by_link": cited_by_link,
            "article_cited_by_cites_id": cited_by_cites_id,
        })

    
    if "next" in results.get("serpapi_pagination", []):
        print("herewego")
        search.params_dict.update(dict(parse_qsl(urlsplit(results.get("serpapi_pagination").get("next")).query)))
    else:
        articles_is_present = False

print("Waiting for author articles to save..")
with open('_data/publications.json', 'w') as f:
    json.dump(author_article_results_data, f)
print("Author Articles Saved.")


def save_author_articles_to_csv():
    print("Waiting for author articles to save..")
    pd.DataFrame(data=author_article_results_data()).to_csv("_data/google_scholar_author_articles.csv", encoding="utf-8", index=False)

    print("Author Articles Saved.")
