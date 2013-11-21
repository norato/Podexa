package main;

import java.util.Date;

public class ListaCompra {
	private String nome;
	private String descricao;
	private Date data_prevista;
	private double valor_previsto;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData_prevista() {
		return data_prevista;
	}
	public void setData_prevista(Date data_prevista) {
		this.data_prevista = data_prevista;
	}
	public double getValor_previsto() {
		return valor_previsto;
	}
	public void setValor_previsto(double valor_previsto) {
		this.valor_previsto = valor_previsto;
	}
	

}
