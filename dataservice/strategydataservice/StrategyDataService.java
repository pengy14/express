/**
 * 
 */
/**
 * @author jjlb
 *
 */
package strategydataservice;

import java.rmi.RemoteException;

public interface StrategyDataService{
	public void observe(String stra) throws RemoteException;
	
	public double calprice(double weight,String departureplace,String destination)throws RemoteException;
}