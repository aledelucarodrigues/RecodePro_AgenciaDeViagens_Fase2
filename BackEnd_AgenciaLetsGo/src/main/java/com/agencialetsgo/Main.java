package com.agencialetsgo;

import java.util.Scanner;

import com.agencialetsgo.database.DatabaseConnection;
import com.agencialetsgo.utils.Colors;
import com.agencialetsgo.menu.ClienteIO;
import com.agencialetsgo.menu.DestinoIO;
import com.agencialetsgo.menu.MenuIO;

public class Main {

	public static void main(String[] args) {
		
		var connection = DatabaseConnection.createConnection();
		Scanner scanner = new Scanner (System.in);

		int option = 0;

		do {
			option = MenuIO.menu(scanner);

			switch (option) {
			case 1:
				ClienteIO.SubMenuCliente(scanner);
				break;
			case 2:
				DestinoIO.SubMenuDestino(scanner);
				break;
				
			case 3:
				System.out.println(Colors.GREEN_BOLD_BRIGHT.get() + "Em construção. Em breve você verá as opções para PEDIDO. \n" + Colors.RESET.get());
				break;
			case 4:
				System.out.println(Colors.GREEN_BOLD_BRIGHT.get() + "Em construção. Em breve você verá as opções para FALE CONOSCO. \n" + Colors.RESET.get());
				break;
			case 5:
				scanner.close();
				System.out.println(Colors.PURPLE_BOLD_BRIGHT.get() + "Menu encerrado com sucesso!" + Colors.RESET.get());
				break;
			default:
				System.out.println(Colors.RED.get() + "Digite uma opção válida! \n" + Colors.RESET.get());
			}

		} while (option != 5);
	}
}