package com.agencialetsgo.model;

public class Cliente {

	private int idCliente;
	private String nomeCliente;
	private String cpfCliente;
	private String telefoneCliente;
	private String enderecoCliente;
	private String cidadeCliente;
	private int cepCliente;
	private String ufCliente;
	private String emailCliente;
	private String senhaCliente;
	private String cartaoCreditoCliente;
	private String vencCartaoCreditoCliente;
	private String nomeTitularCartaoCredito;
	private String cpfTitularCartaoCredito;
	
	
	public Cliente() {
		super();
	}
	public Cliente(int idCliente, String nomeCliente, String cpfCliente, String telefoneCliente, String enderecoCliente,
			String cidadeCliente, int cepCliente, String ufCliente, String emailCliente, String senhaCliente,
			String cartaoCreditoCliente, String vencCartaoCreditoCliente, String nomeTitularCartaoCredito,
			String cpfTitularCartaoCredito) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.telefoneCliente = telefoneCliente;
		this.enderecoCliente = enderecoCliente;
		this.cidadeCliente = cidadeCliente;
		this.cepCliente = cepCliente;
		this.ufCliente = ufCliente;
		this.emailCliente = emailCliente;
		this.senhaCliente = senhaCliente;
		this.cartaoCreditoCliente = cartaoCreditoCliente;
		this.vencCartaoCreditoCliente = vencCartaoCreditoCliente;
		this.nomeTitularCartaoCredito = nomeTitularCartaoCredito;
		this.cpfTitularCartaoCredito = cpfTitularCartaoCredito;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public String getCidadeCliente() {
		return cidadeCliente;
	}
	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}
	public int getCepCliente() {
		return cepCliente;
	}
	public void setCepCliente(int cepCliente) {
		this.cepCliente = cepCliente;
	}
	public String getUfCliente() {
		return ufCliente;
	}
	public void setUfCliente(String ufCliente) {
		this.ufCliente = ufCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getSenhaCliente() {
		return senhaCliente;
	}
	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	public String getCartaoCreditoCliente() {
		return cartaoCreditoCliente;
	}
	public void setCartaoCreditoCliente(String cartaoCreditoCliente) {
		this.cartaoCreditoCliente = cartaoCreditoCliente;
	}
	public String getVencCartaoCreditoCliente() {
		return vencCartaoCreditoCliente;
	}
	public void setVencCartaoCreditoCliente(String vencCartaoCreditoCliente) {
		this.vencCartaoCreditoCliente = vencCartaoCreditoCliente;
	}
	public String getNomeTitularCartaoCredito() {
		return nomeTitularCartaoCredito;
	}
	public void setNomeTitularCartaoCredito(String nomeTitularCartaoCredito) {
		this.nomeTitularCartaoCredito = nomeTitularCartaoCredito;
	}
	public String getCpfTitularCartaoCredito() {
		return cpfTitularCartaoCredito;
	}
	public void setCpfTitularCartaoCredito(String cpfTitularCartaoCredito) {
		this.cpfTitularCartaoCredito = cpfTitularCartaoCredito;
	}
	
	
}
