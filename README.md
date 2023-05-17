# kotlin-ktor-docker-compose-containerization

A presentation on how to containerize a kotlin - ktor server app using docker and docker compose

## Build the app using gradew
- run the command in root folder

```
 gradlew build
```
 

 ## Build the container - docker
 ```
docker build -t app .
 ```

### Running the container -docker 
```
docker run -p 8100:8100 -p
```

## Build and Run the docker compose container service
 
 ```
  docker compose up
  docker compose up -d --build
 ```
 
## Run the app

 ``` 
 localhost:8100 
 ```

 Reference: https://ktor.io/docs/docker.html#prepare-docker