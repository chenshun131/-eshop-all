#!/usr/bin/env bash
mvn clean package -Dmaven.test.skip=true -U
if [ $? -ne 0 ]
then
  # maven 编译项目出现异常
  echo "maven compile failed"
  exit 1
fi

# 上传者用户名
pushName=chenshun131
# 项目名
projectName=springcloud
# 远端服务器地址
serverURL=hub.c.163.com

# 获取 maven 中的项目名
name=`awk '/<name>[^<]+<\/name>/{gsub(/<name>|<\/name>/,"",$1);print $1;exit;}' pom.xml`
# 获取 maven 中的版本号
version=`awk '/<version>[^<]+<\/version>/{gsub(/<version>|<\/version>/,"",$1);print $1;exit;}' pom.xml`
# 先删除可能已经存同名镜像
docker rmi ${projectName}-${name}:${version}
echo "start build docker image[${projectName}-${name}:${version}]"
# 在本地创建镜像
docker build -f Dockerfile -t ${projectName}-${name}:${version} .
if [ $? -ne 0 ]
then
  # 构建 Docker 镜像失败
  echo "build docker image[${projectName}-${name}:${version}] fail"
  exit 1
fi

# 将镜像打上 Tag 名
docker tag ${projectName}-${name}:${version} ${serverURL}/${pushName}/${projectName}-${name}:${version}
# 推送到远端服务器
docker push ${serverURL}/${pushName}/${projectName}-${name}:${version}
echo "build and push docker image[${projectName}-${name}:${version}] success!"