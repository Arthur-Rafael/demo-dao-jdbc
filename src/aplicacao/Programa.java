package aplicacao;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.FabricaDeDao;
import model.dao.VendedorDao;
import model.entitidades.Departamento;
import model.entitidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
		
		System.out.println();
		
		System.out.println("=== Teste Nº3: Vendedor findAll ===");
		lista = vendedorDao.findAll();
		for(Vendedor obj : lista) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("=== Teste Nº4: Vendedor Insert ===");
		Vendedor novoVendedor = new Vendedor(null, "Greg", "greg@gmail.com", new Date(), 4000.0, departamento);
		vendedorDao.insert(novoVendedor);
		System.out.println("Inserido. Novo Id = " + novoVendedor.getId());
		
		System.out.println();
		
		System.out.println("=== Teste Nº5: Vendedor Update ===");
		vendedor = vendedorDao.findById(1);
		vendedor.setNome("Sarah Cameron");
		vendedorDao.update(vendedor);
		System.out.println("Atualização feita");
		
		System.out.println();
		
		System.out.println("=== Teste Nº6: Vendedor Delete ===");
		System.out.print("Digite o ID que será apagado: ");
		int id = sc.nextInt();
		vendedorDao.deleteById(id);
		System.out.println("Exclusão completa");
		
		sc.close();
	}
}
