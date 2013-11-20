package main;

import java.util.ArrayList;

public class Produto {

	private String nome;
	private double valor_previsto;
	private double valor_real;
	private ArrayList<Double> precos_anteriores = new ArrayList<Double>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor_previsto() {
		return valor_previsto;
	}
	public void setValor_previsto(double valor_previsto) {
		this.valor_previsto = valor_previsto;
	}
	public double getValor_real() {
		return valor_real;
	}
	public void setValor_real(double valor_real) {
		this.valor_real = valor_real;
	}
	
	public void atualiza() {
		this.precos_anteriores.add(this.valor_previsto);
		this.valor_previsto = this.valor_real;
		this.valor_real = (double)0.0;
		
	}
	public ArrayList<Double> precos_anteriores() {
		return this.precos_anteriores;
		
	}
	
	
}
