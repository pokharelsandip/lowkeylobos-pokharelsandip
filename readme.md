This is a spring boot project.

Run the Application From DirecttvApplication.Java class.

It will run in http://localhost:8080

It has 4 APIS. You can try these APIs from API tools like Postman.

GET http://localhost:8080/metadata -> gets all metadata
GET http://localhost:8080/metadata/{resourceId} -> gets all metadata by resource id
POST http://localhost:8080/metadata -> pass the metadata object in the request body. it will create a new metadata or update existing one.
DELETE http://localhost:8080/metadata/{resourceId} -> deletes the metadata by resource id