# Spring Boot Zuul Proxy example

Example project demonstrating the usage of Zuul Proxy to redirect requests. 

Execute this project along with **Zuul_Responder** project.

### Without proxy
Project **Zuul_Responder** is running on port 8090. 

Type: *http://localhost:8090/getPerson* to get the person details on browser.

### With proxy
Project **Zuul_Proxy** is running on port 9000.
Now in order to get the same result using the proxy 

Type: *http://localhost:9000/person/getPerson*
