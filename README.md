# MyFirstSpringBoot

//maven commands

mvn spring-boot:run

mvn spring-boot:stop

mvn dependency:tree

//to peek inside the jar

jar tvf target/myProject-0.01-SNAPSHOT.jar

//to run the jar file

java -jar target/myProject-0.0.1-jar

// to stop running port 

c:\>netstat -ano | find "8080"
 
TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       1196
     
TCP    [::]:8080              [::]:0                 LISTENING       1196
     
c:\>taskkill /F /PID 1196
     
SUCCESS: The process with PID 1196 has been terminated.


@SpringBootApplication is equivalent to 

@Configuration -

@EnableAutoConfiguration -

@ComponentScan -
