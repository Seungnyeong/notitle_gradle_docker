# notitle_gradle_docker
Docker + gradle + spring boot

그래들 빌드 practice

~~~~
Before Launch
SPRING_PROFILES_ACTIVE=core gradle clean bootRun -Pprofile=prod
#! dev
SPRING_PROFILES_ACTIVE=core gradle clean bootRun
Dockerfile 빌드
$docker build -t latest . && docker run -p 9988:9988 --name notitle latest 
