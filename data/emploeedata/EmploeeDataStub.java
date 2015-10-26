package emploeedata;

import java.rmi.RemoteException;

import po.EmploeePO;
import emploeedataservice.EmploeeDataService;

public class EmploeeDataStub implements EmploeeDataService{

	public EmploeePO find(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("find 213421");
		return new EmploeePO("1231442");
	}

	public void insertEmp(String ID) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("insert 张三  160011");
	}

	public void delete(String ID, EmploeePO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("delete employee john 213221");
	}

	public void update(String ID, EmploeePO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("update employee swift 413432");
	}

	public void modify(String ID, EmploeePO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("modify emploee lan  213445");
	}

}
