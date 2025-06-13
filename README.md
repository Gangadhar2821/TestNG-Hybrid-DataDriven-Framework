# 🧪 TestNG-Hybrid-DataDriven-Framework

![Java](https://img.shields.io/badge/java-21-blue)
![Maven](https://img.shields.io/badge/maven-3.9.9-orange)

A robust and scalable hybrid automation framework combining **TestNG**, **Selenium**, and **Apache POI**, supporting **data-driven testing** using Excel and structured with the **Page Object Model (POM)** design. Ideal for both small and enterprise-level test suites.

---

## ✨ Key Features

- ✅ **Hybrid & Data-Driven**: TestNG + Excel integration for flexible test inputs.
- ✅ **Page Object Model (POM)**: Organized and maintainable code structure.
- ✅ **Centralized WebDriver**: Managed via Singleton Factory for efficiency.
- ✅ **Configuration Management**: `config.properties` stores all configurable parameters.
- ✅ **Dynamic Data Injection**: Uses `@DataProvider` for Excel-driven data input.
- ✅ **Reusable Actions**: Interfaces and implementations for UI interactions like pop-ups, date pickers, etc.
- ✅ **Smart Waits**: Explicit wait strategy ensures stability.
- ✅ **Utility Functions**: Custom helpers for random data generation.
- ✅ **Auto Screenshots**: Captured on failure and saved under `/errorshots`.
- ✅ **Assertions**: Uses TestNG’s assertion mechanisms.
- ✅ **Cross-Browser & Headless Execution**
- ✅ **Parallel Test Execution**
- ✅ **Rich Extent Reports with Timestamps**
- ✅ **Log4j Logging**
- ✅ **Easy CLI Execution** via `run_tests.bat`

---

## ⚙️ Technologies Used

| Tool / Library             | Version   |
|---------------------------|-----------|
| Java                      | 21        |
| Selenium WebDriver        | 4.32.0    |
| TestNG                    | 7.11.0    |
| Apache POI (Excel)        | 5.4.1     |
| Apache Log4j              | 2.24.3    |
| AspectJ Weaver            | 1.9.22    |
| ExtentReports             | 5.1.2     |
| Apache Maven              | 3.9.9     |

---

## 📁 Project Structure

```text
Cogmento-CRM-Web/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── cogmentoCRM.Web.*
│   │   │       ├── base/           # Base classes (e.g., DriverFactory)
│   │   │       ├── actions/        # Reusable action layer
│   │   │       ├── pageObjects/    # Page Object Models
│   │   │       ├── listeners/      # TestNG Listeners (e.g., for reporting)
│   │   │       └── utilities/      # Helper classes and common utilities
│   │   └── resources/
│   │       ├── config.properties   # Configuration file
│   │       └── log4j2.xml          # Logging configuration
│
├── src/test/
│   ├── java/
│   │   └── cogmentoCRM.Web.testcases/  # Test classes
│   └── resources/                      # Test data/configs (if any)
│
├── testdata/            # Excel test data files
├── errorshots/          # Screenshots captured on failure
├── logs/                # Log4j output
├── reports/             # ExtentReports output
├── test-output/         # TestNG default report output
├── pom.xml              # Maven project descriptor
├── run_tests.bat        # Batch script for quick execution
├── testng.xml           # TestNG suite configuration
└── README.md            # Project documentation
🚀
