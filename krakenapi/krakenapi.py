import requests
import json
from pprint import pprint

pairData = requests.get("https://api.kraken.com/0/public/ticker?pair=XBTUSD")
pairDataJson = json.loads(pairData.content)
pprint(pairDataJson)
