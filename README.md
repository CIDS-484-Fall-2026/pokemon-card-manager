# Pokémon Card Collection Manager

## Project Overview

The Pokémon Card Collection Manager is a web-based application designed to help Pokémon card collectors organize and 
manage their collections digitally.

The application currently provides a Java Spring Boot backend that allows users to search for real Pokémon cards using 
the Pokémon TCG API and manage a personal collection stored in an Oracle database.

Future development will include a web interface and additional collection-management features, such as tracking card 
quantity and condition.

## Features

### Completed Features (Milestones 1 and 2)

- Search for real Pokémon cards using the Pokémon TCG API
- Retrieve card information through REST endpoints
- Add Pokémon cards to a personal collection
- View all saved cards or retrieve an individual card by ID
- Update information for saved cards
- Delete cards from the collection
- Store collection data persistently in an Oracle relational database
- Return card information in JSON format

### Planned Features

- Develop a user-friendly web interface
- Display saved cards in a binder-style collection view
- Track card quantity and condition
- Improve searching and organizing cards within the collection
- Further integrate external Pokémon TCG API information with saved collection data

Additional features may be added depending on project progress and available time.

## Technology Stack

- **Java 21** - Primary programming language
- **Spring Boot** - Backend application framework
- **Spring Web** - REST API development
- **Spring Data JPA / Hibernate** - Database persistence and entity management
- **Oracle Database** - Relational database for stored Pokémon cards
- **REST/JSON** - Communication between the application and APIs
- **Pokémon TCG API** - External source for Pokémon card data
- **Gradle** - Build and dependency management
- **HTML/CSS/JavaScript** - Planned frontend technologies
- **Git/GitHub** - Version control and project repository

## Current Progress

### Milestone 1

For Milestone 1, the initial backend structure and API prototype were created.

Completed work included:

- Created the Spring Boot project
- Created the initial `PokemonCard` model
- Created a REST controller with test endpoints
- Created a service for communicating with the Pokémon TCG API
- Successfully returned JSON data through local REST endpoints
- Successfully searched for real Pokémon cards using the external Pokémon TCG API
- Set up the GitHub repository and version control

### Milestone 2

For Milestone 2, the project was expanded into a working database-backed collection management system.

Completed work includes:

- Installed and configured Oracle Database
- Connected the Spring Boot application to Oracle using Spring Data JPA
- Created a database table for storing Pokémon card information
- Implemented a repository for database operations
- Updated the `PokemonCard` model to support database persistence
- Implemented REST endpoints for creating, reading, updating, and deleting saved cards
- Tested API requests using Windows PowerShell
- Verified that saved card information remains in the database after restarting the application
- Confirmed that adding, editing, and deleting cards updates the stored collection

The backend now allows users to add, view, edit, and delete Pokémon cards stored in the Oracle database. The frontend 
interface has not yet been implemented, so collection management is currently performed through REST API requests.

## REST API Endpoints

The application runs locally at `http://localhost:8080`.

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/cards` | Retrieve all saved cards |
| GET | `/api/cards/{id}` | Retrieve a saved card by ID |
| GET | `/api/cards/search?name=pikachu` | Search the external Pokémon TCG API |
| POST | `/api/cards` | Add a new card to the collection |
| PUT | `/api/cards/{id}` | Update an existing saved card |
| DELETE | `/api/cards/{id}` | Delete a saved card |

POST and PUT requests accept Pokémon card information in JSON format.

Example:

```json
{
  "name": "Pikachu",
  "setName": "Base Set",
  "cardNumber": "58/102",
  "rarity": "Common"
}
```

## Project Structure

The backend follows a layered structure:

- **Model** - Represents Pokémon card data and maps it to the database
- **Controller** - Handles HTTP requests and REST endpoints
- **Service** - Handles communication with the external Pokémon TCG API
- **Repository** - Provides database access using Spring Data JPA

## Next Steps

The next stage of development will focus on:

1. Creating a frontend interface for interacting with the collection
2. Displaying saved Pokémon cards in a binder-style view
3. Improving the connection between external Pokémon TCG API search results and saved collection entries
4. Adding quantity and condition tracking
5. Improving the overall usability and presentation of the application

## Milestone 1 Video

[Watch the Milestone 1 Project Overview](https://cdnapisec.kaltura.com/p/2370711/embedPlaykitJs/uiconf_id/54949472?iframeembed=true&entry_id=1_knnwlugx)

## Milestone 2 Video

The Milestone 2 demonstration video will be linked here after recording and uploading.
