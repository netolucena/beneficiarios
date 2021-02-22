package br.com.netolucena.beneficiarios.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.netolucena.beneficiarios.model.BeneficiarioDTO;
import br.com.netolucena.beneficiarios.service.BeneficiarioService;

@Component
public class AportesConsumer {
	
	@Autowired
	BeneficiarioService service;

    @RabbitListener(queues = {"${queue.caixa.name}"})
    public void receive(@Payload BeneficiarioDTO beneficiario) throws Exception {
       service.aportar(beneficiario.getId(), beneficiario.getValorAporte());       
    }
	

}
