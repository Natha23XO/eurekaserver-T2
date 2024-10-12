package pe.edu.cibertec.examenT2_eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ExamenT2EurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenT2EurekaserverApplication.class, args);
	}

}
