package com.agencialetsgo.model;

public class FaleConosco {

	private int idFaleConosco;
	private String nomeFaleConosco;
	private String emailFaleConosco;
	private String telefoneFaleConosco;
	private enum AssuntoFaleConosco{
		SUGESTAO,
		RECLAMACAO,
		DUVIDA,
		OUTROS
	}
	private AssuntoFaleConosco assuntoFaleConosco;
	private String mensagemFaleConosco;
	
	
	public FaleConosco() {
		super();
	}
	public FaleConosco(int idFaleConosco, String nomeFaleConosco, String emailFaleConosco, String telefoneFaleConosco,
			AssuntoFaleConosco assuntoFaleConosco, String mensagemFaleConosco) {
		super();
		this.idFaleConosco = idFaleConosco;
		this.nomeFaleConosco = nomeFaleConosco;
		this.emailFaleConosco = emailFaleConosco;
		this.telefoneFaleConosco = telefoneFaleConosco;
		this.assuntoFaleConosco = assuntoFaleConosco;
		this.mensagemFaleConosco = mensagemFaleConosco;
	}
	public int getIdFaleConosco() {
		return idFaleConosco;
	}
	public void setIdFaleConosco(int idFaleConosco) {
		this.idFaleConosco = idFaleConosco;
	}
	public String getNomeFaleConosco() {
		return nomeFaleConosco;
	}
	public void setNomeFaleConosco(String nomeFaleConosco) {
		this.nomeFaleConosco = nomeFaleConosco;
	}
	public String getEmailFaleConosco() {
		return emailFaleConosco;
	}
	public void setEmailFaleConosco(String emailFaleConosco) {
		this.emailFaleConosco = emailFaleConosco;
	}
	public String getTelefoneFaleConosco() {
		return telefoneFaleConosco;
	}
	public void setTelefoneFaleConosco(String telefoneFaleConosco) {
		this.telefoneFaleConosco = telefoneFaleConosco;
	}
	public String getAssuntoFaleConosco() {
		return assuntoFaleConosco.name();
	}
	public void setAssuntoFaleConosco(String assuntoFaleConosco) {
		if("SUGESTAO".equalsIgnoreCase(assuntoFaleConosco)) {
		this.assuntoFaleConosco = AssuntoFaleConosco.SUGESTAO;
		}else if ("RECLAMACAO".equalsIgnoreCase(assuntoFaleConosco)) {
			this.assuntoFaleConosco = AssuntoFaleConosco.RECLAMACAO;
		}else if ("DUVIDA".equalsIgnoreCase(assuntoFaleConosco)) {
			this.assuntoFaleConosco = AssuntoFaleConosco.DUVIDA;
		}else if ("OUTROS".equalsIgnoreCase(assuntoFaleConosco)) {
			this.assuntoFaleConosco = AssuntoFaleConosco.OUTROS;
		}else {
				System.out.println("Valor inválido: " + assuntoFaleConosco);
		}
	}
	
	public String getMensagemFaleConosco() {
		return mensagemFaleConosco;
	}
	public void setMensagemFaleConosco(String mensagemFaleConosco) {
		this.mensagemFaleConosco = mensagemFaleConosco;
	}
	
	
}
