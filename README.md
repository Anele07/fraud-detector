Fraud Detection System

Overview
A rule-based fraud detection system that evaluates financial transactions using a configurable risk scoring engine.

Features
-Rule-based fraud detection (Strategy Pattern)
-Risk scoring system (not just binary decisions)
-SQLite database persistence (JDBC)
-Unit testing with JUnit
-Clean, modular architecture

How It Works
Each transaction is evaluated against multiple fraud rules:

-Large transaction detection
-(Extendable for more rules)

Each rule contributes to a risk score, and the system determines whether a transaction is fraudulent based on the total score.

Tech Stack
-Java
-Maven
-SQLite (JDBC)
-JUnit

How to Run
1. Clone the repo
2. Open in IntelliJ
3. Run Main.java

Running Tests
Run tests from IntelliJ or:
mvn test

Future Improvements
-Add REST API (Spring Boot)
-Add more fraud rules (time/location-based)
-Add frontend dashboard

Key Learnings
-Implementing Strategy Pattern for scalability
-Designing rule-based systems
-Separating business logic from data access
-Writing unit tests for reliability