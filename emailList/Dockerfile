# Sử dụng Tomcat 8.5 với JDK 8
FROM tomcat:8.5-jdk8

# Đặt thư mục làm việc
WORKDIR /usr/local/tomcat

# Xóa các ứng dụng mặc định (ROOT, docs, examples) để tránh xung đột
RUN rm -rf webapps/*

# Copy file WAR vào webapps và đổi tên thành ROOT.war
COPY target/jsp-servlet-demo.war webapps/ROOT.war

# Mở cổng 8080 (Tomcat)
EXPOSE 8080

# Lệnh chạy Tomcat
CMD ["catalina.sh", "run"]