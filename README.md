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
~~~~
`젠킨스 배포시 순서`
 * 젠킨스 최신 버전 설치 후 플러그인 설치 
 * JDK Installation(ORACLE Account!) , GITHUB (github account!)
 
 <u>젠킨스와 호스트 도커 데몬 소켓 연결</u>  
`docker run -p 8080:8080 -p 50000:50000 -v /var/run/docker.sock:/var/run/docker.sock --name jenkinsWithDocker jenkins/jenkins:lts`

프로젝트 구성에서 Use Gradle Wrapper 
~~~~
Wrapper location ./
Tasks clean bootWar -Pprofile=prod
프로파일 형태로 개발 서버별로 배포
~~~~
도커가 연결되었다면 확인 후에 
<h3>Excute shell</h3
command
<br>`docker stop notitle // 해당이름으로 이미 만들어진 컨테이너가 있다면 `
<br>`docker container rm notitle`
<br>`docker build -t notitle:latest . && docker run -itd -p 9988:9988 --name notitle notitle:latest`
도커를 백그라운드로 올려 젠킨스 빌드과정을 끝낸다.
