# What is Apache Maven ?
Apache Maven is a Java-based project management tool. It's simplifying the development.
Includes Project Object Model known as pom.xml for builds and managing the dependencies.
## Maven Logic
- Read the config pom.xml
- Find the dependencies on m2
- If the dependency does not exist, download the dependency from the Maven repository.
## Maven directory layout
- src/main/java: Java Command etc.
- src/main/resource: Config files
- src/main/webapp: JSP, JSF etc. (WEB-INF and Meta-INF)
- src/test: Unit tests
- /target: The compiled Java package is held in here.

## What we'll see on the POM XML config file
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!-- The XML version is specified as 1.0 and the character encoding is set to UTF-8,
     which supports international character representation. -->
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <!-- Specifies the version of the Project Object Model (POM). 
         Maven 2.x and 3.x use the 4.0.0 model. -->
    <modelVersion>4.0.0</modelVersion>

    <!-- Unique identifiers for the project. -->
    <groupId>com.ibb.bootcamp</groupId> <!-- The package name, often similar to a domain name. -->
    <artifactId>ibb_java_core_se</artifactId> <!-- The name of the project. -->
    <version>1.0-SNAPSHOT</version> <!-- SNAPSHOT indicates a development  semantic version. -->

    <!-- The project URL is left empty. A documentation link can be added if needed. -->
    <url/>

    <!-- License information. The project's license should be specified here. -->
    <licenses>
        <license/>
    </licenses>

    <!-- Developer information. Contributors' details can be added here. -->
    <developers>
        <developer/>
    </developers>

    <!-- Source Control Management (SCM) details. Git repository links can be specified here. -->
    <scm>
        <connection/>
        <developerConnection/>
        <tag/>
        <url/>
    </scm>

    <!-- Configuration properties for the project. -->
    <properties>
        <encoding>UTF-8</encoding> <!-- Default character encoding. -->
        <java.version>17</java.version> <!-- The Java version used in the project. -->

        <!-- Maven configuration properties. -->
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <!-- MySQL JDBC driver dependency for database connection. -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.28</version>
        </dependency>

        <!-- Lombok library to reduce boilerplate code. 
             "provided" scope ensures it's only used during compilation and not included at runtime. -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.24</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>

    <build>
        <!-- Default goal to run the Spring Boot application. -->
        <defaultGoal>spring-boot:run</defaultGoal>

        <!-- The generated JAR file name will match the artifactId. -->
        <finalName>${project.artifactId}</finalName>

        <plugins>
            <!-- Maven Compiler Plugin: Defines the Java version for compilation. -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.13.0</version>
                <configuration>
                    <source>17</source> <!-- Ensures consistency with the project's Java version. -->
                    <target>17</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>

```

## We must know the Maven commands.
- mvn install: Installing the packages to the m2
- mvn clean: cleaning the build
- mvn test: running the test
- mvn compile: combined clean and validate commands.
- mvn package: Turn into the package
- mvn site: Generating the site doc.

<b>The end.</b>