package Server;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Icompte extends Remote {
	public void cr�diter(double montant) throws RemoteException;
	public void d�biter(double montant) throws RemoteException;
	public double lire_solde() throws RemoteException;

}
