package aplicacao;

import java.util.List;

import model.dao.FabricaDeDao;
import model.dao.VendedorDao;
import model.entitidades.Departamento;
import model.entitidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDao vendedorDao = FabricaDeDao.criaVendedorDao();
		
		System.out.println("=== Teste Nº1: Vendedor findById ===");
		Vendedor vendedor = vendedorDao.findById(3);
		System.out.println(vendedor);
		
		System.out.println();
		
		System.out.println("=== Teste Nº2: Vendedor findByDepartment ===");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> lista = vendedorDao.findByDepartment(departamento);
		for(Vendedor obj : lista) {
			System.out.println(obj);
		}
	}
}
