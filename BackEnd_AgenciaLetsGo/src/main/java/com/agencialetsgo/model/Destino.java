package com.agencialetsgo.model;

public class Destino {
	private int idDestino;
	private String nomeDestino;
	private String descricaoDestino;
	private String enderecoDestino;
	private String cidadeDestino;
	private int cepDestino;
	private String ufDestino;
	private String paisDestino;
	
	
		
	public Destino() {
		super();
	}
	public Destino(int idDestino, String nomeDestino, String descricaoDestino, String enderecoDestino,
			String cidadeDestino, int cepDestino, String ufDestino, String paisDestino) {
		super();
		this.idDestino = idDestino;
		this.nomeDestino = nomeDestino;
		this.descricaoDestino = descricaoDestino;
		this.enderecoDestino = enderecoDestino;
		this.cidadeDestino = cidadeDestino;
		this.cepDestino = cepDestino;
		this.ufDestino = ufDestino;
		this.paisDestino = paisDestino;
	}
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}
	public String getNomeDestino() {
		return nomeDestino;
	}
	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}
	public String getDescricaoDestino() {
		return descricaoDestino;
	}
	public void setDescricaoDestino(String descricaoDestino) {
		this.descricaoDestino = descricaoDestino;
	}
	public String getEnderecoDestino() {
		return enderecoDestino;
	}
	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}
	public String getCidadeDestino() {
		return cidadeDestino;
	}
	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}
	public int getCepDestino() {
		return cepDestino;
	}
	public void setCepDestino(int cepDestino) {
		this.cepDestino = cepDestino;
	}
	public String getUfDestino() {
		return ufDestino;
	}
	public void setUfDestino(String ufDestino) {
		this.ufDestino = ufDestino;
	}
	public String getPaisDestino() {
		return paisDestino;
	}
	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}
	
	
	
}
