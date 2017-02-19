package io.github.kuyer.sboot.tx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="io.github.kuyer.sboot.tx")
public class TxApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxApplication.class, args);
	}

}
