
# 이미지를 만드는데 사용될 Docker Hub 이미지명
FROM openjdk:8-jdk-alpine

# 변수 지정
ARG JAR_FILE=build/libs/docker-study-0.0.1-SNAPSHOT.jar

# 이미지 생성시 실행할 명령어 작성
RUN mkdir /data
RUN mkdir /data/application

# Docker 이미지 내 작업 위치 선언 (미선언시 root에서 작업 수행)
WORKDIR /data/application

# 로컬 서버에 있는 파일을 컨테이너 내부로 복사 (로컬서버경로 컨테이너 경로)
# WORKDIR 를 선언했으므로 /data/application/app.jar 가 생성된다
COPY ${JAR_FILE} app.jar

# 호스트와 연결할 포트번호
EXPOSE 8080

# 컨테이너 볼륨 지정 (Docker run 시 해당 볼륨을 연결하면 된다)
# /data/application/log
#VOLUME log

# 컨테이너 시작시 실행할 스크립트 작성
ENTRYPOINT ["java","-jar","/data/application/app.jar"]