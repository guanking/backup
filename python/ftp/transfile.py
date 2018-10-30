import login as lg
import os
g_ftp = None
g_local_dir = "/home/"


def download(files):
    global g_ftp
    if g_ftp is None:
        print("ftp closed")
        return
    f_len = len(files)
    buf_size = 1024
    for i in range(0, f_len):
        local_file = g_local_dir + files[i]
        fp = open(local_file, "wb")
        print("download %s" % files[i])
        data_len = 0

        def cb(data):
            nonlocal data_len
            data_len += fp.write(data)
            os.system("clear")
            print("download %s :%dB" % (files[i], data_len))

        g_ftp.retrbinary("RETR %s" % files[i], cb, buf_size)
        fp.close()


def upload(files):
    global g_ftp
    if g_ftp is None:
        print("ftp closed")
        return
    f_len=len(files)
    buf_size = 1024
    for i in range(0, f_len):
        file_remote = files[i]
        local_file = g_local_dir + files[i]
        fp = open(local_file, 'rb')
        print("upload %s" % files[i])
        g_ftp.storbinary('STOR %s' % file_remote, fp, buf_size)
        fp.close()

if __name__ == '__main__':
    print("transfile")
    lg.login()
    g_ftp = lg.g_ftp
    upload(["smb.conf"])
    # download(["smb.conf"])
    lg.login_out()
    print("finish")
