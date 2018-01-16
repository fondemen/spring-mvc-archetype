# spring-mvc-archetype
An extremely simple Spring MVC + Hibernate 4 archetype, configured with annotations.

This archetype is an enhanced version (fork of) co.ntier:spring-mvc-archetype:1.0.2.
Its goal, as the origin, is to provide a simple archetype to start a Spring MVC based project. Compared to co.ntier:spring-mvc-archetype:1.0.2, it uses a more recent version of Spring, explicitly adds a dependency to an application server (so far tomcat 7), and includes an example integration test.


## creating a project

Either use your favorite IDE or use the command line:
```
mvn archetype:generate \
  -DgroupId=test \
  -DartifactId=test \
  -DarchetypeGroupId=fr.uha.ensisa.ff \
  -DarchetypeArtifactId=spring-mvc-archetype \
  -DarchetypeVersion=1.0.3 \
  -DinteractiveMode=false
```
