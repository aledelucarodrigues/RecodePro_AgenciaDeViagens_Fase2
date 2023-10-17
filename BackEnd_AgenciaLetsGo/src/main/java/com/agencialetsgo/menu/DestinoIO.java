package com.agencialetsgo.menu;

import java.sql.Connection;
import java.util.Scanner;

import com.agencialetsgo.dao.DestinoDAO;
import com.agencialetsgo.database.DatabaseConnection;
import com.agencialetsgo.model.Destino;
import com.agencialetsgo.utils.Colors;

public class DestinoIO {
	static Connection connection = DatabaseConnection.createConnection();
	static DestinoDAO destinoDAO = new DestinoDAO(connection);

	public static int SubMenuDestino(Scanner scanner) {
		int option = Integer.MAX_VALUE;
		do {
			System.out.println(Colors.CYAN_BOLD_BRIGHT.get() + Colors.BLACK_BACKGROUND.get() + "AGÊNCIA LET'S GO" + Colors.RESET.get());
			System.out.println(Colors.PURPLE_BOLD_BRIGHT.get()+ "\nMENU DESTINO\n" + Colors.RESET.get() + "Informe qual opção deseja entre 0 e 4: \n" +
			"1 - Cadastrar\n" + "2 - Listar\n" + "3 - Atualizar\n" + "4 - Deletar\n" + "0 - Sair");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				scanner.nextLine();
				Destino destino = new Destino();
				System.out.println("Nome Destino: ");
				destino.setNomeDestino(scanner.nextLine());
				System.out.println("Descrição do Destino: ");
				destino.setDescricaoDestino(scanner.nextLine().trim());
				System.out.println("Endereço: ");
				destino.setEnderecoDestino(scanner.nextLine().trim());
				System.out.println("Cidade: ");
				destino.setCidadeDestino(scanner.nextLine());
				System.out.println("CEP: ");
				destino.setCepDestino(scanner.nextInt());
				scanner.nextLine();
				System.out.println("UF: ");
				destino.setUfDestino(scanner.nextLine());
				System.out.println("País: ");
				destino.setPaisDestino(scanner.next().trim());
										
				destinoDAO.createDestino(destino);
				break;
			case 2:
				destinoDAO.readAllDestinos();;
				break;
			case 3:
				Destino destinoAtualizado = new Destino();
				System.out.println("Digite o ID do destino a ser atualizado: ");
				destinoAtualizado.setIdDestino(scanner.nextInt());
				scanner.nextLine();
				System.out.println("Nome do Destino: ");
				destinoAtualizado.setNomeDestino(scanner.nextLine());
				System.out.println("Descrição do Destino: ");
				destinoAtualizado.setDescricaoDestino(scanner.nextLine().trim());
				System.out.println("Endereço Completo: ");
				destinoAtualizado.setEnderecoDestino(scanner.nextLine().trim());
				System.out.println("Cidade: ");
				destinoAtualizado.setCidadeDestino(scanner.nextLine());
				System.out.println("CEP: ");
				destinoAtualizado.setCepDestino(scanner.nextInt());
				scanner.nextLine();
				System.out.println("UF: ");
				destinoAtualizado.setUfDestino(scanner.nextLine());
				System.out.println("País: ");
				destinoAtualizado.setPaisDestino(scanner.next().trim());
							
				destinoDAO.updateDestino(destinoAtualizado);
				break;
			case 4:
				System.out.println("Digite o ID do Destino a ser " + Colors.RED.get() + "EXCLUÍDO: " + Colors.RESET.get());
				int idDestino = scanner.nextInt();
				destinoDAO.deleteDestino(idDestino);
				break;
			default:
				System.out.println(Colors.RED.get() + "Digite uma opção válida." + Colors.RESET.get());
			}

		} while (option != 0);
		return option;

}
}
