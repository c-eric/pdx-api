# Pdx Spring Boot Application
**[Personal Project (in-progress)]**<br>
This Spring Boot Application serves as the backend for the [Pal-dex Website](https://github.com/c-eric/pdx). It provides RESTful APIs for CRUD operations on data stored in MongoDB. The application is built using Spring Boot, leveraging Spring Data MongoDB for database interactions.

- **Read**:
  - Get all pals:
    - Endpoint: `GET /pals`
    - Description: Retrieves all pals stored in the database.
  - Get pals by name:
    - Endpoint: `GET /name/{name}`
    - Description: Retrieves pals by their name.
  - Get pals by type:
    - Endpoint: `GET /type/{typeName}`
    - Description: Retrieves pals by their type.
  - Get pals by suitability:
    - Endpoint: `GET /suitability/{suitabilityName}`
    - Description: Retrieves pals by their suitability.
