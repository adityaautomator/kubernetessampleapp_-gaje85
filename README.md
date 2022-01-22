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


##### Docker Images [ backend microservice ]

```
docker pull technocis/userapp-api
docker pull technocis/devopstracker-api
docker pull technocis/notificationapp-api
docker pull technocis/devopstracker-ui
```

##### Run Docker Images
```
docker run -d -p 9002:9002 technocis/userapp-api:latest
docker run -d -p 9000:9000 technocis/devopstracker-api:latest
docker run -d -p 9001:9001 technocis/notificationapp-api:latest
docker run -d -p 80:80 technocis/devopstracker-ui
```

###### Test Microservices 
* List Users
```
http://localhost:9002/api/v1/users
```

* List Sites
```
http://localhost:9000/api/v1/sites
```


* Test Mail Notification
```
http://localhost:9001/api/v1/mails
```

* Test Angular App
```
http://localhost:80
```
