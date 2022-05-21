# Lendo Task
this posts application is a spring boot application that manage calls to 5 API
//to get AllUsers
localhost:8080/users
//to get AllPosts for specific user
localhost:8080/users/{user_id}/posts
//to get AllPosts
localhost:8080/posts
//to get AllComments for specific Post
localhost:8080/posts/{post_id}/comments
//to get AllComments
localhost:8080/comments

*//to login with username & password and get token to use it to access above endpoints
localhost:8080/oauth/token

# the main branch contains : 
- posts >> the application
- img >> screenshots of the postman calls
- postman collection contains the login method and one sample for get posts of specific user

----------------------------------------------------------------------------------------
# How To Run And Use This App:
-first you have to pull the code and open it in any Editor and click run or you can run it with mvn commands
-second you have to know that these api's are secured by OAuth and JWT Token , so 
you have to call localhost:8080/oauth/token first as per the postman collection attached on the main branch or by checking the image below
![alt text](https://github.com/Ahmed-Ali-93/Lendo/blob/main/img/oauth%20token%20request%20body.PNG?raw=true)
![alt text](https://github.com/Ahmed-Ali-93/Lendo/blob/main/img/oauth%20token%20request%20authorization.PNG?raw=true)

then you have to take the returned token and use it to call other API's like the example in the postman collection or or by checking the image below
![alt text](https://github.com/Ahmed-Ali-93/Lendo/blob/main/img/getAllComments.PNG?raw=true)

DONOT FORGET TO USE THE SAME USERNAME AND PASSWORDS USED IN POSTMAN COLLECTIONS SINCE THEY ARE HARDCODED IN THE CODE ,SINCE NO DB USED
---------------------------------------------------------------------------------------------
# Important Notes:
-- this project conatins 
- the rest controllers for the api's
- Client package  that contains  **Feign Clients **  to call backend API's
- OAuth & spring security layer
- MOCKITO & JUINT for unit testing (unit testing provided for service layer only)
- general custome exception for handling exceptions in case the original api's in the background like : https://gorest.co.in/public/v2/comments  are not available
- service and Dto 
- configurations for Oauth
