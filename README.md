# intro to Spring Security

demo-project: ku.kinkao

## step-to-step

1. generate project from https://start.spring.io
2. setup `/src/main/resources/application.properties`
3. download `compiled CSS and JS` from https://getbootstrap.com
4. place the folders at [resources/static](src/main/resources/static) (+ reload pom.xml)
5. create Homepage ([templates/home.html](src/main/resources/templates/home.html))
   <!--run on vscode: ~/KinkaoApplication.java -> toolbar -> run -> run java -->
   > **test**: try run and visit http://localhost:8090/home -> redirect to login
6. create [config/SecurityConfig.java](src/main/java/ku/kinkao/config/SecurityConfig.java)
   > **test**: try run and visit http://localhost:8090/home -> redirect to homepage
7. create Restaurant MVC
   > **test**: try run and visit http://localhost:8090/restaurant -> not working
   - create [model/Restaurant.java](src/main/java/ku/kinkao/model/Restaurant.java)
   - create [repository/RestaurantRepository.java](src/main/java/ku/kinkao/repository/RestaurantRepository.java)
   - create [controller/RestaurantController.java](src/main/java/ku/kinkao/controller/RestaurantController.java)
   - create [templates/restaurant.html](src/main/resources/templates/restaurant.html)
8. create Member MVC (signup)
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
9. add Restaurant form
   - create []()