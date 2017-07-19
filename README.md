# image-gallery

This is an image gallery application built with Spring Boot, Spring MVC, Spring Data JPA, Spring Security, Thymeleaf, and Bootstrap. It allows users to upload images to their gallery, which can then be searched for by other users.

In order to run the application, clone or download it. You can import it into your ide or you can go to the location where it is saved and run <code>mvn clean spring-boot:run</code> . The program will start up on localhost:8080.

Once the application is running, register a username and then login. Here you will be directed to your My Photos page where you upload photos and also delete them. The Find Photos allows you to search for other users photo galleries. Type in your own username to see what your gallery looks like. Create some other mock users and upload photos as well.

The program is running an in-memory H2 database, but to connect it to another database, just unmark the properties in the application.properties file.

The images are set to be saved in a temporary directory, but this can be changed by going to the ImageGalleryApplication class and changing the Path to something else such as Paths.get("/home/mydirectory/images"). 

An example can be found at https://image-demo.cfapps.io/ . Search for "jon" to see my current gallery.
