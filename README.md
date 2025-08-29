# MahuBankApp

MahuBankApp is a JavaFX-based banking application that provides a user-friendly interface for managing accounts, transactions, and dashboards. The application follows the MVC (Model-View-Controller) design pattern and uses Maven for dependency management.

## Features

- **Dashboard**: Overview of user accounts and activities.
- **Transactions**: View and manage transaction history.
- **Accounts**: Manage user accounts.
- **Custom Views**: Styled with JavaFX and CSS for a modern look.

## Technologies Used

- **Java**: Core programming language.
- **JavaFX**: For building the graphical user interface.
- **Maven**: For dependency management and project build.
- **FXML**: For defining UI layouts.
- **CSS**: For styling the application.

## Project Structure

- `src/main/java`: Contains the Java source code.
    - `controller`: Contains controllers for handling user interactions.
    - `model`: Contains the application logic and data.
    - `views`: Contains the view factory for managing UI components.
- `src/main/resources`: Contains resources like FXML files and CSS styles.
    - `fxml`: Contains FXML files for UI layouts.
    - `styles`: Contains CSS files for styling.

## Prerequisites

- **JDK 17 or higher**: Ensure you have Java Development Kit installed.
- **Maven**: For building and running the project.

## Setup and Run

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd MahuBankApp

2. Build the project using Maven:
   ```bash
    mvn clean install
    ```
3. Run the application:
    ```bash
    mvn javafx:run
    ```