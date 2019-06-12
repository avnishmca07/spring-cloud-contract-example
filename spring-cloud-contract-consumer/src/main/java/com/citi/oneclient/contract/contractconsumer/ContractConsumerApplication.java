package spring.cloud.springcloudcontractconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudContractConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudContractConsumerApplication.class, args);
	}
}
