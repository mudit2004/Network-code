//function prototype
import java.rmi.*;

public interface MyServerIntf extends Remote		//remote interface having add
{	int i=0;
	double add(double a, double b) throws RemoteException;
}
