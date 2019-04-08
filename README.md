#  Mapstruct example


## Getting Started

To get you started you can simply clone the `mapstruct-example` repository and install the dependencies:

### Prerequisites

You need [git][git] to clone the `mapstruct-example` repository.

You will need [Java™ SE Development Kit 8][jdk-download] and [Maven][maven].

### Clone `mapstruct-example`

Clone the `mapstruct-example` repository using git:

```bash
git clone https://github.com/systelab/mapstruct-example.git
cd mapstruct-example
```

### Install Dependencies

In order to install the dependencies and generate the Uber jar you must run:

```bash
mvn clean install
```

### Run

To launch the server, simply run with java -jar the generated jar file.

```bash
cd target
java -jar mapstruct-example-1.0.jar
```

Or with the maven plugin:

```bash
mvn spring-boot:run
```


Head to http://localhost:8080 in order to see the Eureka Daskboard




[git]: https://git-scm.com/
[sboot]: https://projects.spring.io/spring-boot/
[maven]: https://maven.apache.org/download.cgi
[jdk-download]: http://www.oracle.com/technetwork/java/javase/downloads
[JEE]: http://www.oracle.com/technetwork/java/javaee/tech/index.html
[eureka]: https://github.com/Netflix/eureka
