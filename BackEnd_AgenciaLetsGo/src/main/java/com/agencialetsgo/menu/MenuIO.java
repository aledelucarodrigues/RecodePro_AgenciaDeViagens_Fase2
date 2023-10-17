package com.agencialetsgo.menu;

import java.util.Scanner;

import com.agencialetsgo.utils.Colors;

public class MenuIO {

		public static int menu (Scanner scanner) {
			System.out.println(Colors.CYAN_BOLD_BRIGHT.get() + Colors.BLACK_BACKGROUND.get() + "AGÊNCIA LET'S GO" + Colors.RESET.get());
			System.out.println(Colors.CYAN_BOLD.get() + "Escolha uma opção entre 1 e 5:\n" + Colors.RESET.get()
			+ "1 - Cliente\n" + "2 - Destino\n" + "3 - Pedido\n" + "4 - Fale Conosco\n" + "5 - Sair\n");
			
			return scanner.nextInt();
		}
	}
