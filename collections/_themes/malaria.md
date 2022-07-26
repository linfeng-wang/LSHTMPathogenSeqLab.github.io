---
layout: default
name: malaria
theme: malaria
---

# {{ page.theme | capitalize }}
{% assign theme_projects = site.projects | where: "theme", page.theme %}

All malaria projects will be listed here

{% for project in theme_projects %}
- [{{ project.name }}]({{project.url}})
{% endfor %}
