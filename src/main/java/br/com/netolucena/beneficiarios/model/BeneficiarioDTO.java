package br.com.netolucena.beneficiarios.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class BeneficiarioDTO implements Serializable {
	
	private static final long serialVersionUID = -7897801414170563103L;
	
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private BigDecimal saldoAposentadoria;
	private BigDecimal valorAporte;
	private Integer qtdAnosRecebimentoAposentadoria;	
		
	public BeneficiarioDTO() {
		
	}
	
	public BeneficiarioDTO(Long id, String nome, String cpf, String email, BigDecimal saldoAposentadoria, BigDecimal valorAporte, Integer qtdAnosRecebimentoAposentadoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.saldoAposentadoria = saldoAposentadoria;
		this.valorAporte = valorAporte;
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
			
	public BigDecimal getValorAporte() {
		return valorAporte;
	}

	public void setValorAporte(BigDecimal valorAporte) {
		this.valorAporte = valorAporte;
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
