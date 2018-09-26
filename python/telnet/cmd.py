import telnetlib
host, port = [("10.121.215.4", 10027)][0]
cmd = {
    "10027": {
        "get": [
            "cd /usr/local/web/htdocs/xsl/terminal_manage",
            "tftp -pl mbt_policy.xsl 10.121.215.131",
            "tftp -pl sht_policy.xsl 10.121.215.131",
            "cd /usr/local/web/device/terminal_manage",
            "tftp -pl mbt_policy.xml 10.121.215.131",
            "tftp -pl sht_policy.xml 10.121.215.131"
        ],
        "put": [],
        "cmd": []
    }
}["10027"]["get"]
view = [{
    "user": "<DPTECH>",
    "conf": "[DPTECH]",
    "dev": "[DPTECH-Developer]",
    "shell": "[DPTECH-Developer-Shell]"
}][0]
b_view = {}
#进入shell的命令
shell_cmd = b"\n"


def cmd_shell(host, port):
    # 打开连接
    tn = telnetlib.Telnet(host, port)
    rtns = []
    # 进入shell
    tn.write(b"\n")
    rtn = tn.read_some()
    rtns.append(rtn)
    rtn = bytes.decode(rtn)
    if view["user"] in rtn:
        tn.write(shell_cmd)
        rtn = tn.read_until(b_view["shell"])
        rtns.append(rtn)
    elif view["conf"] in rtn:
        tn.write(b"exit\n")
        rtn = tn.read_until(b_view["user"])
        rtns.append(rtn)
        tn.write(shell_cmd)
        rtn = tn.read_until(b_view["shell"])
        rtns.append(rtn)
    elif view["dev"] in rtn:
        tn.write(b"exit\nexit\n")
        rtn = tn.read_until(b_view["user"])
        rtns.append(rtn)
        tn.write(shell_cmd)
        rtn = tn.read_until(b_view["shell"])
        rtns.append(rtn)
    elif view["shell"] in rtn:
        pass
    else:
        print("unknow view type : " + rtn)
        tn.close()
        return
    # 执行命令
    for index in range(len(cmd)):
        tn.write(str.encode(cmd[index]) + b"\n")
        rtn = tn.read_until(b_view["shell"])
        rtns.append(rtn)
    # 关闭连接
    tn.close()
    print(
        "\n\n===============================Terminal Window==================================="
    )
    out_put = "connect to " + host + ":" + str(port) + "\n"
    for index in range(len(rtns)):
        out_put += bytes.decode(rtns[index])
    out_put += "\n\nclose"
    print(out_put)
    print(
        "================================================================================="
    )


def main():
    for key in view:
        b_view[key] = str.encode(view[key])
    print("connect to " + host + ":" + str(port))
    cmd_shell(host, port)


if __name__ == '__main__':
    main()
