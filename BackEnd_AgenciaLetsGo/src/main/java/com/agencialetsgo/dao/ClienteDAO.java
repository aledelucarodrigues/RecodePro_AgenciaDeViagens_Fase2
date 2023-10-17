package com.agencialetsgo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.agencialetsgo.model.Cliente;
import com.agencialetsgo.utils.Colors;

public class ClienteDAO {

	private static String sql;

	private final Connection connection;

	public ClienteDAO(Connection connection) {
		this.connection = connection;
	}

	// CREATE CLIENTE - AGENCIA VIAGENS LETS GO
	public void createCliente(Cliente cliente) {
		sql = "INSERT INTO cliente (nomeCliente, cpfCliente, telefoneCliente, enderecoCliente, cidadeCliente, cepCliente,"
				+ " ufCliente, emailCliente, senhaCliente, cartaoCreditoCliente, vencCartaoCreditoCliente,"
				+ " nomeTitularCartaoCredito, cpfTitularCartaoCredito) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1, cliente.getNomeCliente());
			stmt.setString(2, cliente.getCpfCliente());
			stmt.setString(3, cliente.getTelefoneCliente());
			stmt.setString(4, cliente.getEnderecoCliente());
			stmt.setString(5, cliente.getCidadeCliente());
			stmt.setInt(6, cliente.getCepCliente());
			stmt.setString(7, cliente.getUfCliente());
			stmt.setString(8, cliente.getEmailCliente());
			stmt.setString(9, cliente.getSenhaCliente());
			stmt.setString(10, cliente.getCartaoCreditoCliente());
			stmt.setString(11, cliente.getVencCartaoCreditoCliente());
			stmt.setString(12, cliente.getNomeTitularCartaoCredito());
			stmt.setString(13, cliente.getCpfTitularCartaoCredito());
			
			stmt.executeUpdate();
			System.out.println(Colors.GREEN.get() + "Cliente criado com sucesso\n" + Colors.RESET.get() + "Nome: "
					+ cliente.getNomeCliente() + "\nCPF: " + cliente.getCpfCliente());
			
		} catch (SQLException e) {
			System.out.println(Colors.RED.get() + "[LOG] Nao foi possivel criar o cliente." + Colors.RESET.get()
			+ "Mensagem: " + e.getMessage());
		}
	}

	// READ CLIENTE - AGENCIA VIAGENS LETS GO
	public void readAllClients() {
		sql = "SELECT * FROM cliente";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet r = stmt.executeQuery();
			while (r.next()) {
				Cliente cliente = new Cliente();
				cliente.setIdCliente(r.getInt("idCliente"));
				cliente.setNomeCliente(r.getString("nomeCliente"));
				cliente.setCpfCliente(r.getString("cpfCliente"));
				cliente.setTelefoneCliente(r.getString("telefoneCliente"));
				cliente.setEnderecoCliente(r.getString("enderecoCliente"));
				cliente.setCidadeCliente(r.getString("cidadeCliente"));
				cliente.setCepCliente(r.getInt("cepCliente"));
				cliente.setUfCliente(r.getString("ufCliente"));
				cliente.setEmailCliente(r.getString("emailCliente"));
				cliente.setSenhaCliente(r.getString("senhaCliente"));
				cliente.setCartaoCreditoCliente(r.getString("cartaoCreditoCliente"));
				cliente.setVencCartaoCreditoCliente(r.getString("vencCartaoCreditoCliente"));
				cliente.setNomeTitularCartaoCredito(r.getString("nomeTitularCartaoCredito"));
				cliente.setCpfTitularCartaoCredito(r.getString("cpfTitularCartaoCredito"));

				System.out.printf("\n ID: %d\n Nome: %s\n CPF: %s\n E-mail: %s\n Telefone: %s\n", cliente.getIdCliente(),
						cliente.getNomeCliente(), cliente.getCpfCliente(), cliente.getEmailCliente(),
						cliente.getTelefoneCliente());

			}
			if (!r.next()) {
				System.out.println(Colors.PURPLE_BOLD_BRIGHT.get() + "\nFim dos Dados." + Colors.RESET.get());
			}

		} catch (SQLException e) {
			System.out.println(Colors.RED.get() + "[LOG] Não foi possível acessar as informações. " + Colors.RESET.get()
					+ "Mensagem: " + e.getMessage());
		}
	}

	// UPDATE CLIENTE - AGENCIA VIAGENS LETS GO
	public void updateClient(Cliente cliente) {
		sql = "UPDATE cliente SET nomeCliente = ?, cpfCliente = ?, telefoneCliente = ?, enderecoCliente = ?,"
				+ " cidadeCliente = ?, cepCliente = ?, ufCliente = ?, emailCliente = ?, senhaCliente = ?,"
				+ " cartaoCreditoCliente = ?, vencCartaoCreditoCliente = ?, nomeTitularCartaoCredito = ?,"
				+ " cpfTitularCartaoCredito = ?  WHERE idCliente = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, cliente.getNomeCliente());
			stmt.setString(2, cliente.getCpfCliente());
			stmt.setString(3, cliente.getTelefoneCliente());
			stmt.setString(4, cliente.getEnderecoCliente());
			stmt.setString(5, cliente.getCidadeCliente());
			stmt.setInt(6, cliente.getCepCliente());
			stmt.setString(7, cliente.getUfCliente());
			stmt.setString(8, cliente.getEmailCliente());
			stmt.setString(9, cliente.getSenhaCliente());
			stmt.setString(10, cliente.getCartaoCreditoCliente());
			stmt.setString(11, cliente.getVencCartaoCreditoCliente());
			stmt.setString(12, cliente.getNomeTitularCartaoCredito());
			stmt.setString(13, cliente.getCpfTitularCartaoCredito());
			stmt.setInt(14, cliente.getIdCliente());

			stmt.executeUpdate();
			System.out.println(Colors.GREEN.get() + "Cliente atualizado com sucesso\n" + Colors.RESET.get() + "Nome: "
					+ cliente.getNomeCliente() + "\nCPF: " + cliente.getCpfCliente());

		} catch (SQLException e) {
			System.out.println(Colors.RED.get() + "[LOG] Não foi possível atualizar o cliente. " + Colors.RESET.get()
					+ "Mensagem: " + e.getMessage());
		}
	}

	// DELETE CLIENTE - AGENCIA VIAGENS LETS GO
	public void deleteClient(int id) {
		sql = "DELETE FROM cliente WHERE idCliente = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, id);

			stmt.executeUpdate();
			System.out.println(Colors.GREEN.get() + "Cliente excluído com sucesso!" + Colors.RESET.get());
		} catch (SQLException e) {
			System.out.println(Colors.RED.get() + "Não foi possível excluir o cliente selecionado. " + Colors.RESET.get()
					+ "Mensagem: " + e.getMessage());
		}
	}
}
