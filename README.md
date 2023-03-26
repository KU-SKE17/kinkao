# intro to Spring Security

demo-project: ku.kinkao

## step-to-step

1. generate project from https://start.spring.io
2. setup `/src/main/resources/application.properties`
3. download `compiled CSS and JS` from https://getbootstrap.com
4. place the folders at [resources/static](src/main/resources/static) (+ reload pom.xml)
5. create [templates/home.html](src/main/resources/templates/home.html)
   <!--run on vscode: ~/KinkaoApplication.java -> toolbar -> run -> run java -->
   > **test**: try run and visit http://localhost:8090/home -> redirect to login
6. create [config/SecurityConfig.java](src/main/java/ku/kinkao/config/SecurityConfig.java)
   > **test**: try run and visit http://localhost:8090/home -> redirect to homepage
7. create [model/Restaurant.java](src/main/java/ku/kinkao/model/Restaurant.java)
8. create [repository/RestaurantRepository.java](src/main/java/ku/kinkao/repository/RestaurantRepository.java)
9. create [controller/RestaurantController.java](src/main/java/ku/kinkao/controller/RestaurantController.java)
10. create [templates/restaurant.html](src/main/resources/templates/restaurant.html)
