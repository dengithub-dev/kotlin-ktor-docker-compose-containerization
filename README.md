# kotlin-ktor-docker-compose-containerization

A presentation on how to containerize a kotlin - ktor server app using docker and docker compose, and also an elaboration on using repositories with docker hub and simulation with play docker.

## Build the app using gradew
- run the command in root folder

```
 gradlew build
```
 
## Build the container - docker
 ```
docker build -t app .
 ```

## Running the container -docker 
```
docker run -p 5000:5000 -p
```

## Build and Run the docker compose container service
 
 ```
    docker compose up -d --build
    docker compose up
  
 ```
 
## Run the app

 ``` 
 localhost:5000 
 ```

## Push project to repository
- public [repository](https://hub.docker.com/repository/docker/dendockerhub/ktor-docker-sample) 
- Before pushing remotely, in your local, tag the image id as demonstrated below
  ```
  docker tag ea15926e670c dendockerhub/ktor-docker-sample:latest
  ```
- Then, push the image to remote
    ```
    docker push dendockerhub/ktor-docker-sample:latest
    ```
## Run project online
- You can simulate the image [here](https://labs.play-with-docker.com/)
- Make sure the pull the project - docker pull dendockerhub/ktor-docker-sample

Below is a demonstration in Docker play
![play-docker](https://github.com/dengithub-dev/kotlin-ktor-docker-compose-containerization/tree/main/tmp/play-docker.PNG)

 Reference: 
 https://ktor.io/docs/docker.html#prepare-docker
 https://www.youtube.com/watch?v=pTFZFxd4hOI
 https://stackoverflow.com/questions/48038969/an-image-does-not-exist-locally-with-the-tag-while-pushing-image-to-local-regis
 