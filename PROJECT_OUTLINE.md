# Pokémon Card Collection Manager - Project Outline

## 1. Project Overview

The Pokémon Card Collection Manager is a web-based application designed to help Pokémon card collectors organize and manage their collections digitally. Users will be able to search for real Pokémon cards, view card information, and eventually add cards to their personal collection.

Card information will be retrieved from the Pokémon TCG API, while collection-specific information will eventually be stored in a relational database.

## 2. Project Goals

The main goals of the project are to:

- Create an easy way for users to organize a Pokémon card collection
- Allow users to search for real Pokémon cards using an external API
- Store information about cards that a user owns
- Track information such as quantity and condition
- Allow users to search and organize their stored collection
- Provide a simple web interface for interacting with the application

## 3. Core Features

The planned core features include:

- Search for Pokémon cards using the Pokémon TCG API
- Display information about individual Pokémon cards
- Add cards to a personal collection
- Store collection data in a relational database
- Track the quantity and condition of collected cards
- Search and organize cards within the collection
- Provide a web interface for managing the collection

Additional features may be considered after the core functionality is completed.

## 4. Technologies

The project currently plans to use:

- Java 21
- Spring Boot
- Spring Web
- REST APIs and JSON
- Pokémon TCG API
- Gradle
- Oracle Database
- HTML, CSS, and JavaScript
- Git and GitHub

## 5. Application Structure

The application will use a basic layered structure.

### Model

Represents Pokémon card data used throughout the application.

### Controller

Handles incoming HTTP requests and provides REST endpoints that can return data as JSON.

### Service

Handles communication with the external Pokémon TCG API.

### Database/Repository

Will be added to store and retrieve information about cards in a user's collection.

### Frontend

Will provide the user interface for searching for cards and managing a collection.

## 6. Current Prototype

The Milestone 1 prototype currently includes:

- A working Spring Boot application
- A basic `PokemonCard` model
- REST endpoints that return Pokémon card data as JSON
- Hard-coded card data for initial testing
- A service that communicates with the Pokémon TCG API
- The ability to search for real Pokémon cards through the external API
- Git and GitHub version control

The database and frontend have not yet been implemented.

## 7. Development Plan

### Stage 1 - Initial Prototype

- Set up the Spring Boot project
- Create the initial model, controller, and service
- Test REST endpoints
- Test communication with the Pokémon TCG API
- Set up the GitHub repository

### Stage 2 - Database and Collection Management

- Design the database structure
- Connect the application to the database
- Store cards in a user's collection
- Retrieve stored collection information
- Add quantity and condition tracking

### Stage 3 - Web Interface

- Create the frontend interface
- Allow users to search for Pokémon cards
- Display card information
- Allow users to add and manage cards in their collection
- Connect the frontend to the backend REST endpoints

### Stage 4 - Testing and Improvements

- Test the complete application
- Fix bugs and improve usability
- Improve searching and organization features
- Add additional features if time allows

## 8. Expected Final Result

The final application should provide a functional web-based system where a user can search for Pokémon cards and maintain a digital record of their collection. The project will combine an external API, a Java/Spring Boot backend, a relational database, and a web-based frontend.