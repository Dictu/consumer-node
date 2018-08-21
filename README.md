# consumer-node
TOOP node application based on TOOP Consumer principle.

# First of all #
This project depends on:
- JDK 9 (http://www.oracle.com/technetwork/java/javase/downloads/java-archive-javase9-3934878.html)
- Apache Maven 3x (https://maven.apache.org/)
- Lombok (https://projectlombok.org)

All three need to be installed, configured and running properly.

# Check out #
Use GIT clone to get a local copy of this repo.

# Configuration #
Before running check server.port inside:
./src/main/resources/application.properties
Also outgoing-proxy can be configured here (proxy is ignored when no value is given)

Note that additional providers must be configured using the property 'provider.service' as follows:
provider.services={NL:'http://localhost:8083/toopnode/provider/provide?id='}
More can be added using a ',' as seperator.

The application.properties can be placed next to the jar and it will be picked up automatically.

# Building #
You will need to build the toopapi project first!
Build using:
mvn clean install

# Running #
Run the application inside ./target/
java -jar <jar-name>.jar

# OR #
mvn spring-boot:run

# Browse to # 
TOOP Consumer URL:
http://localhost:<server.port>/toopnode/consumer/provide?country=NL&id=Grand%20Kontex%20B.V.
