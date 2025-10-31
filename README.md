SpringBoot API 
Flow of SpringBoot API
Postmain->Controller->Service->DataAccessObject(DAO)[it takes the help of JpaRepository]->DataBase 
Note: Spring is auto configured and it internally uses Dispatcher servlet for configuration.
Controller class takes the url request from the Postman and maps it respective handling methods.
It uses Hibernate to manage all the database operations .


