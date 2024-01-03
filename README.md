# Data Management Project

This Java project is responsible for performing CRUD operations on a MySQL database for the 'live' table. It allows the following operations:

- View existing data.
- Insert new records.
- Update existing records.
- Delete records based on their ID.

## Project Configuration

### Requirements
- Java Development Kit (JDK)
- MySQL database

### Database Configuration
- Ensure you have a database named 'life' on your MySQL server.
- Verify that the 'live' table is created with the columns: 'id_live', 'name_npc', 'money'.

### Usage Instructions
1. Clone this repository to your local machine.
2. Configure the connection to your database in the `ConnectionDB` class.
3. Run the `Main.java` file to start the application.

## Project Structure

- `Main.java`: Controls user interaction and menu options.
- `el10.java`: Handles CRUD operations on the 'live' table.
- `ConnectionDB.java`: Establishes connection to the database.

## Usage

1. Upon starting the application, a menu with different options will be displayed.
2. Select an option by entering the corresponding number.
3. Follow the console instructions for each operation.

## Contributing

Feel free to contribute! You can improve the code, fix errors, or add new functionalities. Simply fork the repository, make your changes, and create a pull request.

## License

This project is under the [MIT License](https://opensource.org/licenses/MIT) - see the `LICENSE` file for more details.

