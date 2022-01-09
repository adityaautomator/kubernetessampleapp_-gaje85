# kubernetessampleapp
This repo has sample application to be deployed in kubernetes

##### Technical Stack
* Backend : Spring Boot + JDK 17
* Frontend : Angular 

##### Backend  Microservices (3 spring boot projects):
* authapp-api ( Provides login/register api )
* netlifyapp-api ( Provides api to create and list sites in Netlify https://www.netlify.com/ )
* notificationapp-api ( Provides api to send mail notifications)

##### Frontend ( 1 angular project)
* devopsapp-ui 

##### Project User Stories:
* User should be able to register.
* User should be able to login.
* User should be able to create site in Netlify App. 
* User should be able to get mail notification when new site is created.
* User should be able to list sites in Netlify App.



