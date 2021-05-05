import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServisAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServisAdapter());
		
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Arda Cenker");
		customer.setLastName("Karagöz");
		customer.setDateOfBirth(LocalDate.of(2005, 26, 6));
		customer.setNationalityId(12345678910L);
		
		customerManager.save(customer);
	}

}
