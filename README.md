# Quote generator con Spring-boot y HSQLDB

Generador de (mayormente falsas) citas utilizando Spring-boot para el servidor y HSQLDB para almacenamiento.

### Prerequisites

Se necesita tener instalado Java JRE.

### Installing

Para correr el servidor:

```
java -jar quote-generator-0.0.1-SNAPSHOT
```

Luego, en el navegador ingresar al localhost en el puerto 8080

```
localhost:8080
```

Haciendo click en "New quote" se obtiene una nueva cita al azar de la db.

## Screenshot

![screenshot](/screenshot.png?raw=true)

## Built With

* [Spring boot](http://spring.io/projects/spring-boot) - Backend framework
* [HSQLDB](http://hsqldb.org/) - Database engine
* [Maven](https://maven.apache.org/) - Build manager

## Authors

* **Luciano Gabbanelli**