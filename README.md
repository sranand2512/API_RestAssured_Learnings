# API_RestAssured_Learning

This repository contains learning materials and practice code for API testing using RestAssured. It is designed to help you understand and implement various aspects of API testing with Java and RestAssured.

## Project Structure

API_RestAssured_Learning
├── .idea
├── allure-results
├── src
│ └── test
│ └── java
│ └── thetestingacadmy
├── test-output
├── .gitignore
├── pom.xml
├── testng266.xml
├── testng272.xml
└── README.md

markdown
Copy code

- **.idea**: Contains IntelliJ IDEA project configuration files.
- **allure-results**: Directory for storing Allure report results.
- **src/test/java/thetestingacadmy**: Contains test classes and test cases.
- **test-output**: Directory for storing test output and reports.
- **.gitignore**: Git ignore file to exclude certain files from being tracked in the repository.
- **pom.xml**: Maven project file, includes dependencies and plugins required for the project.
- **testng266.xml**: TestNG configuration file for running tests.
- **testng272.xml**: Another TestNG configuration file for running tests.

## Getting Started

To get started with this project, follow the steps below:

### Prerequisites

- Java 8 or higher
- Maven
- IntelliJ IDEA or any other IDE

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/sranand2512/API_RestAssured_Learning.git
Navigate to the project directory:

bash
Copy code
cd API_RestAssured_Learning
Build the project using Maven:

bash
Copy code
mvn clean install
Running Tests
You can run the tests using the TestNG XML files provided in the project:

bash
Copy code
mvn test -DsuiteXmlFile=testng266.xml
or

bash
Copy code
mvn test -DsuiteXmlFile=testng272.xml
Generating Reports
To generate Allure reports, follow these steps:

Run the tests to generate the Allure results.

Generate the Allure report:

bash
Copy code
allure serve allure-results
Contributing
Contributions are welcome! Please fork this repository and create a pull request with your changes. Make sure to update tests as appropriate.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
If you have any questions or suggestions, feel free to reach out to me:

GitHub: sranand2512
LinkedIn: Saurabh Kumar
yaml
Copy code

---

You can now copy this entire content and paste it into your README.md file.