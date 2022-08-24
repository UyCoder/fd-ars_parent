package dev.ahmed.yygh.hosp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Created: 4/8/2022 00:01
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */

@SpringBootApplication
@ComponentScan(basePackages = "dev.ahmed")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "dev.ahmed")
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
