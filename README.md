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
- Abrimos una terminal de GitBash
- Clonamos el proyecto con el comando git clone https://github.com/felipe-ga/e-commerce-backend.git
- Abrimos el proyecto con IntelliJ
- Modificamos el archivo application-dev.properties con la configuración de la BD
- Ejecutamos la clase EcommerceApplication.kt
- Con esto ya tendremos la API desplegada en local

## Deploy 📦
- Abrimos una terminal
- Clonamos el proyecto con el comando git clone https://github.com/felipe-ga/e-commerce-backend.git
- Ahora Ingresamos a la carpeta con el comando cd e-commerce-backend
- Ejecutamos el siguiente comando run gradlew.bat build
- Ejecutamos el siguiente comando java -jar build/libs/ecommerce-1.0.jar
- Con esto ya tendremos desplegado la API desplegada en local


## Build with 🛠️
- Kotlin
- Gradle
