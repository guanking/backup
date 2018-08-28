import requests
import time
import sys
try:
    resp = requests.get("https://www.baidu.com", timeout = 0.1)
    print(resp.status_code)
    print(resp.text)
except:
    print("wrong")