# Test Automation Project for UI
# Cristian Camilo Reyes - Author

This project contains UI automation test cases  using Selenium and Cucumber,
with test data provided by an Excel file. The goal is to test the UI using dynamic data
read from an Excel and test the web application.

## Project structure

- `src/main/java`: Contains the main classes.
- `src/main/test/java/com/qa/tests`: The class with the tests cases
- `src/main/java/com/qa/util`: The class with apis URL and methods 
- `src/main/java/com/qa/testdata`: Contains the Excel file with the test data to consume the methods.
- `pom.xml`: Maven configuration file with project dependencies.

## Dependencies

The main dependencies of the project are:

- **Apache POI**: To read data from Excel files.
- **Selenium WebDriver**: For browser automation.
- **TestNG**: For the management and execution of tests.

## Configuration

1. **Install Maven**: Make sure you have Maven installed on your machine. You can download it from [Maven](https://maven.apache.org/).

2. **Clone Repository**: Clone this repository to your local machine.
   ```sh
   git clone https://github.com/cristianreyes10491/framework.git

3. To compile and run all the project, from terminal execute the command 'mvn clean test'

4. If you want to run only a specific set of tests or a particular test class, you can use the following command:

   mvn -Dtest=UserTest test