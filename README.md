# BDD Cucumber Automation Framework

A robust, thread-safe test automation framework using Cucumber BDD, Java, Selenium WebDriver, and Maven, featuring Page Object Model, JSON-based data-driven testing, and rich HTML reporting.

### Prerequisites
- Java 11 installed and on PATH.
- Maven installed (3.6+ recommended).
- Chrome browser installed; included chromedriver.exe is referenced automatically.

### Features
- BDD with Cucumber and step definitions mapped to readable Gherkin scenarios.
- Page Object Model with central XPath locators for maintainability.
- ThreadLocal driver, properties, scenario, and data contexts for safe parallel runs.
- JSON test data auto-loaded by feature and scenario name per environment.
- HTML, JSON, and Maven Cucumber reporting; optional local Extent-like consolidated reports.
- Chrome WebDriver setup and maximized windows; pluggable browser strategy placeholder.
- Smart waits, scrolling, and mouse actions utilities.
- Screenshot capture and embedding into Cucumber reports for steps and assertions.

### Tech Stack

- Java 11 (configured via maven-compiler-plugin).
- Selenium Java 3.7.1.
- Cucumber 4.6.0 (core, java, junit).
- TestNG 7.7.1 (available as dependency).
- Maven with exec-maven-plugin and maven-cucumber-reporting.
- json-simple 1.1.1 and Jackson Databind 2.12.7.1 for data handling.

---

## Project Structure
├── .gitignore
├── README.md
├── driver
    └── chrome
    │   └── chromedriver.exe
├── pom.xml
└── src
    ├── main
        └── java
        │   └── org
        │       └── mks
        │           ├── actions
        │               ├── AssignmentActions.java
        │               ├── BaseActions.java
        │               └── GoogleSearchActions.java
        │           ├── applicationUtils
        │               ├── ProjectUtils.java
        │               ├── Reporting.java
        │               ├── Status.java
        │               └── WebDriverSession.java
        │           ├── pageObjects
        │               └── AssignmentPageObjects.java
        │           ├── runInitilization
        │               ├── DriverUtils.java
        │               └── Hooks.java
        │           ├── runner
        │               └── runner.java
        │           └── stepDef
        │               ├── AssignmentStepDef.java
        │               └── GoogleSearchStepDef.java
    └── test
        └── resource
            ├── config.properties
            ├── features
                ├── AssignmentTest.feature
                └── GoogleSearchTest.feature
            └── testData
                └── stage1
                    ├── AssignmentData.json
                    └── GoogleSearchData.json
Key files:
- pom.xml: Manages dependencies and plugins including reporting and execution.
- driver/chrome/chromedriver.exe: Bundled ChromeDriver binary for local runs.
- src/main/java/org/mks/runInitilization/runner.java: Entry point for executing tagged features via Cucumber CLI.
- src/test/resource/features: Gherkin feature files and tags.
- src/test/resource/testData/stage1: Environment-specific JSON data bound to scenarios.

---

## How It Works
### Lifecycle and Hooks

- Hooks.beforeScenario initializes Scenario context, loads properties, prepares per-scenario data, and creates a WebDriver.
- Hooks registers an optional JVM shutdown hook to generate local HTML reports if not running in Jenkins mode.
- Hooks.After closes and quits WebDriver after each scenario.

Sequence:
1. Load config.properties.
2. Resolve environment and feature/scenario names to locate JSON test data.
3. Initialize Chrome WebDriver and maximize the window. 
4. Execute steps; capture logs and screenshots into Scenario. 
5. Generate JSON and HTML outputs and optional aggregated reports.

### Configuration
config.properties (YAML-like key-value format):
browser: Chrome
env: stage1

- browser: Chrome, IE, or remote (placeholders exist; Chrome is implemented).
- env: Name of subfolder under testData used for scenario data resolution (e.g., stage1).

### Data-Driven Tests

- JSON file name is derived from feature name: FeatureNameTest.feature -> FeatureNameData.json.
- Scenario name selects the object block, and each action class gets its own data section.

Example: src/test/resource/testData/stage1/AssignmentData.json

## CI/CD Notes

- Default exec-maven-plugin setup is suitable for headless agents if Chrome and ChromeDriver are present or replaced with remote execution.
- maven-cucumber-reporting generates consolidated HTML in verify; ensure mvn verify is included in pipeline.
- Pass JVM or system properties for env/browser if extended to read from System.getProperty.
