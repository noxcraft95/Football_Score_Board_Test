# Project FootBall Score Test

# Description:
 FootBall Board Score Test is a Spring-MVC project created as an example and test.
 It consists of a scoreboard for World Cup football matches. Matches are added by clicking the "New Match" button, selecting the teams, and generating a random result when the match is finished.
 To end a match, click the "End Match" button. The lower table displays match summaries ordered by the number of goals scored in descending order (from the most to the fewest total goals).
 
# Dependencies:
* Spring Core: 5.3.9 Provides core Spring framework features such as dependency injection and inversion of control.

* Spring Context: 5.3.9 Builds on spring-core to provide advanced configuration and lifecycle management features for Spring-based applications.

* Spring Transaction: 3.2.5.RELEASE Provides support for transaction management in Spring-based applications.

* Spring Web MVC: 5.3.9 Provides the Model-View-Controller (MVC) framework for building web applications in Spring.

* Spring Test: 3.2.5.RELEASE  provides testing support for Spring-based applications.

* JSTL: 1.1.2  provides tag libraries for JSP pages to help display dynamic content and interact with JavaBeans components

* JSP Standard Tag Library (JSTL): 1.1.2 a standard set of tags for common tasks such as iterating over collections and conditional logic, which can simplify JSP page development.

* ASM: 7.0 a Java bytecode manipulation library that can be used to dynamically generate classes, modify existing classes, and do other bytecode-related tasks.

* Java Servlet API: 4.0.1 a standard Java API for interacting with HTTP requests and responses in web applications.

* Java Servlet JSP API: 2.3.3 (provided scope) provides the interfaces and classes for the JavaServer Pages (JSP) technology, which allows for dynamic generation of HTML pages based on Java code. The "provided" scope means that this dependency is expected to be provided by the web container at runtime.

# Configuration:
 
This project is based on Spring-MVC, and for environment installation and configuration, JDK version 11 and Apache Tomcat version 9 are required. 
Once these requirements are met, the next steps include importing the Maven project to the IDE, configuring the Java version, compiling the project, and adding it to the Apache Tomcat server.

# Access:
Once you have been configured the project and start up tomcat you can access in http://localhost:8080/Football_Score_Board_Test/  (Apache tomcat has as default port 8080, but you can change it.)