FROM java:8
ADD /build/libs/SpringBootwithJPAHibernate-1.0-SNAPSHOT.jar springbootwithjpahibernate-1.0-snapshot.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springbootwithjpahibernate-1.0-snapshot.jar"]


