FROM openjdk:11

# Копируем сборку crud.jar в контейнер
COPY target/crud.jar /home/crud.jar

# запускаем сам сервис
CMD ["java", "-jar", "/home/crud.jar"]