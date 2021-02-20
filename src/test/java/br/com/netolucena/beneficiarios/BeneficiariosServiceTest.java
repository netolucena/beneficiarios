package br.com.netolucena.beneficiarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.netolucena.beneficiarios.model.BeneficiarioDTO;
import br.com.netolucena.beneficiarios.repository.BeneficiarioRepository;
import br.com.netolucena.beneficiarios.service.BeneficiarioServiceImpl;

@ExtendWith(MockitoExtension.class)
public class BeneficiariosServiceTest {
	
	@Mock
	private BeneficiarioRepository repository;

	@InjectMocks
	private BeneficiarioServiceImpl service;
	

	@Test
	public void testService(){
		List<BeneficiarioDTO> beneficiarios = service.findAll();
		
		assertEquals(0, beneficiarios.size());		
	}

}
