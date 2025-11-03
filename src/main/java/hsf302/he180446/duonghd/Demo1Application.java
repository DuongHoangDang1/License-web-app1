package hsf302.he180446.duonghd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
//@ComponentScan("hsf302.he180446.duonghd")
//@EnableJpaRepositories(basePackages = "hsf302.he180446.duonghd.repository")
//@EntityScan(basePackages = {
//        "hsf302.he180446.duonghd.pojo"       // entity User, License, v.v. trong JAR
//})
//@SpringBootApplication
//@ComponentScan(basePackages = {
//        "com.example.demo",                  // package app chính của bạn
//        "hsf302.he180446.duonghd"            // toàn bộ package trong auth-lib.jar
//})
//@EnableJpaRepositories(basePackages = {
//        "com.example.demo.repository",
//        "hsf302.he180446.duonghd.repository" // repo trong JAR
//})
//@EntityScan(basePackages = {
//        "com.example.demo.pojo",
////        "hsf302.he180446.duonghd.pojo"       // entity User, License, v.v. trong JAR
//})




//@SpringBootApplication
//@ComponentScan(
//        basePackages = {
//                "com.example.demo", // chỉ scan bean trong app chính
//        },
//        excludeFilters = {
//                // ❌ loại bỏ toàn bộ bean trong lib để tránh trùng
//                @ComponentScan.Filter(
//                        type = FilterType.REGEX,
//                        pattern = "hsf302\\.he180446\\.duonghd\\..*"  // regex escape dấu chấm
//                )
//        }
//)
//@EnableJpaRepositories(
//        basePackages = "com.example.demo.repository" // chỉ dùng repo của app chính
//)
//@EntityScan(
//        basePackages = {
//                "com.example.demo.entity",                  // entity của app chính
//                "hsf302.he180446.duonghd.pojo"              // vẫn dùng entity trong lib nếu cần
//        }
//)
//@EntityScan("com.example.demo.pojo")


//@SpringBootApplication
//@ComponentScan(basePackages = {
//        "com.example.demo",                  // App chính
//        "hsf302.he180446.duonghd"           // Cho phép Spring load toàn bộ config, controller, filer, pojo... trong lib
//})
//@EnableJpaRepositories(
//        basePackages = {
//                "com.example.demo.repository"    // ⚠️ chỉ load repository của app chính
//        }
//)
//@EntityScan(basePackages = {
//        "com.example.demo.pojo",             // entity của app chính
//        "hsf302.he180446.duonghd.pojo"       // entity của lib
//})

@SpringBootApplication
//@ComponentScan(basePackages = {
////        "com.example.demo",                // App chính
//        "hsf302.he180446.duonghd"         // Toàn bộ lib: config, controller, filter, util,...
//})
//@EntityScan(basePackages = {
////        "com.example.demo.pojo",           // entity app chính
////        "hsf302.he180446.duonghd.pojo"     // entity lib (License, Product, User,…)
//})
//@EnableJpaRepositories(basePackages = {
////        "com.example.demo.repository"      // chỉ dùng repository của app chính
//})
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);

    }

}
