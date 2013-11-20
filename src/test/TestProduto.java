package test;

import java.util.ArrayList;

import main.Produto;

import org.junit.Assert;
import org.junit.Test;


public class TestProduto {


	@Test
	public void AdicionaProduto() {
		Produto arroz = new Produto();
		
		arroz.setNome("Arroz");
		arroz.setValor_previsto(6.99);
		
		Assert.assertEquals("Arroz",arroz.getNome());
		Assert.assertEquals(6.99, arroz.getValor_previsto(), 0.001);
		Assert.assertEquals((double)0.0, arroz.getValor_real(), 0.001);
	}
	
	@Test
	public void AtualizaProdutonaCompra(){
		Produto arroz = new Produto();
		
		arroz.setNome("Arroz");
		arroz.setValor_previsto(6.99);
		
		arroz.setValor_real(7.40);
		
		ArrayList<Double> lista_teste = new ArrayList<Double>();
		
		Assert.assertEquals(lista_teste, arroz.precos_anteriores());
		
		lista_teste.add(arroz.getValor_previsto());
		arroz.atualiza();
		
		Assert.assertEquals(7.40, arroz.getValor_previsto(), 0.001);
		Assert.assertEquals(lista_teste, arroz.precos_anteriores());
		Assert.assertEquals((double)0.0, arroz.getValor_real(), 0.001);
	}

}
