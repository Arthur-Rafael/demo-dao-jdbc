package model.dao;

import db.DB;
import model.dao.impl.VendedorDaoJDBC;

public class FabricaDeDao {

	public static VendedorDao criaVendedorDao() {
		return new VendedorDaoJDBC(DB.getConnection());
	}
}
