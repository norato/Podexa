package test;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import main.ListaCompra;


public class TestListaCompras {

	@Test
	public void AdicionaListaCompra() {
		ListaCompra lista = new ListaCompra();
		
		String nome = "Nome da Lista";
		
		String descricao =  "Pode ser incluída uma descrição de detalhes da lista de compras";
		
		Calendar data_ = Calendar.getInstance();
		data_.set(2013, 11, 20);
		Date data = data_.getTime();
		
		double valor_previsto = 50.00;
		
		lista.setNome(nome);
		lista.setDescricao(descricao);
		lista.setData_prevista(data);
		lista.setValor_previsto(valor_previsto);
		
		Assert.assertEquals(nome, lista.getNome());
		Assert.assertEquals(descricao, lista.getDescricao());
		Assert.assertEquals(data, lista.getData_prevista());
		Assert.assertEquals(valor_previsto, lista.getValor_previsto());	
	}
	

}
