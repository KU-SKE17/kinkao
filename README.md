# intro to Spring Security

demo-project: ku.kinkao

## step-to-step

1. generate project from https://start.spring.io
2. setup `/src/main/resources/application.properties`
3. download `compiled CSS and JS` from https://getbootstrap.com
4. place the folders at [resources/static](src/main/resources/static) (+ reload pom.xml)
5. create [templates/home.html](src/main/resources/templates/home.html)
   > **test**: try run and visit http://localhost:8090/home -> redirect to login
6. create [config/SecurityConfig.java](src/main/java/ku/kinkao/config/SecurityConfig.java)
   > **test**: try run and visit http://localhost:8090/home -> redirect to homepage
