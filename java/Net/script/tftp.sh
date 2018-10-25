#!/bin/sh

ARG_LEN=$#
USAGE="USAGE:\n\t./tftp.sh compile|run"
if [ ${ARG_LEN} -lt 1 ] 
then
    echo -e ${USAGE}
    exit
fi
PROJECT_DIR=$(pwd)/..
cd ${PROJECT_DIR}
PROJECT_DIR=$(pwd)
MAIN_CLASS=tftp.Client
SOURCE_PATH=${PROJECT_DIR}/src
CLASS_PATH="${PROJECT_DIR}/lib/commons-net-3.6/commons-net-3.6.jar"
OUT_DIR="${PROJECT_DIR}/bin"
JAVA_FILES="${PROJECT_DIR}/src/tftp/*.java"
cd ${PROJECT_DIR}
echo PROJECT_DIR    :   $(pwd)
echo SOURCE_PATH    :   ${SOURCE_PATH}
case ${1} in
    "compile")
        COMPILE="javac -classpath ${CLASS_PATH} -verbose -d ${OUT_DIR} -sourcepath ${SOURCE_PATH} ${JAVA_FILES}"
        echo COMPILE    :   ${COMPILE}
        ${COMPILE}
        break
    ;;
    "run")
        ARGS="-r 10.121.51.33 smb.conf smb.conf"
        RUN="java -classpath ${CLASS_PATH}:${OUT_DIR} ${MAIN_CLASS} ${ARGS}"
        echo RUN    :   ${RUN}
        ${RUN}
        break
    ;;
    *)
        echo -e ${USAGE}
    ;;
esac

