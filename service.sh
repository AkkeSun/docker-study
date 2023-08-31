#!/bin/bash
SERVICE_NAME=docker-project

case $1 in
    start)
      echo "Starting $SERVICE_NAME ..."
      cd ./application
      ./gradlew build
      cd ..
      docker-compose up -d
      echo "$SERVICE_NAME started ..."
    ;;
    build)
        echo "Build and Starting $SERVICE_NAME ..."
        cd ./application
        ./gradlew build
        cd ..
        docker-compose down
        docker rmi mariadb
        docker rmi dockerstudy-api
        docker-compose up -d --build
        echo "$SERVICE_NAME Build and started ..."
      ;;
    stop)
      echo "$SERVICE_NAME stoping ..."
      docker-compose down
      echo "$SERVICE_NAME stopped ..."
    ;;
esac