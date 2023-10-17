package com.agencialetsgo.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.agencialetsgo.utils.Colors;

public class DatabaseConnection {
	
	private static final String url = "jdbc:mysql://localhost:3306/agencialetsgo";

	private static final String user = "root";

	private static final String password = "davi2702";

	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println(Colors.GREEN.get() + "Driver encontrado!" + Colors.RESET.get());

		} catch (ClassNotFoundException e) {
//			System.out.printf(Colors.RED.get() + "Driver nao encontrado! Mensagem: " + Colors.RESET.get());
		}

		try {
			Connection connection = DriverManager.getConnection(url, user, password);
//			System.out.println(Colors.GREEN.get() + "Conectado com sucesso!" + Colors.RESET.get());

			return connection;
		} catch (SQLException e) {
//			System.out.printf(Colors.RED.get() + " Nao foi possivel conectar ao banco! Mensagem: " + e.getMessage() + Colors.RESET.get());
			return null;
		}

	}

}
