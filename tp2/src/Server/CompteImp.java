package Server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CompteImp extends UnicastRemoteObject implements Icompte {
	double montant ;
    
	public CompteImp(double M) throws RemoteException {
    	montant=M; }
	public CompteImp() throws RemoteException {
    	super();}
	
	
	public void cr�diter(double M) throws RemoteException{
		montant+=M;
	}

	public void d�biter(double M) throws RemoteException{
		montant-=M;
	}
	
	public double lire_solde() throws RemoteException {
	
		return this.montant;
	}
	
	
	
	
}
