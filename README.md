# Laboratorio 3: Spring Boot Seguridad con JWT

## Inovación y Emprendimiento con Tecnologías de Información

#### Camilo Andrés Pichimata Cárdenas

##### Septiembre del 2022

## Objetivos

- Explicar cómo funciona JWT. 

- Implementar la seguridad de los endpoints de la API utilizando JWT.

Nuestros endpoints del API pueden ser utilizados por cualquier persona que conozca la URL y la estructura de la API. Para asegurar nuestra API, implementaremos la autenticación JWT.

## Temas Principales

- Spring Security.

- JWT.

- Token.

## Desarrollo

### Parte 1: Agregar configuración de seguridad

Se agregaron las dependencias especificadas, se agregó la clase y se testearon los endpoints del API, en este caso se retornaron los siguientes códigos de respuesta:

#### - GET, PUT y DEL - (403 Forbidden)

![](img/P1-Forbidden.png)

#### - POST - (401 Unauthorized)

![](img/P1-Unauthorized.png)

