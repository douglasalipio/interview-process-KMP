# Movie List App - KMP Demo

## Overview
A Kotlin Multiplatform (KMP) application demonstrating Clean Architecture principles with a movie listing and detail view functionality.

## Architecture
The project follows **Clean Architecture** with clear separation of concerns:

### Domain Layer
- **Entities**: Core business models (`Movie`)
- **Repository Interfaces**: Contracts for data operations
- **Use Cases**: Business logic implementation
  - `GetMoviesUseCase`: Retrieve list of movies
  - `GetMovieByIdUseCase`: Retrieve specific movie details

### Data Layer
- **Repository Implementation**: Concrete implementation of repository interfaces
- **Data Sources**: Mock data source with 8 popular movies
- **Models**: Data transfer objects

### Presentation Layer
- **ViewModels**: State management and business logic coordination
  - `MovieListViewModel`: Manages movie list state
  - `MovieDetailViewModel`: Manages movie detail state
- **Screens**: Composable UI components
  - `MovieListScreen`: Displays scrollable list of movies
  - `MovieDetailScreen`: Shows detailed movie information
- **States**: UI state models

## Features
- ✅ Movie list with card-based layout
- ✅ Movie details with comprehensive information
- ✅ Navigation between screens
- ✅ Loading and error states
- ✅ Clean Architecture implementation
- ✅ Dependency injection setup
- ✅ Mock data with 8 popular movies

## Movie Information Displayed
- Title and release date
- Rating (1-10 scale)
- Overview/Synopsis
- Duration in minutes
- Genres
- Director
- Cast members

## Tech Stack
- **Kotlin Multiplatform**: Shared code across platforms
- **Compose Multiplatform**: Declarative UI framework
- **Kotlin Coroutines**: Asynchronous programming
- **Clean Architecture**: Separation of concerns
- **Manual DI**: Simple dependency injection

## Supported Platforms
- 🤖 Android (API 24+)
- 🖥️ Desktop (JVM)
- 🍎 iOS (via generated framework)
- 🌐 Web (WASM-JS experimental)

## Project Structure
```
composeApp/
├── src/
│   └── commonMain/
│       └── kotlin/
│           └── com/br/interview/composeApp/
│               ├── domain/
│               │   ├── model/
│               │   ├── repository/
│               │   └── usecase/
│               ├── data/
│               │   ├── datasource/
│               │   └── repository/
│               ├── presentation/
│               │   ├── screen/
│               │   ├── viewmodel/
│               │   └── state/
│               └── di/
shared/
└── src/
    └── commonMain/
        └── kotlin/
```

## How to Run

### Android
```bash
./gradlew :composeApp:assembleDebug
# or install directly on device/emulator
./gradlew :composeApp:installDebug
```

### Desktop
```bash
./gradlew desktopRun
```

### iOS
1. Generate iOS framework:
```bash
./gradlew linkDebugFrameworkIosSimulatorArm64
```
2. Import framework in Xcode project

## Build Requirements
- JDK 11+
- Android SDK (for Android builds)
- Xcode (for iOS builds, macOS only)
- Gradle 8.7

## Mock Data
The app includes 8 pre-loaded movies:
- The Shawshank Redemption (1994)
- The Godfather (1972)
- The Dark Knight (2008)
- Pulp Fiction (1994)
- Inception (2010)
- Fight Club (1999)
- The Matrix (1999)
- Goodfellas (1990)

## Future Improvements
- [ ] Real API integration
- [ ] Image loading from network
- [ ] Search functionality
- [ ] Favorites feature
- [ ] Offline caching
- [ ] Unit and UI tests
- [ ] CI/CD pipeline

## License
This is a demonstration project for interview purposes.
