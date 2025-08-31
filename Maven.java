/**
 * Maven is a tool that can be used for building and managing any Java-based project.

Maven helps in the following ways:

Simplifies the build process
Adding jars and dependencies
Documenting project information with change logs and reports
Integration with source control systems (Git)
Features of Maven that we will go over:

Project Object Model (POM)
Maven lifecycles

 */

/*
 * Maven is a dependency manager and build automation tool for Java programs. Maven project 
 * configuration and dependencies are handled via the Project Object Model, defined in the 
 * pom.xml file. This file contains essential project information such as dependencies and plugins
 * required for building the project.
 * 
 * Maven identifies projects through project coordinates defined in the pom.xml file - these are:

<groupId> - for example: "com.revature"
<artifactId> - for example: "myproject"
<version> - for example: "0.0.1-SNAPSHOT"
Together, these uniquely identify a specific version of a program.

Some other important tags within the pom.xml file include:

<project> - this is the root tag of the file
<modelVersion> - defining which version of the page object model to be used
<name> - name of the project
<properties> - project-specific settings
<dependencies> - this is where you put your Java dependencies you want to use. 
Each one needs a <dependency>, which has:
<groupId>
<artifactId>
<version>
<plugins> - for 3rd party plugins that work with Maven
 */

/*
 * <project>
  <modelVersion>4.0.0</modelVersion>
 
  <groupId>com.revature.app</groupId>
  <artifactId>my-app</artifactId>
  <version>1</version>
  
  <dependencies>
    <dependency>
      <groupId>org.apache.maven</groupId>
      <artifactId>maven-artifact</artifactId>
      <version>${mavenVersion}</version>
    </dependency>
    <dependency>
      <groupId>org.apache.maven</groupId>
      <artifactId>maven-core</artifactId>
      <version>${mavenVersion}</version>
    </dependency>
  </dependencies>

</project>
 */


/*
 * When Maven builds your project, it goes through several steps called phases. The default maven build lifecycle goes through the following phases:

Validate => project is correct and all necessary information is available
Compile => compiles project source code
Test => tests all compiled code
Package => packages all compiled code to WAR/JAR file
Integration => performs all integration tests on WAR/JAR
Verify => runs any checks on the results of integration tests
Install => installs WAR/JAR to local repository
Deploy => copies final WAR/JAR to the remote repository
Each phase in turn is composed of plugin goals that are bound to zero or more build phases.
 A "goal" represents a specific task which contributes to the building or managing of the project.
 */

/*
 * One significant feature of Maven is its integration with various plugins that extend its functionality.
 * These plugins enable tasks such as generating documentation, deploying artifacts to 
 * repositories, and performing code quality analysis.

Code coverage is a metric used to measure the percentage of code that is executed during automated
testing. It helps assess the effectiveness of test suites by identifying areas of code that have
not been tested. Code coverage tools analyze the relationship between the executed code and the 
source code to generate reports indicating the coverage percentage.

Maven integrates seamlessly with code coverage tools such as JaCoCo (Java Code Coverage) and 
Cobertura. These tools can be configured as Maven plugins to generate code coverage reports
during the build process. By adding code coverage plugins to the Maven project configuration, 
developers can automatically generate detailed reports showing which parts of the codebase are
covered by unit tests.
 */