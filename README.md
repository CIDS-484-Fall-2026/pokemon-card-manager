# Pokémon Card Collection Manager

## Project Overview

The Pokémon Card Collection Manager is a web-based application designed to help Pokémon card collectors organize and manage their collections digitally. The application will allow users to search for real Pokémon cards and eventually add cards to their own collection while keeping track of information such as quantity and condition.

Card information will be retrieved from the Pokémon TCG API rather than requiring all card information to be entered manually.

## Planned Features

The main features planned for the project include:

- Search for Pokémon cards using the Pokémon TCG API
- View information about individual cards
- Add cards to a personal collection
- Track the quantity and condition of collected cards
- Store collection information in a relational database
- Search and organize cards within the collection
- Provide a simple web interface for managing the collection

Additional features may be added later depending on project progress and available time.

## Technology Stack

- **Java 21** - Primary programming language
- **Spring Boot** - Backend application framework
- **Spring Web** - REST API development
- **REST/JSON** - Communication between the application and APIs
- **Pokémon TCG API** - External source for Pokémon card data
- **Gradle** - Build and dependency management
- **Oracle Database** - Planned relational database for collection data
- **HTML/CSS/JavaScript** - Planned frontend technologies
- **Git/GitHub** - Version control and project repository

## Current Progress

For Milestone 1, the initial backend structure and API prototype have been created.

Current progress includes:

- Created the Spring Boot project
- Created a basic `PokemonCard` model
- Created a REST controller with test endpoints
- Created a service for communicating with the Pokémon TCG API
- Successfully returned JSON data through local REST endpoints
- Successfully search for real Pokémon cards using the external Pokémon TCG API
- Set up the GitHub repository and version control

The current project uses some hard-coded card data for testing while the database portion of the application has not yet been implemented.

## Project Structure

The backend currently follows a basic layered structure:

- **Model** - Represents Pokémon card data
- **Controller** - Handles HTTP requests and REST endpoints
- **Service** - Handles communication with the external Pokémon TCG API

As development continues, database/repository components and the frontend will be added.

## Next Steps

The next stage of development will focus on:

1. Designing the database structure for stored card collections
2. Connecting the Spring Boot application to the database
3. Storing and retrieving collection data
4. Further integrating Pokémon TCG API data with the application
5. Beginning development of the web interface

The project will be developed incrementally so that the core collection-management functionality is completed before additional features are considered.

## Milestone 1 Video

A video overview and walkthrough of the Milestone 1 prototype can be viewed here:

[Milestone 1 Project Overview](<iframe id="kaltura_player" src='https://cdnapisec.kaltura.com/p/2370711/embedPlaykitJs/uiconf_id/54949472?iframeembed=true&amp;entry_id=1_knnwlugx&amp;config%5Bprovider%5D=%7B%22widgetId%22%3A%221_a0xgbq82%22%7D&amp;config%5Bplayback%5D=%7B%22startTime%22%3A0%7D'  style="width: 608px;height: 342px;border: 0;" allowfullscreen webkitallowfullscreen mozAllowFullScreen allow="autoplay *; fullscreen *; encrypted-media *" sandbox="allow-downloads allow-forms allow-same-origin allow-scripts allow-top-navigation allow-pointer-lock allow-popups allow-modals allow-orientation-lock allow-popups-to-escape-sandbox allow-presentation allow-top-navigation-by-user-activation" title="Milestone1"></iframe>)