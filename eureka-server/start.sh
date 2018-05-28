#!/usr/bin/env bash
mvn clean package -Dmaven.test.skip=true -U
# 上传者用户名
pushName=chenshun131
# 项目名
projectName=springcloud
# 获取项目名
name=`awk '/<name>[^<]+<\/name>/{gsub(/<name>|<\/name>/,"",$1);print $1;exit;}' pom.xml`
# 获取 maven 版本号
version=`awk '/<version>[^<]+<\/version>/{gsub(/<version>|<\/version>/,"",$1);print $1;exit;}' pom.xml`
# 在本地创建镜像
docker build -f Dockerfile  -t ${projectName}-${name}:${version} .
# 将镜像打上 Tag 名
docker tag ${projectName}-${name}:${version} hub.c.163.com/${pushName}/${projectName}-${name}:${version}
docker push hub.c.163.com/${pushName}/${projectName}-${name}:${version}