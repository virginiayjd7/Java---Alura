package com.alura.jdbc.controller;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class ProductoController {

	public void modificar(String nombre, String descripcion, Integer id) {
		// TODO
	}

	public void eliminar(Integer id) {
		// TODO
	}

	public List<?> listar() {
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC", "root", "root1234")) {
			Statement statement = con.createStatement();
			boolean result = statement.execute("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
			System.out.println(result);
			return new ArrayList<>();
		} catch (SQLException e) {
			// Manejar la excepción o relanzarla si es necesario
			throw e;
		}


	}

    public void guardar(Object producto) {
		// TODO
	}

}
