import requests
import time
import sys
ip_range = "10.1.1"
def connect(index):
    try:
        resp = requests.get(
            "http://" + ip_range + "." + str(index) +
            "/func/web_main/validate?web_login_conf=",
            timeout=0.1)
    except:
        return False
    if 200 != resp.status_code:
        return False
    resp.encoding="utf-8"
    return resp.text

def find_dev(lower, upper, badge="UAG3000"):
    result = ""
    badge = badge.lower()
    for index in range(lower, upper):
        print("http://" + ip_range + "." + str(index), end="")
        t = connect(index)
        if False == t:
            print("\tdisconnected")
            continue
        t = t.lower()
        if -1 != t.find(badge):
            print("\tsuccess")
            result += "\thttp://" + ip_range + "." + str(index) + "\n"
        else:
            print("\tnot valid")
    return result

if __name__ == '__main__':
    result = find_dev(0, 254)
    print("\n===============Result===============\n")
    if 0 == len(result):
        print("\nNot Find!")
    else:
        print(result)
    print("====================================\n")