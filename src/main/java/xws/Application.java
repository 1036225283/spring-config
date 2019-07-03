package xws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 程序启动入口
 * Created by root on 2018/7/16.
 */


@SpringBootApplication
@EnableConfigServer
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
