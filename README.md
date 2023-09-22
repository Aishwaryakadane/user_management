# Overview
This project, named "User Management," is a robust Spring Boot application designed for managing user data efficiently. It provides a set of RESTful API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting user information.

# Technologies Used
<li>Framework: Spring Boot</li>
<li>Language: Java</li>
<li>Build Tool: Maven</li>

# Data Flow
## Controller
The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

Add User: POST /user
Get All Users: GET /users
Get User by ID: GET /user/{userID}
Update User Address: PUT /user/{userID}
Delete User by ID: DELETE /user/{userID}
@RestController
@Validated
public class UserController {
    @Autowired
    UserService userService;

    // Add a user
    @PostMapping("user")
    public String addUser(@Valid @RequestBody User user) {
        return userService.inputUser(user);
    }

    // Get all users
    @GetMapping("users")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    // ...
}

## Services
The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

Validating input data.
Performing CRUD operations on user data.
Handling data transformations and interactions with external systems (if applicable).
@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAllUser() {
        return userRepo.getUsers();
    }

    // ...
}

## Repository
The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for user data. Additionally, it may include data mapping and conversion between Java objects and database entities.

@Repository
public class UserRepo {
    @Autowired
    private List<User> userList;

    public List<User> getUsers() {
        return userList;
    }

    // ...
}

## Database Design
The project's database design includes tables for user management, with fields such as:

userId (User ID)
userName (User Name)
userContactNo (Phone Number)
useraddress (Address)

This database design ensures data integrity and provides a structured approach to managing user information within the application.

### Data Structures Used
The project utilizes the following data structures:

User Class
The User class defines the structure for user data and includes the following fields:

userId (User ID): An integer that serves as a unique identifier for each user.
userName (User Name): A string representing the user's full name.
userContactNo (Phone Number): A string representing the user's phone number (e.g., 911234567890).

## ArrayList
The project utilizes the ArrayList data structure to store and manage lists of User objects in various parts of the application. ArrayList provides dynamic sizing and efficient element retrieval, making it suitable for storing user records and performing operations on them.

These data structures enable the application to organize and manipulate user data efficiently while maintaining data integrity.

## Project Summary
The User Management project is a robust Spring Boot application designed for efficient user data management. It offers a set of RESTful API endpoints for various user-related operations, including adding, retrieving, updating, and deleting user information.

# Key Feature
<li> RESTful API endpoints for user management. </li>
<li> Data validation to ensure data integrity. </li>
<li> Clean code separation with a layered architecture (Controller, Services, Repository).</li>
<li> Robust error handling for improved reliability.</li>
<li> Java-based backend and Maven for build management.</li>

The User Management project serves as a practical example of Spring Boot application development, demonstrating best practices in API design and user data management. It offers a solid foundation for building and extending user management systems in various applications.


