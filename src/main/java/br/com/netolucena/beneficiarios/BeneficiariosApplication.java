package br.com.netolucena.beneficiarios;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableRabbit
public class BeneficiariosApplication {
	
	@Value("${queue.caixa.name}")
	private String queue;
	
	public static void main(String[] args) {
		SpringApplication.run(BeneficiariosApplication.class, args);
	}
	
	@Bean
    public Queue queue() {
        return new Queue(queue, true);
    }

}
