## Overview
`sb-jpa-h2` is a Java-based project that utilizes Spring Boot, JPA (Java Persistence API), and H2 database. This project serves as a basic template for developing and testing Java applications with these technologies. It provides a REST API that can be used with two different front-end applications:

- [Angular Front-end](https://github.com/dvanauken/angular)
- [React Front-end](https://github.com/dvanauken/react)

The project includes a SQL file, [userdb.sql](https://github.com/dvanauken/sb-jpa-h2/blob/main/userdb.sql), which provides the Data Definition Language (DDL) for setting up the necessary database structure.

## To Start H2:
C:\Program Files (x86)\H2\bin>java -cp h2*.jar org.h2.tools.Server

## Stopping H2 Database on Windows

### Using Task Manager

1. **Open Task Manager**: Press `Ctrl + Shift + Esc` to open Task Manager.
2. **Find Java Process**: Navigate to the `Processes` tab and look for the Java process running the H2 database. It may be labeled as `java.exe` or `javaw.exe`.
3. **End Process**: Right-click on the Java process and choose `End Task`.

### Using Command Prompt

1. **List Processes**: Open Command Prompt and type the following command to list all running processes:

    ```cmd
    tasklist
    ```

2. **Kill Process**: Identify the `java.exe` or `javaw.exe` process related to H2 and note its PID (Process ID). Use the `taskkill` command to terminate it:

    ```cmd
    taskkill /F /PID [PID]
    ```
    
Replace `[PID]` with the actual Process ID.






## Technologies Used
- Java 18
- Spring Boot 3
- JPA
- H2

## Setup and Installation
To get this project up and running, you will need to:

1. Clone this repository to your local machine.
2. Ensure you have Java, Maven, and H2 (https://www.h2database.com/html/main.html) installed.
3. Navigate to the project directory and run `mvn spring-boot:run`.
4. C:\Program Files (x86)\H2\bin>java -cp h2*.jar org.h2.tools.Server

## Contributing
Contributions are welcome! Please feel free to submit a Pull Request.

## License
This project is open source, under the [MIT license](/LICENSE).
