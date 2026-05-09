\# Workshop Spring Boot \& MongoDB

This project is a RESTful API developed during the Java Complete course by Prof. Nélio Alves, with personal adaptations to include modern market technologies.



\## 🚀 About the Project

The main objective is to build a post and user system using the Spring ecosystem with the MongoDB NoSQL database.



\### Key Features of this Implementation:



\* \*\*Lombok:\*\* Used to reduce boilerplate code, such as getters, setters, and constructors.

\* \*\*Docker:\*\* Isolated database environment, easily managed via containers.

\* \*\*Java 17+:\*\* Utilizing recent language features.



\## 🛠 Technologies Used

\* \*\*Java 17\*\*

\* \*\*Spring Boot 3.x\*\*

\* \*\*Spring Data MongoDB\*\*

\* \*\*Lombok\*\*

\* \*\*Maven\*\*

\* \*\*Docker \& Docker Compose\*\*



\## 🏗 \*\*Project Architecture\*\*

The project follows a layered pattern:



&#x20;1. \*\*Resource:\*\* REST controllers that expose the endpoints.

&#x20;2. \*\*Service:\*\* Business logic layer.

&#x20;3. \*\*Repository:\*\* Data access layer (MongoDB).

&#x20;4. \*\*Domain:\*\* Entities representing documents in the database.

&#x20;5. \*\*DTO (Data Transfer Object):\*\* For optimized data transfer.



\## ⚙️ \*\*How to Run the Project\*\*



\*\*Prerequisites\*\*

&#x20;   \* Docker Desktop installed.

&#x20;   \* Java 17 or higher.

&#x20;   \* Maven.



\*\*Steps to Run\*\*

1\. \*\*Clone the repository:\*\*

```Bash

git clone https://github.com/fwerther28/workshop-springboot-mongodb.git

```



2\. \*\*Start the database (MongoDB via Docker):\*\*

```Bash

docker-compose up -d

```



3\. \*\*Run the application:\*\*

```Bash

mvn spring-boot:run

```



\## 👨‍💻 Author

Francisco Werther

\[GitHub](https://github.com/fwerther28)











