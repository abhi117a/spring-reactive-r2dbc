# spring-reactive-r2dbc
## A Spring Reactive project with R2DBC driver and H2 database setting

This project act as "minimum setting" required to start a RDBMS style database with Reactive Stack. Clone this repo and you will be up and running for using and RDBMS dbs with Reactive Stack
When used with Spring WebFlux, R2DBC allows us to write an application that handles data asynchronously from the top and all the way down to the database.

#### To summarize, R2DBC is still in an early stage. It's an attempt to create an SPI that will define a reactive API to SQL databases. 


## How to run Docker
1. Navigate to folder where Dockerfile is present
2. docker build .
3. docker run -p 8080:8080 -d <docker-image-id> [The Docker image id will be available from Step #2]


#### P.S. git config --global core.editor "atom --wait" for setting atom as default editor for merge conflicts 
