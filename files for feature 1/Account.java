package cscie160.project;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * User: sup
 */
public interface Account extends Remote{

    public double getBalance() throws RemoteException;
    public void withdrawAmount(double amount) throws RemoteException;
    public void depositAmount(double amount) throws RemoteException;

}
