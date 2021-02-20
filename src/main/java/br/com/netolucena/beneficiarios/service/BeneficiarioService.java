package br.com.netolucena.beneficiarios.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.netolucena.beneficiarios.model.Beneficiario;
import br.com.netolucena.beneficiarios.model.BeneficiarioDTO;

@Service
public interface BeneficiarioService {
		
	
    public List<BeneficiarioDTO> findAll();
    
    public BeneficiarioDTO findById(Long id) throws Exception;
    
    public BeneficiarioDTO findByNome(String nome) throws Exception;
        
    public BeneficiarioDTO save(BeneficiarioDTO beneficiario);
    
    public BeneficiarioDTO update(Long id, BeneficiarioDTO beneficiario);
    
    public BeneficiarioDTO aportar(Long idBeneficiario, BigDecimal valor) throws Exception;

}
