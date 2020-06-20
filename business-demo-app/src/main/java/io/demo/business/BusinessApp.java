package io.demo.business;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication(
//        exclude = {
//                MyConfiguration.class
//        })
// @EnableAspectJAutoProxy(proxyTargetClass = true)
//@EnableScheduling
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class BusinessApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessApp.class);

    public static void main(String[] args) { //NOSONAR
        // avoid using args to pass sensitive info because every user can see it from ps
        SpringApplication.run(BusinessApp.class, args);
        System.out.println("========================================================================");
        System.out.println("    access to check health : http://{HOST}:{PORT}/v1/healthcheck");
        System.out.println("========================================================================");
    }
}
