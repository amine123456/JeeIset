package Server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;


public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			   System.out.println("une autre version");
			   LocateRegistry.createRegistry(1099);
	            //Registry registry = LocateRegistry.getRegistry();
			   CompteImp compte= new CompteImp();
		       Naming.rebind("rmi://localhost:1099/compte", compte);
		       System.out.println(compte.toString());
		       }

		   catch(Exception e) {
			   e.printStackTrace();
		   }
		}

	}

