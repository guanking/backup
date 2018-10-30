import ftplib
g_cfg = {"username": "admin", "password": "admin", "host": ""}
g_ftp = None


def login():
    global g_cfg
    cfg = g_cfg
    ftp = ftplib.FTP(cfg["host"])
    ftp.login(cfg["username"], cfg["password"])
    cur_path = ftp.pwd()
    print("cur path:" + cur_path)
    global g_ftp
    g_ftp = ftp


def login_out():
    global g_ftp
    ftp = g_ftp
    ftp.quit()
    g_ftp=None

if __name__ == '__main__':
    print(g_cfg)
    print("open")
    login()
    g_ftp.dir()
    login_out()
    print("close")
