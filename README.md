# GRPC-UNIVERsITY
## _Spring-Grpc-Sleuth-Logback Integration Examples_

## Architecure

- Professor-Service: An grpc Server service getProfessor() function, and acting as a GRPC client to fetch department name of professor from department-service.
- Department-Service: A grpc server serving getDepartment() function, which return Department by professorId.
