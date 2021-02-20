package br.com.netolucena.beneficiarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.netolucena.beneficiarios.model.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {
	
	public Beneficiario findByNome(String nome);
	
	public Beneficiario findByCpf(String nome);
	
}
