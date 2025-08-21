# ===== Stage 1: Build bằng Maven =====
FROM maven:3.6.3-jdk-8 AS build

# Thư mục làm việc
WORKDIR /app

# Copy toàn bộ source vào container
COPY . .

# Build dự án và tạo WAR, bỏ qua test để build nhanh
RUN mvn clean package -DskipTests


# ===== Stage 2: Run bằng Tomcat =====
FROM tomcat:8.5-jdk8

# Đặt thư mục làm việc
WORKDIR /usr/local/tomcat

# Xóa các ứng dụng mặc định
RUN rm -rf webapps/*

# Copy file WAR từ Stage 1 sang Tomcat container
COPY --from=build /app/target/jsp-servlet-demo.war webapps/ROOT.war

# Mở port 8080
EXPOSE 8080

# Chạy Tomcat
CMD ["catalina.sh", "run"]