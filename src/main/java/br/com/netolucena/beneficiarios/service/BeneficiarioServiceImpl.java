package br.com.netolucena.beneficiarios.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.netolucena.beneficiarios.model.Beneficiario;
import br.com.netolucena.beneficiarios.model.BeneficiarioDTO;
import br.com.netolucena.beneficiarios.repository.BeneficiarioRepository;

public class BeneficiarioServiceImpl implements BeneficiarioService  {
	
	@Autowired
	BeneficiarioRepository repository;

	@Override
	public List<BeneficiarioDTO> findAll() {
		List<Beneficiario> dbResult = repository.findAll();
		Stream<BeneficiarioDTO> stream = dbResult.stream().map(beneficiario -> {
			return beneficiario.toDTO();
		});
		return stream.collect(Collectors.toList());				
	}

	@Override
	public BeneficiarioDTO findById(Long id) {
		Optional<Beneficiario> result = repository.findById(id);
		if (result.isPresent()) {
			result.get().toDTO();
		}
		return null;
	}

	@Override
	public BeneficiarioDTO findByNome(String nome) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BeneficiarioDTO save(BeneficiarioDTO beneficiarioDTO) {
		return repository.save(beneficiarioDTO.toBeneficiario()).toDTO();		
	}

	@Override
	public BeneficiarioDTO update(Long id, BeneficiarioDTO beneficiarioDTO) throws Exception {
		Optional<Beneficiario> optional = repository.findById(id);
		if (optional.isPresent()) {
			Beneficiario beneficiario = optional.get();
			beneficiario.setNome(beneficiarioDTO.getNome());
			beneficiario.setEmail(beneficiarioDTO.getEmail());
			beneficiario.setCpf(beneficiarioDTO.getCpf());
			beneficiario.setQtdAnosRecebimentoAposentadoria(beneficiarioDTO.getQtdAnosRecebimentoAposentadoria());
			beneficiario.setSaldoAposentadoria(beneficiarioDTO.getSaldoAposentadoria());
						
			return repository.save(beneficiario).toDTO();
			
		} else {
			throw new Exception("Beneficiário não encontrado");
		}		
	}

	@Override
	public BeneficiarioDTO aportar(Long id, BigDecimal valor) throws Exception {
		Optional<Beneficiario> optional = repository.findById(id);		
		if (optional.isPresent()) {
			Beneficiario beneficiario = optional.get();
			BigDecimal saldo = beneficiario.getSaldoAposentadoria().add(valor) ;
			beneficiario.setSaldoAposentadoria(saldo);
	        return repository.save(beneficiario).toDTO();
		} else {
			throw new Exception("Beneficiário não encontrado");
		}
	}

}
