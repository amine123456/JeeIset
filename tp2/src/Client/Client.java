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
	        	 obj.créditer(m);
	        	 System.out.println("crédité");
	        	 obj.débiter(50);
	        	 System.out.println("débité");

	        	 double montant=obj.lire_solde();
	        	 System.out.println(montant);

	        	   	 
	         }
		
		   catch(Exception e){
			   e.printStackTrace();
		   }
	
	         
	      
	}
}
