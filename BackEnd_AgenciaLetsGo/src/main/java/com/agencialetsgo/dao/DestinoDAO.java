package com.agencialetsgo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.agencialetsgo.model.Destino;
import com.agencialetsgo.utils.Colors;

public class DestinoDAO {
	private static String sql;

	private final Connection connection;

	public DestinoDAO(Connection connection) {
		this.connection = connection;}
		
		// CREATE DESTINO - AGENCIA VIAGENS LETS GO
		public void createDestino(Destino destino) {
			sql = "INSERT INTO destino (nomeDestino, descricaoDestino, enderecoDestino, cidadeDestino, cepDestino, ufDestino,"
					+ "paisDestino) VALUES (?,?,?,?,?,?,?)";
			try (PreparedStatement stmt = connection.prepareStatement(sql)){
				stmt.setString(1, destino.getNomeDestino());
				stmt.setString(2, destino.getDescricaoDestino());
				stmt.setString(3, destino.getEnderecoDestino());
				stmt.setString(4, destino.getCidadeDestino());
				stmt.setInt(5, destino.getCepDestino());
				stmt.setString(6, destino.getUfDestino());
				stmt.setString(7, destino.getPaisDestino());
				
				stmt.executeUpdate();
				System.out.println(Colors.GREEN_BOLD.get() + "Destino criado com sucesso!\n" + Colors.RESET.get() + "Nome: "
						+ destino.getNomeDestino());
				
			} catch (SQLException e) {
				System.out.println(Colors.RED_BOLD.get() + "[LOG] Não foi possível criar o destino. " + Colors.RESET.get()
				+ "Mensagem: " + e.getMessage());
			}
		}

		// READ DESTINO - AGENCIA VIAGENS LETS GO
		public void readAllDestinos() {
			sql = "SELECT * FROM destino";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				ResultSet r = stmt.executeQuery();
				while (r.next()) {
					Destino destino = new Destino();
					destino.setIdDestino(r.getInt("idDestino"));
					destino.setNomeDestino(r.getString("nomeDestino"));
					destino.setDescricaoDestino(r.getString("descricaoDestino"));
					destino.setEnderecoDestino(r.getString("enderecoDestino"));
					destino.setCidadeDestino(r.getString("cidadeDestino"));
					destino.setCepDestino(r.getInt("cepDestino"));
					destino.setUfDestino(r.getString("ufDestino"));
					destino.setPaisDestino(r.getString("paisDestino"));
					
					System.out.printf("\n ID: %d\n Nome: %s\n Descrição: %s\n Pais: %s\n", destino.getIdDestino(),
							destino.getNomeDestino(), destino.getDescricaoDestino(), destino.getPaisDestino());

				}
				if (!r.next()) {
					System.out.println(Colors.PURPLE_BOLD_BRIGHT.get() + "\nFim dos Dados." + Colors.RESET.get());
				}

			} catch (SQLException e) {
				System.out.println(Colors.RED.get() + "[LOG] Não foi possível acessar as informações. " + Colors.RESET.get()
						+ "Mensagem: " + e.getMessage());
			}
		}

		// UPDATE DESTINO - AGENCIA VIAGENS LETS GO
		public void updateDestino(Destino destino) {
			sql = "UPDATE destino SET nomeDestino = ?, descricaoDestino = ?, enderecoDestino = ?, cidadeDestino = ?,"
					+ " cepDestino = ?, ufDestino = ?, paisDestino = ? WHERE idDestino = ?";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setString(1, destino.getNomeDestino());
				stmt.setString(2, destino.getDescricaoDestino());
				stmt.setString(3, destino.getEnderecoDestino());
				stmt.setString(4, destino.getCidadeDestino());
				stmt.setInt(5, destino.getCepDestino());
				stmt.setString(6, destino.getUfDestino());
				stmt.setString(7, destino.getPaisDestino());
				stmt.setInt(8, destino.getIdDestino());

				stmt.executeUpdate();
				System.out.println(Colors.GREEN_BOLD.get() + "Destino atualizado com sucesso!\n" + Colors.RESET.get() +
						"\nID Destino: " + destino.getIdDestino() + "\nNome Destino: " + destino.getNomeDestino() +
						"\nPais: " + destino.getPaisDestino());

			} catch (SQLException e) {
				System.out.println(Colors.RED.get() + "[LOG] Não foi possível atualizar o destino. " + Colors.RESET.get()
						+ "Mensagem: " + e.getMessage());
			}
		}

		// DELETE DESTINO - AGENCIA VIAGENS LETS GO
		public void deleteDestino(int id) {
			sql = "DELETE FROM destino WHERE idDestino = ?";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setInt(1, id);

				stmt.executeUpdate();
				System.out.println(Colors.GREEN_BOLD.get() + "Destino excluído com sucesso!" + Colors.RESET.get());
			} catch (SQLException e) {
				System.out.println(Colors.RED.get() + "Não foi possível excluir o destino selecionado. " + Colors.RESET.get()
						+ "Mensagem: " + e.getMessage());
			}
}
}