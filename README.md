✨Key Features✨:
==================
-Hybrid & Data-Driven: Combines TestNG with data from Excel sheets for flexible testing.
-Page Object Model (POM): Organizes code for better readability and maintenance.
-Centralized WebDriver: Manages browser instances efficiently with a Singleton Factory.
-Centralized Config: Config.properties stores browser and application credentials.
-Dynamic Data Handling: Passes Excel data to tests using TestNG's @DataProvider.
-Reusable Actions: ElementAction interface and ElementActionImpl class eliminate redundancy for common web element interactions, including date pickers, pop-ups, and alerts.
-Smart Waits: Uses explicit waits for stable element interactions.
-Utility Functions: Provides methods for generating random test data.
-Auto Screenshots: Captures and attaches screenshots to reports upon test failures.
-TestNG Assertions: Uses TestNG's built-in assertions for validation.
-Object Initialization: A dedicated class initializes POM pages and test case instances.
-Cross-Browser & Headless: Supports various browsers, including a faster headless mode.
-Parallel Execution: Configured to run tests in parallel, speeding up execution.
-Rich Reporting: Generates detailed Extent Reports with timestamps.
-Flexible Logging: Uses Log4j for comprehensive console and file logging.
-Simple Execution: A .bat file simplifies running tests from the project root.
------------------------------------------------------------------------------------------------------------------------------------

⚙️Technologies Used⚙️:
=========================
-Java Development Kit (JDK): v21
-Selenium WebDriver: v4.32.0
-TestNG: v7.11.0
-AspectJ Weaver: v1.9.22
-Apache POI & POI-OOXML: v5.4.1
-Apache Log4j API & Core: v2.24.3
-ExtentReports: v5.1.2
-Apache Maven: v3.9.9
------------------------------------------------------------------------------------------------------------------------------------

🚀 Getting Started:
=======================
Prerequisites
---------------
-JDK 21 installed and configured.
-Apache Maven 3.9.9 installed and configured.
-Compatible browser drivers (e.g., ChromeDriver) set up.
-

✨How to Run Tests
---------------------------
Clone the repository:   git clone <current-repository-url>
Navigate to the project root: cd <your-project-directory>
-
✨Execute tests:
------------------
Using the batch file: run_tests.bat
Using Maven: mvn clean install then mvn test
-
✨Reports & Logs
------------------
Test Reports: Find detailed Extent Reports in the reports folder.
Logs: Check the logs directory and console for Log4j output.
-

🤝 Contribution
==========================
-Feel free to explore, use, and contribute to this framework.

Developed by: [Gangadhar/Gangadhar2821]
============================================
