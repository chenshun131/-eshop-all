# frolvlad/alpine-oraclejdk8:slim 也可以使用这个，体积非常小
FROM hub.c.163.com/library/java:8-alpine
MAINTAINER chenshun 1539831174@qq.com
ADD target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]