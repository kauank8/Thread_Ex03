package controller;

import java.util.Random;

public class SapoController extends Thread{
	private int saltomaximo;
	private int distancia;
	private int sapo;
	
	public SapoController(int saltomaximo, int distancia, int sapo) {
		this.saltomaximo=saltomaximo;
		this.distancia=distancia;
		this.sapo=sapo;
	}
	public void run() {
		RealizaSalto();
	}
	public void RealizaSalto(){
		 Random Gerador=new Random();
		 int salto;
		 int x=0;
		 int acumulador=0;
		 for(salto=Gerador.nextInt(saltomaximo);acumulador<distancia;salto=+Gerador.nextInt(saltomaximo)) {
			 acumulador=salto+acumulador;
			 System.out.println("O sapo:"+ sapo + " Executou um salto de:" + salto +" E Percorreu: " +acumulador+"m");
		 } 
		 x=x+1;
		 System.out.println("O sapo:"+sapo + " chegou na " + x + " colocação");
	}
}