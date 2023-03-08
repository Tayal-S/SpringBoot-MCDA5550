# SpringBoot-MCDA5550
SpringBoot Project for Hotel Management

API development for hotel reservation system using Java Springboot requires:

1. JDK 18
2. SpringBoot
3. Database -MySql
4. ORM Framework - Hibernate
5. Testing - Postman


Overview of the project Structure:

**src/main/java:** This folder contains the Java source code for the application.

**com.springboot.app**: This package contains the main class of the application, HotelReservationProjectApplication.java which is the entry point for the Spring Boot application.

**controller**: This package contains the RESTful API controllers that handle HTTP requests from the frontend and return HTTP responses.

**entity**: This package contains the Java classes that represent the entities of the Hotel Reservation, such as the Hotel class.

**repository**: This package contains the interfaces for the repository classes that handle database operations for the entities.

**service**: This package contains the service classes that provides logic for the application.

**application.properties**: This file contains the application configuration, such as the database connection details.


How to Access Rest API to get the available hotels from the database:

I defined a HotelController class that is annotated with @RestController to indicate that this is a controller component that handles HTTP requests and returns JSON responses.

The HotelController class has a dependency on a HotelService instance, which is used to retrieve data from the database. 

**@RequestMapping("/hotels")** annotation specifies the base path for all endpoints defined in this controller.

**@GetMapping("/available")** annotation specifies a GET endpoint with a path of /hotels/available. This endpoint returns a list of Hotel objects where the availability field is set to true. This endpoint calls the getHotelsByAvailability(true) method on the hotelService instance to retrieve the list of Hotel objects that match the filter.

How to Access Rest API to add a new hotel in the database:

**@PostMapping("/add")** annotation indicates that this endpoint is accessible via an HTTP POST request to the "/add" URL path.

This endpoint is responsible for receiving a new Hotel object as an HTTP request body, saving it to the database using the hotelService, and returning an HTTP response containing the serialized Hotel object and a CREATED status code.


Screenshots:

<img width="852" alt="image" src="https://user-images.githubusercontent.com/68942046/223547581-836f9988-2178-469e-abbb-0d67fa53eefc.png">

<img width="852" alt="image" src="https://user-images.githubusercontent.com/68942046/223547721-3ee09b4a-bf76-4ec6-93d0-dfc35a4a63c8.png">

<img width="852" alt="image" src="https://user-images.githubusercontent.com/68942046/223547959-9b14be8a-9461-4253-bf2f-ce0df9447bcc.png">



References:
https://www.youtube.com/watch?v=th3uIP7D8nk -- Spring Boot Course




