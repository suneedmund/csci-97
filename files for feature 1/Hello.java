import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * User: sup
 * Date: 23/11/11
 * Time: 10:50 PM
 */
public interface Hello extends Remote {
  String sayHello() throws RemoteException;
}
