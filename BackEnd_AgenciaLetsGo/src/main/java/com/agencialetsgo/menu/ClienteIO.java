package com.agencialetsgo.menu;

import java.sql.Connection;
import java.util.Scanner;

import com.agencialetsgo.dao.ClienteDAO;
import com.agencialetsgo.database.DatabaseConnection;
import com.agencialetsgo.model.Cliente;
import com.agencialetsgo.utils.Colors;

public class ClienteIO {
	static Connection connection = DatabaseConnection.createConnection();
	static ClienteDAO clienteDAO = new ClienteDAO(connection);

	public static int SubMenuCliente(Scanner scanner) {
		int option = Integer.MAX_VALUE;
		do {
			System.out.println(Colors.CYAN_BOLD_BRIGHT.get() + Colors.BLACK_BACKGROUND.get() + "AGÊNCIA LET'S GO" + Colors.RESET.get());
			System.out.println(Colors.PURPLE_BOLD_BRIGHT.get()+ "\nMENU CLIENTE\n" + Colors.RESET.get() + "Informe qual opção deseja entre 0 e 4: \n" +
			"1 - Cadastrar\n" + "2 - Listar\n" + "3 - Atualizar\n" + "4 - Deletar\n" + "0 - Sair");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				scanner.nextLine();
				Cliente cliente = new Cliente();
				System.out.println("Nome Completo: ");
				cliente.setNomeCliente(scanner.nextLine());
				System.out.println("CPF: ");
				cliente.setCpfCliente(scanner.nextLine().trim());
				System.out.println("Telefone: ");
				cliente.setTelefoneCliente(scanner.nextLine().trim());
				System.out.println("Endereco: ");
				cliente.setEnderecoCliente(scanner.nextLine());
				System.out.println("Cidade: ");
				cliente.setCidadeCliente(scanner.nextLine());
				System.out.println("CEP: ");
				cliente.setCepCliente(scanner.nextInt());
				System.out.println("UF: ");
				cliente.setUfCliente(scanner.next().trim());
				System.out.println("E-mail: ");
				cliente.setEmailCliente(scanner.next().trim());
				System.out.println("Senha: ");
				cliente.setSenhaCliente(scanner.next().trim());
				System.out.println("Cartão de Crédito: ");
				cliente.setCartaoCreditoCliente(scanner.next().trim());
				System.out.println("Vencimento do Cartão de Crédito no formato MM/YY: ");
				cliente.setVencCartaoCreditoCliente(scanner.next().trim());
				scanner.nextLine();
				System.out.println("Nome Titular do Cartão de Crédito: ");
				cliente.setNomeTitularCartaoCredito(scanner.nextLine());
				System.out.println("CPF Titular do Cartão de Crédito: ");
				cliente.setCpfTitularCartaoCredito(scanner.next().trim());
						
				clienteDAO.createCliente(cliente);
				break;
			case 2:
				clienteDAO.readAllClients();
				break;
			case 3:
				Cliente clienteAtualizado = new Cliente();
				System.out.println("Digite o ID do cliente a ser atualizado: ");
				clienteAtualizado.setIdCliente(scanner.nextInt());
				scanner.nextLine();
				System.out.println("Nome Completo: ");
				clienteAtualizado.setNomeCliente(scanner.nextLine());
				System.out.println("CPF: ");
				clienteAtualizado.setCpfCliente(scanner.nextLine().trim());
				System.out.println("Telefone: ");
				clienteAtualizado.setTelefoneCliente(scanner.nextLine().trim());
				System.out.println("Endereco: ");
				clienteAtualizado.setEnderecoCliente(scanner.nextLine());
				System.out.println("Cidade: ");
				clienteAtualizado.setCidadeCliente(scanner.nextLine());
				System.out.println("CEP: ");
				clienteAtualizado.setCepCliente(scanner.nextInt());
				System.out.println("UF: ");
				clienteAtualizado.setUfCliente(scanner.next().trim());
				System.out.println("E-mail: ");
				clienteAtualizado.setEmailCliente(scanner.next().trim());
				System.out.println("Senha: ");
				clienteAtualizado.setSenhaCliente(scanner.next().trim());
				System.out.println("Cartão de Crédito: ");
				clienteAtualizado.setCartaoCreditoCliente(scanner.next().trim());
				System.out.println("Vencimento do Cartão de Crédito no formato MM/YY: ");
				clienteAtualizado.setVencCartaoCreditoCliente(scanner.next().trim());
				scanner.nextLine();
				System.out.println("Nome Titular do Cartão de Crédito: ");
				clienteAtualizado.setNomeTitularCartaoCredito(scanner.nextLine());
				System.out.println("CPF Titular do Cartão de Crédito: ");
				clienteAtualizado.setCpfTitularCartaoCredito(scanner.next().trim());
						
				clienteDAO.updateClient(clienteAtualizado);
				break;
			case 4:
				System.out.println("Digite o ID do Cliente a ser " + Colors.RED.get() + "EXCLUÍDO: " + Colors.RESET.get());
				int idCliente = scanner.nextInt();
				clienteDAO.deleteClient(idCliente);
				break;
			default:
				System.out.println(Colors.RED.get() + "Digite uma opção válida." + Colors.RESET.get());
	
			}

		} while (option != 0);
		return option;
	}
}
