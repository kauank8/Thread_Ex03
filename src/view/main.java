package view;

import java.util.Random;

import controller.SapoController;

public class main {

	public static void main(String[] args) {
		Random Gerador=new Random();
		int distancia_maxima=50;
		int saltomaximo=Gerador.nextInt(distancia_maxima)+1;
		int sapo;
		for(sapo=0;sapo<4;sapo++) {
			Thread SapoController=new SapoController(saltomaximo,distancia_maxima,sapo);
			SapoController.start();
		}

	}

}
