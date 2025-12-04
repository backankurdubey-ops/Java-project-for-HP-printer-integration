# HP Printer Java Integration

This project is a Java-based integration layer for HP printers.

## Goals

- Discover HP printers on the network
- Send print jobs programmatically
- Query printer status and health
- Serve as a base for integrating HP printer SDKs or APIs

## Tech Stack

- Java 17+
- Maven
- JUnit 5
- SLF4J for logging

## Project Structure

```text
hp-printer-java/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/com/hp/printer/PrinterService.java
│   │   └── resources/application.properties
│   └── test/
│       ├── java/com/hp/printer/PrinterServiceTest.java
│       └── resources/
└── README.md
