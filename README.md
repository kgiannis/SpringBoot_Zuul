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


### Project Explained

#### Zuul Proxy:

Check file _application.properties_ of project Zuul_Proxy (our proxy here).

Inside here we are setting our routes. We also set the port on which the application will run.

`
zuul.routes.person.url=http://localhost:8090
`

`
server.port=9000
`

#### Zuul Responder:

Check file _application.properties_ of project Zuul_Responder. 
There you can see that the name of the application is **person**. We also set the port on which the application will run.

`
spring.application.name=person
`

`
server.port=8090
`

#### Zuul Proxy - Set our routes

So we set our route for application **person** as follows: 

zuul.routes.**<app_name>**.url 
> **person** is the **<app_name>** in our example


Now if we call:

<our_proxy>/<app_name>/<method_name>

where:
 
- **<our_proxy>** --> localhost:9000
- **<app_name>** 	--> person
- **<method_name>**	--> getPerson

we have:
`http://localhost:9000/person/getPerson`

#### Zuul Proxy - Match and Redirect

The proxy will match the **/person**, since it has it on its routes here:

`zuul.routes.person.url`

and will redirect to:

`http://localhost:8090`

along with the rest of the call:

`/getPerson`



# Redirect 
from:	**localhost:9000/person/getPerson**

to:		**localhost:8090/getPerson**
