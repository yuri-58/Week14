package pet.store.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Customer;
import pet.store.entity.Employee;
import pet.store.entity.PetStore;

@Data
@NoArgsConstructor
public class PetStoreData {

	public Long petStoreId;
	private String petStoreName;
	private String petStoreAddress;
	private String petStoreCity;
	private String petStoreState;
	private Integer petStoreZip;
	private Integer petStorePhoNum;
	
	Set<PetStoreCustomer> customers = new HashSet<PetStoreCustomer>();
	
	Set<PetStoreEmployee> employees = new HashSet<PetStoreEmployee>();

	public PetStoreData(PetStore save) {
		 this.petStoreId = save.getPetStoreId();
		 this.petStoreName = save.getPetStoreName();
		 this.petStoreAddress = save.getPetStoreAddress();
		 this.petStoreCity = save.getPetStoreCity();
		 this.petStoreState = save.getPetStoreState();
		 this.petStoreZip = save.getPetStoreZip();
		 this.petStorePhoNum = save.getPetStorePhoNum();
		
		for (Customer customer : save.getCustomers()) {
			this.customers.add(new PetStoreCustomer(customer));
		}
		
		for (Employee employee : save.getEmployees()) {
			this.employees.add(new PetStoreEmployee(employee));
		}
	}

	

	

	
	
}
