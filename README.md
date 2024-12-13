# javaspring-test-mode
# create project on spring initializr https://start.spring.io/
# add depedency : lombok, jpa, postgresql, spring web
# create project on git
# import project using intelij
# copy file from spring initializr to project 
# add to git = git add . 
# commit = git commit -m "update"
# push = git push origin main
# add config to to your appliction properties
# mvn clean install to make sure that your environment compatible with pom xml
# for easy to user or make sure that api i create is true, i use swagger, you can see at config file
# swagger not available on spring initializr, so i put this code at pom xl
<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.9.2</version>
		</dependency>

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.9.2</version>
		</dependency>

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>3.0.0</version>
		</dependency>

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.9.2</version>
		</dependency>
# start create controller to call html form
# put the depedency for html
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>

# put java script to post data to url
# create controller api post and create service to process paraas from controller
# create message model for api respons