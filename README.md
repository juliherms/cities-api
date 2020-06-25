
# Citeis-API

Example application for managing cities, states and countries and calculating the distance (geolocation) between them

### Tools

- Java SE Development Kit (min 8.0)
- Spring Tools IDE
- Maven
- Docker
- Postgres
- Git
- Heroku

## Built with:

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)

## Query Earth Distance

Point 

```sh
select ((select lat_lon from cidade where id = 4929) 
<@>
 (select lat_lon from cidade where id=5254)) as distance;
```

Cube

```sh
select earth_distance(
    ll_to_earth(-21.95840072631836,-47.98820114135742), 
    ll_to_earth(-22.01740074157715,-47.88600158691406)
) as distance;
```