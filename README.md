# property-display
Based on example project https://github.com/joaoduraes/spring-bootstrap-thymeleaf-example with Spring Boot, Bootstrap and Thymeleaf.

For more info about base example read [this blog post](http://joaoduraes.github.io/2015/02/07/spring-bootstrap-thymeleaf-example.html).

Installation
--------------
* Clone this project
```sh
git clone https://github.com/hyj4ck/property-display.git
```

* Build Application
```sh
cd property-display
mvn clean install
cd target
java -jar property-display-1.0-SNAPSHOT.jar --props.path="/path/to/property-file.properties"
```

Try it
--------------
- Now open your browser: http://localhost:8080/

Tune it
--------------
- add some cmd params, most useful may be
    +  --server.port=9000 (default value = 8080)
    +  --server.address=my.listen.address (default value = localhost)
    +  full set cmd flags [here](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)

License
--------------
MIT
