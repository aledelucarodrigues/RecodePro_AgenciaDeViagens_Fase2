package com.agencialetsgo.model;

import java.time.LocalDateTime;

public class Pedido {
	private int idPedido;
	private LocalDateTime dataInicioViagem;
	private LocalDateTime dataFimViagem;
	private enum FormaPagamentoPedido{
		PIX,
		BOLETO,
		CREDITO
	}
	private FormaPagamentoPedido formaPagamentoPedido;
	private String viajantesPedido;
	private Cliente cliente;
	private Destino destino;
		
	public Pedido() {
		super();
	}
	
	public Pedido(int idPedido, LocalDateTime dataInicioViagem, LocalDateTime dataFimViagem,
			FormaPagamentoPedido formaPagamentoPedido, String viajantesPedido, Cliente cliente, Destino destino) {
		super();
		this.idPedido = idPedido;
		this.dataInicioViagem = dataInicioViagem;
		this.dataFimViagem = dataFimViagem;
		this.formaPagamentoPedido = formaPagamentoPedido;
		this.viajantesPedido = viajantesPedido;
		this.cliente = cliente;
		this.destino = destino;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public LocalDateTime getDataInicioViagem() {
		return dataInicioViagem;
	}
	public void setDataInicioViagem(LocalDateTime dataInicioViagem) {
		this.dataInicioViagem = dataInicioViagem;
	}
	public LocalDateTime getDataFimViagem() {
		return dataFimViagem;
	}
	public void setDataFimViagem(LocalDateTime dataFimViagem) {
		this.dataFimViagem = dataFimViagem;
	}
	public String getFormaPagamentoPedido() {
		return formaPagamentoPedido.name();
	}
	public void setFormaPagamentoPedido(String formaPagamentoPedido) {
		if("PIX".equalsIgnoreCase(formaPagamentoPedido)) {
		this.formaPagamentoPedido = FormaPagamentoPedido.PIX;
		}else if ("BOLETO".equalsIgnoreCase(formaPagamentoPedido)) {
			this.formaPagamentoPedido = FormaPagamentoPedido.BOLETO;
		}else if ("CREDITO".equalsIgnoreCase(formaPagamentoPedido)) {
			this.formaPagamentoPedido = FormaPagamentoPedido.CREDITO;
		}else {
			System.out.println("Valor inválido: " + formaPagamentoPedido);
		}
	}
	public String getViajantesPedido() {
		return viajantesPedido;
	}
	public void setViajantesPedido(String viajantesPedido) {
		this.viajantesPedido = viajantesPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Destino getDestino() {
		return destino;
	}
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	
	
	
	
}
