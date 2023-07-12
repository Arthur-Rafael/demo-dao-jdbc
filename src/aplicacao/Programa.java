package aplicacao;

import model.dao.FabricaDeDao;
import model.dao.VendedorDao;
import model.entitidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDao vendedorDao = FabricaDeDao.criaVendedorDao();
		
		Vendedor vendedor = vendedorDao.findById(3);
		
		System.out.println(vendedor);
	}
}
