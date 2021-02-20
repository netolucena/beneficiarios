package br.com.netolucena.beneficiarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.netolucena.beneficiarios.model.Beneficiario;
import br.com.netolucena.beneficiarios.repository.BeneficiarioRepository;
import br.com.netolucena.beneficiarios.service.BeneficiarioServiceImpl;

@SpringBootTest
class BeneficiariosApplicationTests {
	
	@Autowired
	BeneficiarioRepository repository;
	
	@InjectMocks
	private BeneficiarioServiceImpl beneficiarioService;

	@Test
	void contextLoads() {
		repository.save(new Beneficiario("José da Silva", "111.111.111-09", "jose@email.com", new BigDecimal(100000000), 15));
		repository.save(new Beneficiario("Maria do Nascimento", "222.222.222-12", "maria@email.com", new BigDecimal(234000000), 10));
	}
	
	@Test
	public void testRepository(){				
		List<Beneficiario> beneficiarios = repository.findAll();    	        
		assertEquals(2, beneficiarios.size());		
	}
	

}
