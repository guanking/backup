import requests
import time
import sys

#登录
def login ():
    data = {"redirect": "", "username": "", "userpass": ""}
    try:
        resp = requests.post("http://", data=data)
    except:
        # print("login fail, exception occur")
        return False
    if 200 != resp.status_code:
        # print("login fail : " + str(resp.status_code))
        return False
    else:
        # print("login success")
        return True
#保活
def keepAlive(minutes = 5):
    data = {"username": ""}
    while 0 < minutes:
        minutes -= 1
        try:
            resp = requests.post(
                "http://",
                data=data)
        except:
            # print("keep alive fail, exception occur")
            return False
        if 200 != resp.status_code:
            # print("keep alive fail : " + str(resp.status_code))
            return False
        time.sleep(60)
    return True

#是否异常断开
def isAlive():
    try:
        resp = requests.get("https://www.baidu.com", timeout=0.1)
    except:
        # print("disconnect")
        return False
    if 200 == resp.status_code:
        return True
    else:
        # print("disconnect : " + str(resp.status_code))
        return False
#入口
def web_auth():
    alive = False
    while True:
        login()
        while isAlive():
            alive = keepAlive(1)
            if False == alive:
                break

if __name__ == '__main__':
    web_auth()