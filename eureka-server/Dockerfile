FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER chenshun 1539831174@qq.com
ADD target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]