package aplicacao;

import java.util.Date;

import model.entitidades.Departamento;
import model.entitidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		Departamento obj = new Departamento(1, "Books");
		
		Vendedor vendedor = new Vendedor(21, "bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(vendedor);
	}
}
