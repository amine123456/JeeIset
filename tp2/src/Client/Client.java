package Client;

import java.rmi.Naming;

import Server.Icompte;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dsi
		     Icompte obj;
	         double m=100;
	         
	         try {
	        	 obj=(Icompte)Naming.lookup("rmi://localhost:1099/compte");
	        	 obj.cr�diter(m);
	        	 System.out.println("cr�dit�");
	        	 obj.d�biter(50);
	        	 System.out.println("d�bit�");

	        	 double montant=obj.lire_solde();
	        	 System.out.println(montant);

	        	   	 
	         }
		
		   catch(Exception e){
			   e.printStackTrace();
		   }
	
	         
	      
	}
}
