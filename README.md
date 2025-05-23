## How to add request/response sample
* Add mappings into src/main/resources/mappings 
  * Example mapping
  ```
  {
  "request": {
    "method": "GET",
    "url": "/api/request1"
  },
  "response": {
    "status": 200,
    "bodyFileName": "response-1.json",
    "headers": {
      "Content-Type": "application/json"
    }
  }
  ```
  * Response files stored in src/main/resources/__files


## How to run Wiremock server app
* Run ./gradlew run


## Reference
* https://wiremock.org/docs/
* https://wiremock.org/docs/standalone/java-jar/
