# ECI-Bienestar Statistics Service

Statistics and reporting microservice for the ECI-Bienestar platform. Aggregates usage data, generates analytics reports, and provides insights for decision-making regarding wellness services at Escuela Colombiana de Ingeniería Julio Garavito.

## 👥 Authors

* Andrés Felipe Chavarro Plazas
* Andrés Jacobo Sepúlveda Sánchez
* Camilo Andrés Fernández Días
* Jesús Alfonso Pinzón Vega

## 📌 Project Overview
This microservice is part of the ECI-Bienestar integrated platform designed for Escuela Colombiana de Ingeniería Julio Garavito. The Statistics Service is built using **Spring Boot** and provides comprehensive analytics and reporting capabilities to monitor and improve university wellness services usage.

## 🛠️ Technologies Used
- **Java 17**
- **Spring Boot 3.x** (Spring Web, Spring Data)
- **MongoDB** (NoSQL Database)
- **Maven**
- **Lombok**
- **JUnit 5 & Mockito** (for testing)
- **JaCoCo** (for code coverage)
- **SonarCloud** (for code quality)
- **Apache POI** (for report generation)
- **Chart.js** (integrated with frontend for data visualization)

## 📂 Project Structure

```
bismuto-statistics-service/
├── pom.xml
├── .gitignore
├── README.md
├── assets/
└── src/
    ├── main/
    │   ├── java/
    │   │   └── edu/eci/cvds/statistics/
    │   │       ├── StatisticsServiceApplication.java
    │   │       ├── config/            # Configuration classes
    │   │       ├── controller/        # REST Controllers
    │   │       ├── dto/               # Data Transfer Objects
    │   │       │   └── enum/          # Enumerations
    │   │       ├── exception/         # Custom Exception Handling
    │   │       ├── model/             # Entity Classes
    │   │       ├── service/           # Business Logic Services
    │   │       └── util/              # Utility classes
    │   └── resources/
    │       ├── application.properties       # Default configuration
    │       ├── application-dev.properties   # Development configuration
    │       ├── application-prod.properties  # Production configuration
    │       ├── static/                      # Static resources
    │       └── templates/                   # Templates
    └── test/
        └── java/
            └── edu/eci/cvds/statistics/
                ├── StatisticsServiceApplicationTest.java
                ├── controller/       # Controller Tests
                ├── dto/              # DTO Tests
                │   └── enum/         # Enum Tests
                ├── exception/        # Exception Tests
                ├── model/            # Model Tests
                ├── service/          # Service Tests
                └── util/             # Utility Tests
```

## 🚀 How to Run the Project

### Prerequisites
- Install **Java 17**
- Install **Maven**
- Set up a **MongoDB** database

### Steps to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/ECIBienestar/bismuto-statistics-service.git
   cd bismuto-statistics-service
   ```

2. Configure database connection in `application.properties`:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/eci_bienestar_statistics
   spring.data.mongodb.database=eci_bienestar_statistics
   ```

3. Build and run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```


## 📑 Diagrams
Some of the diagrams proposed for this module are the following, which will help us to have a clear idea of ​​how the system works and is constructed:

### Clases
Represents the static structure of a system by showing its classes, attributes, methods, and relationships. It helps understand how objects are organized and related in an object-oriented system.

![DiagramClases](/docs/DiagramaClasesEstadisticas.png)


### Data
Shows the structure of data within the system, including entities, attributes, and their relationships. It is useful for database design and understanding how data is organized and linked.

![DiagramData](/docs/DiagramaDatosEstadisticas.png)


### Components
Illustrates the physical and software components of a system and how they are grouped and connected. It helps visualize the architecture and module distribution of the application.

![DiagramComponents](/docs/DiagramaComponentesEstadisticas.png)


### Secuence
Describes how objects interact in a specific sequence of events over time. It focuses on the order of messages exchanged between objects to accomplish particular use cases or functions.

![DiagramSecuence](/docs/DiagramaSecuenciaEstadisticas.png)


## 📌 API Endpoints

### Statistical Data

| Method | Endpoint                      | Description                                |
|--------|-------------------------------|--------------------------------------------|
| GET    | /api/statistics/overview      | Get overview dashboard statistics          |
| GET    | /api/statistics/service-usage | Get usage statistics by service type       |
| GET    | /api/statistics/user-activity | Get user activity metrics                  |
| GET    | /api/statistics/trends        | Get usage trends over time                 |

### Reporting

| Method | Endpoint                        | Description                               |
|--------|--------------------------------|-------------------------------------------|
| GET    | /api/reports/generate/{type}    | Generate report by type                   |
| GET    | /api/reports/export/{format}    | Export reports in different formats       |
| POST   | /api/reports/custom             | Generate custom reports with filters      |
| GET    | /api/reports/scheduled          | Get scheduled reports                     |

### Data Collection

| Method | Endpoint                         | Description                              |
|--------|----------------------------------|------------------------------------------|
| POST   | /api/statistics/log/service      | Log service usage event                  |
| POST   | /api/statistics/log/user         | Log user activity                        |
| POST   | /api/statistics/log/resource     | Log resource utilization                 |

## 🧪 Running Tests

To run the unit tests:
```bash
mvn test
```

To generate test coverage report:
```bash
mvn test jacoco:report
```

## 🔄 CI/CD

This project uses GitHub Actions to automate building, testing, and deployment:

- **Development Pipeline**: Triggered by commits to `develop` and `feature/*` branches, automatically deploying to the development environment.
- **Production Pipeline**: Triggered by commits to the `main` branch, deploying to the production environment after successful tests.

Each pipeline consists of three stages:
1. **Build**: Compiles the application and creates the JAR package
2. **Test**: Runs unit tests and generates code coverage reports
3. **Deploy**: Deploys the application to the AWS environment

Configuration files are located in the `.github/workflows/` directory.

## 🔄 Integration with Other Modules

This statistics service integrates with other ECI-Bienestar modules:
- **Authentication Service**: For secure API access
- **User Management Service**: For user profile data collection
- **Various Service Modules**: For gathering usage statistics from all platform services

## 📊 Key Features

- **Real-time Analytics Dashboard**: Visual representation of service usage
- **Customizable Reports**: Generate reports with various filters and parameters
- **Usage Trend Analysis**: Track service utilization over time
- **Data Export**: Export data in multiple formats (CSV, Excel, PDF)
- **User Activity Monitoring**: Track user engagement with various services
- **Resource Utilization Metrics**: Monitor resource allocation and efficiency

## 🏗️ Future Improvements

- Advanced predictive analytics for service demand forecasting
- Enhanced visualization options for statistical data
- Machine learning integration for usage pattern identification
- Real-time notification system for unusual activity patterns
- Integration with academic performance data for correlation analysis

## 📝 License

This project is licensed under the MIT License.
# bismuto-statistics-service
Microservice dedicated to collecting, aggregating, and exposing usage statistics from the ECI-Bienestar modules. It supports filtering, reporting, and exporting of participation and service consumption metrics.
