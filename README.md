# Autor: Alejandro Polo Carvajal
#### https://www.linkedin.com/in/alejandro-polo-carvajal-790b79186/
##### ------------------------------------------------------------------------------------------------------
# Curso Automation screenplay basic
##### ------------------------------------------------------------------------------------------------------

#### Pagina automatizada: https://demoqa.com/
#### Funciones automatizadas: ID CARD ELEMENTS
#### Patron de diseño: Screenplay
#### Framework: gherkin, cucumber, Junit, SerenityBDD, selenium
#### Framework adicionales: librerias lombok, Faker, SonarLink, cucumber for java
#### Lenguaje programacion: Java
#### version gradle: gradle-8.4
#### OPEN_JDK Version 17.0.9
#### Driver: Edge version  120.0.2210.121
#### ID: Intellij IDEA community Edition 2023.1
##### ------------------------------------------------------------------------------------------------------

### Todos los casos pruebas cumplen con cada criterio solicitado
### Todas las clases estan con auto-ident lines y reformat code
### El codigo no tiene ningun Bug o codeSmell
##### ------------------------------------------------------------------------------------------------------
# PASOS PARA LA EJECUCIÓN

## Opcion 1
### PASO A PASO PARA LA EJECUCIÓN POR CONSOLA

### Comando para limpiar el proyecto y luego ejecuta TODOS los escenarios uno por uno
#### ./gradlew clean test

### Comando para ejecutar por feature
#### ./gradlew test --tests "co.com.screenplay.project.runners.RunnerOpenWeb"
#### ./gradlew test --tests "co.com.screenplay.project.runners" --- TODO LOS FEATURES

### Comando para generar reporte despues que haya terminado un test (Por consola arrojara la ruta .html )
#### ./gradlew reports

### Comando para limpiar la carpeta Target (Reportes)
#### ./gradlew clearReports
