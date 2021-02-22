package br.com.netolucena.beneficiarios.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beneficiario")
public class Beneficiario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
			
	@Column(nullable = false)
	private String cpf;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private BigDecimal saldoAposentadoria;
	
	@Column(nullable = false)
	private Integer qtdAnosRecebimentoAposentadoria;
	
	
	public Beneficiario() {
		
	}
	
	public Beneficiario(String nome, String cpf, String email, BigDecimal saldoAposentadoria, Integer qtdAnosRecebimentoAposentadoria) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.saldoAposentadoria = saldoAposentadoria;
		this.qtdAnosRecebimentoAposentadoria = qtdAnosRecebimentoAposentadoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public BigDecimal getSaldoAposentadoria() {
		return saldoAposentadoria;
	}
	
	public void setSaldoAposentadoria(BigDecimal saldoAposentadoria) {
		this.saldoAposentadoria = saldoAposentadoria;
	}
	
	public Integer getQtdAnosRecebimentoAposentadoria() {
		return qtdAnosRecebimentoAposentadoria;
	}
	
	public void setQtdAnosRecebimentoAposentadoria(Integer qtdAnosRecebimentoAposentadoria) {
		this.qtdAnosRecebimentoAposentadoria = qtdAnosRecebimentoAposentadoria;
	}
	
	public BeneficiarioDTO toDTO(){
		BeneficiarioDTO dto = new BeneficiarioDTO(this.id, this.nome, this.cpf, this.email, this.saldoAposentadoria, null, this.qtdAnosRecebimentoAposentadoria);
        return dto;
    }
		
}
