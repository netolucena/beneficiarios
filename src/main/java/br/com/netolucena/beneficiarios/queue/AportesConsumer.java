package br.com.netolucena.beneficiarios.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;

public class AportesConsumer {
	
 
    @RabbitListener(queues = {"${queue.order.name}"})
    public void receive(@Payload String fileBody) {
       System.out.println(fileBody);
    }
	

}
