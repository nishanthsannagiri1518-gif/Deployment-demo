# Deployment-demo
practicing deployment

# Tomcat Demo (Maven WAR)

## Prerequisites
- JDK 11+
- Maven 3.8+
- Tomcat 9.x (javax.servlet). For Tomcat 10+, use the Jakarta variant below.
- SonarQube server and token
- Nexus repositories (releases/snapshots)

## Build & Test
```bash
mvn clean verify