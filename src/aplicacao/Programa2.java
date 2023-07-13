package aplicacao;

import java.util.List;
import java.util.Scanner;

import model.dao.DepartamentoDao;
import model.dao.FabricaDeDao;
import model.entitidades.Departamento;

public class Programa2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartamentoDao departamentoDao = FabricaDeDao.criaDepartamentoDao();

		System.out.println("=== Teste Nº1: Departamento findById ===");
		Departamento departamento = departamentoDao.findById(1);
		System.out.println(departamento);

		System.out.println();

		System.out.println("=== Teste Nº2: Departamento findAll ===");
		List<Departamento> list = departamentoDao.findAll();
		for (Departamento d : list) {
			System.out.println(d);
		}

		System.out.println();

		System.out.println("=== Teste Nº3: Departamento Insert ===");
		Departamento dep = new Departamento(null, "Musica");
		departamentoDao.insert(dep);
		System.out.println("Inserido. Novo Id = " + dep.getId());

		System.out.println();

		System.out.println("=== Teste Nº4: Vendedor Update ===");
		Departamento dep2 = departamentoDao.findById(1);
		dep2.setNome("Carregamento");
		departamentoDao.update(dep2);
		System.out.println("Atualização feita");

		System.out.println();

		System.out.println("=== Teste Nº5: Vendedor Delete ===");
		System.out.print("Digite o ID que será apagado: ");
		int id = sc.nextInt();
		departamentoDao.deleteById(id);
		System.out.println("Exclusão completa");

		sc.close();

	}
}
