package Server;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Icompte extends Remote {
	public void créditer(double montant) throws RemoteException;
	public void débiter(double montant) throws RemoteException;
	public double lire_solde() throws RemoteException;

}
