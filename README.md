# intro to Spring Security

demo-project: ku.kinkao

## step-to-step

1. setup project env

    - generate project from https://start.spring.io
    - setup `/src/main/resources/application.properties`

2. setup bootstrap

    - download `compiled CSS and JS` from https://getbootstrap.com
    - place the folders at [resources/static](src/main/resources/static) (+ reload pom.xml)

3. create Homepage ([templates/home.html](src/main/resources/templates/home.html))

   <!--run on vscode: ~/KinkaoApplication.java -> toolbar -> run -> run java -->

   > **test**: try run and visit http://localhost:8090/home -> redirect to login

4. create [config/SecurityConfig.java](src/main/java/ku/kinkao/config/SecurityConfig.java)

   > **test**: try run and visit http://localhost:8090/home -> redirect to homepage

5. create Restaurant MVC

   > **test**: try run and visit http://localhost:8090/restaurant -> not working

    - create [model/Restaurant.java](src/main/java/ku/kinkao/model/Restaurant.java)
    - create [repository/RestaurantRepository.java](src/main/java/ku/kinkao/repository/RestaurantRepository.java)
    - create [controller/RestaurantController.java](src/main/java/ku/kinkao/controller/RestaurantController.java)
    - create [templates/restaurant.html](src/main/resources/templates/restaurant.html)

6. create Member MVC (signup)

   > **test**: try run and visit:
   >
   > - http://localhost:8090/restaurant -> redirect to login
   > - http://localhost:8090/signup -> redirect to signup
   > - http://localhost:8090/restaurant after login -> redirect to restaurant
   > - http://localhost:8090/logout -> redirect to logout
   > - http://localhost:8090/h2-console -> redirect to login page to H2 database

    - create [controller/SignupController.java](src/main/java/ku/kinkao/controller/SignupController.java)
    - create [model/Member.java](src/main/java/ku/kinkao/model/Member.java)
    - create [repository/MemberRepository.java](src/main/java/ku/kinkao/repository/MemberRepository.java)
    - create [service/SignupService.java](src/main/java/ku/kinkao/service/SignupService.java)
    - create [service/UserDetailsServiceImp.java](src/main/java/ku/kinkao/service/UserDetailsServiceImp.java)
    - create [templates/signup.html](src/main/resources/templates/signup.html)
    - modify [config/SecurityConfig.java](src/main/java/ku/kinkao/config/SecurityConfig.java)

7. add Restaurant form

   > **test**: try run and visit http://localhost:8090/restaurant/add after login

    - create [templates/restaurant-add.html](src/main/resources/templates/restaurant-add.html)
    - modify [controller/RestaurantController.java](src/main/java/ku/kinkao/controller/RestaurantController.java)

8. add Navigation bar

    - create [templates/fragments/header.html](src/main/resources/templates/fragments/header.html)
    - modify others html in [/templates](src/main/resources/templates))

9. custom Login page (replace the default page)

   > **test**: try run and visit http://localhost:8090/login

    - create [controller/AuthController.java](src/main/java/ku/kinkao/controller/AuthController.java)
    - create [templates/login.html](src/main/resources/templates/login.html)
    - modify [config/SecurityConfig.java](src/main/java/ku/kinkao/config/SecurityConfig.java)

10. add login with GitHub (SSO with OAuth)

    - add OAuth dependency (spring-boot-starter-oauth2-client) to `pom.xml`
    - add Github OAuth app -> [here](https://github.com/settings/applications/new)
        - Authorization callback URL : `http://localhost:8090/login/oauth2/code/github`
    - modify [application.properties](src/main/resources/application.properties)
    - modify [config/SecurityConfig.java](src/main/java/ku/kinkao/config/SecurityConfig.java)
    - create [config/UserServicesConfiguration.java](src/main/java/ku/kinkao/config/UserServicesConfiguration.java)
    - modify [config/SecurityConfig.java](src/main/java/ku/kinkao/config/SecurityConfig.java)
    - modify [templates/login.html](src/main/resources/templates/login.html)

11. add login with Google

    - add Google OAuth project -> [here](https://console.developers.google.com/apis/dashboard)
        - OAuth consent screen: Internal
        - then go to Credentials to get client keys
        - Authorized redirect URIs: `http://localhost:8090/login/oauth2/code/google`
    - modify [application.properties](src/main/resources/application.properties)
    - modify [templates/login.html](src/main/resources/templates/login.html)

12. connect to MySQL

    - add MySQL dependency (mysql-connector-j) to `pom.xml`
    - modify [application.properties](src/main/resources/application.properties)
    - run
      docker `docker run --name=mysql_kinkao -e MYSQL_ROOT_PASSWORD=abc123 -e MYSQL_DATABASE=restaurant -p 3307:3306 -d mysql`
    - add Lombok dependency and dependency configuration to `pom.xml`
    - modify [model/Restaurant.java](src/main/java/ku/kinkao/model/Restaurant.java)
    - modify [model/Member.java](src/main/java/ku/kinkao/model/Member.java)
    - modify [repository/RestaurantRepository.java](src/main/java/ku/kinkao/repository/RestaurantRepository.java)
    - modify [repository/MemberRepository.java](src/main/java/ku/kinkao/repository/MemberRepository.java)

13. Separating Transmission Data (DTO) and Database Data (DAO)

    - add Model Mapper dependency (modelmapper) to `pom.xml`
    - create [config/ComponentConfig.java](src/main/java/ku/kinkao/config/ComponentConfig.java)
    - create [dto/RestaurantDto.java](src/main/java/ku/kinkao/dto/RestaurantDto.java)
    - create [dto/SignupDto.java](src/main/java/ku/kinkao/dto/SignupDto.java)
    - create [service/RestaurantService.java](src/main/java/ku/kinkao/service/RestaurantService.java)
    - modify [model/Member.java](src/main/java/ku/kinkao/model/Member.java)
    - modify [model/Restaurant.java](src/main/java/ku/kinkao/model/Restaurant.java)
    - modify [SignupController.java](src/main/java/ku/kinkao/controller/SignupController.java)
    - modify [RestaurantController.java](src/main/java/ku/kinkao/controller/RestaurantController.java)
    - modify [RestaurantRepository.java](src/main/java/ku/kinkao/repository/RestaurantRepository.java)
    - modify [service/SignupService.java](src/main/java/ku/kinkao/service/SignupService.java)

14. Check user's input

15. Check user's email

16. Check password

17. Adding roles to user data

    - [demo-project-3](https://github.com/KU-SKE17/book)