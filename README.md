## How to add request/response sample
* Add mappings into src/main/resources/mappings 
  * Example mapping
  ```
  {
  "request": {
    "method": "POST",
    "url": "/api/login",
    "bodyPatterns": [
      {
        "equalToJson": {
          "username": "admin",
          "password": "secret"
        }
      }
    ]
  },
  "response": {
    "status": 200,
    "bodyFileName": "api-login-success.json",
    "headers": {
      "Content-Type": "application/json"
    }
  }
  ```
  * Response files stored in src/main/resources/__files


## How to run and test Wiremock server app
* Run ./gradlew run
* Call endpoint defined ie:
```
curl --location 'http://localhost:8080/api/healthcheck' \
--header 'Content-Type: application/json'
```

## Reference
* https://wiremock.org/docs/
* https://wiremock.org/docs/standalone/java-jar/
