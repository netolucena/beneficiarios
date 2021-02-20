package br.com.netolucena.beneficiarios.model;

import java.math.BigDecimal;

public class BeneficiarioDTO {
	
	private String nome;
	private String cpf;
	private String email;
	private BigDecimal saldoAposentadoria;
	private Integer qtdAnosRecebimentoAposentadoria;
	
	
	
	public BeneficiarioDTO(String nome, String cpf, String email, BigDecimal saldoAposentadoria, Integer qtdAnosRecebimentoAposentadoria) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.saldoAposentadoria = saldoAposentadoria;
		this.qtdAnosRecebimentoAposentadoria = qtdAnosRecebimentoAposentadoria;
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
	
	public Beneficiario toBeneficiario(){
		Beneficiario beneficiario = new Beneficiario(this.nome, this.cpf, this.email, this.saldoAposentadoria, this.qtdAnosRecebimentoAposentadoria);
		return beneficiario;
	}

}
