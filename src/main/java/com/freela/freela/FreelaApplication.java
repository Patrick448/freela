package com.freela.freela;

import com.freela.freela.util.Encrypter;
import org.hibernate.service.spi.InjectService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class FreelaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreelaApplication.class, args);
       // Encrypter encrypter = new Encrypter();
    }

}
