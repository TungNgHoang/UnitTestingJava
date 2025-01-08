
# Unit Testing Java

## 📚 Giới thiệu
Dự án này minh họa cách sử dụng Unit Testing trong Java với JUnit, một framework phổ biến để kiểm thử tự động. Mục tiêu chính là cung cấp các ví dụ thực tế về cách viết và quản lý unit test hiệu quả trong các dự án Java.

---

## 🛠️ Công nghệ sử dụng
- **Ngôn ngữ lập trình:** Java
- **Build tool:** Maven
- **Framework Unit Test:** JUnit 4

---

## 📂 Cấu trúc dự án
```plaintext
.
├── src
│   ├── main
│   │   └── java            # Mã nguồn chính
│   └── test
│       └── java            # Các test case
├── pom.xml                 # File cấu hình Maven
└── README.md               # Tài liệu dự án
```

---

## 🚀 Hướng dẫn sử dụng

### Yêu cầu hệ thống:
- Java Development Kit (JDK) 11 trở lên
- Maven 3.6+ cài đặt trên máy

### Chạy dự án:
1. Clone repo về máy:
   ```bash
   git clone https://github.com/TungNgHoang/UnitTestingJava.git
   cd UnitTestingJava
   ```

2. Build và chạy test:
   ```bash
   mvn clean test
   ```

3. Xem kết quả test trên terminal hoặc trong IDE (IntelliJ IDEA, Eclipse).

---

## 🧪 Test đã bao phủ
- **Các class và function chính:** 
  - Chạy các trường hợp thành công (happy path).
  - Xử lý ngoại lệ và các trường hợp lỗi (edge cases).
- **Mục tiêu:** Đảm bảo code hoạt động chính xác theo yêu cầu và không bị lỗi khi gặp các trường hợp không mong đợi.

---

## 📈 Tương lai
- **Tăng coverage:** Bổ sung các test case kiểm tra toàn bộ chức năng (method) trong project.
- **Kết hợp CI/CD:** Tích hợp pipeline CI/CD (GitHub Actions hoặc Jenkins) để tự động hóa quá trình chạy test.
- **Thêm tài liệu:** Viết thêm các hướng dẫn và ví dụ chi tiết hơn về Unit Testing.

---

## 👨‍💻 Người đóng góp
- **TungNgHoang**

Nếu bạn muốn đóng góp, vui lòng mở Pull Request hoặc liên hệ qua Issues.

---

## 📜 License
Dự án này được cấp phép theo [MIT License](./LICENSE).
```
