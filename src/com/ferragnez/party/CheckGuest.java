package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		//Array elenco lista invitati
	    String[] ListaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", 
	    						  "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
	    
	    //utilità
	    String NomeOspite;
	    Boolean x = false;
	    
	    // Chiedo all'ospite di fornirmi nome e cognome
	    System.out.println("Inserisci nome e cognome: ");
	    NomeOspite = scan.nextLine();
	    
	    //Verifica se l'ospite è in lista
	    
	    for (int i = 0; i < ListaInvitati.length; i++) {
	    	if(NomeOspite.equalsIgnoreCase(ListaInvitati[i]))  {
	    		System.out.println("Entra"); 
	    		x = true;
	    		} 
	    	
	    }if (!x) {
		   System.out.println("non entri");
	   }
	   	scan.close();	
	}
}