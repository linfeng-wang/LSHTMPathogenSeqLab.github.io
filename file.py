import json
from urllib.parse import urlsplit, parse_qsl
from serpapi import GoogleSearch
import pandas as pd
import schedule
import time
import os


os.system("git add _data/publications.json")

# Commit the changes with a message
commit_msg = "Update every friday publications data"
os.system(f'git commit -a -m "{commit_msg}"')


# Push the changes to Github
os.system("git push")