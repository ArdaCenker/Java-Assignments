package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServisAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		return proxy.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
	
	}

}
