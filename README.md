# e-commerce-backend
Backend para e-commerce de productos para la construcción

### Pre-requirements 📋
- Tener instalado IntelliJ IDEA https://www.jetbrains.com/idea/
- Tener instalado cliente de git como por ejemplo GitBash https://gitforwindows.org/
- Tener una base de datos con el modelo
- Tener instalado la version 11 de java

## Installation BD
- Tener instalado un motor de base de datos Mysql
- Ejecutar el script que se encuentra en la ruta resources/data.sql

## Installation ⚙️
- Clonar el proyecto https://github.com/felipe-ga/e-commerce-backend.git
- Abrir el proyecto con IntelliJ
- Modificar el archivo application-dev.properties con la configuración de la BD
- Ejecutar la clase EcommerceApplication.kt
- Con esto ya tendremos la API desplegada en local

## Deploy 📦
- Abrir una terminal y nos posicionamos en la carpeta raiz 
- Ejecutamos el siguiente comando run gradlew build
- En la consola navegamos hasta la carpeta build/libs y ejecutamos el siguiente comando
  java -jar ecommerce-1.0.jar
- Con esto ya tendremos desplegado la API desplegada en local


## Build with 🛠️
- Kotlin
- Gradle
