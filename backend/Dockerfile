
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app

# Copy toàn bộ mã nguồn và dependencies
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src

# Build ứng dụng
RUN mvn clean package -DskipTests

# Sử dụng JDK nhẹ để chạy ứng dụng
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copy file JAR từ builder stage
COPY --from=builder /app/target/*.jar app.jar

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
