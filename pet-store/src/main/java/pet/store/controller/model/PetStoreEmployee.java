package pet.store.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Employee;
import pet.store.entity.PetStore;

@Data
@NoArgsConstructor
public class PetStoreEmployee {

	private Long employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private Integer employeePhoNum;
	private String employeeJobTitle;
	
	PetStore petStore = new PetStore();
	Set<PetStoreEmployee> petStoreEmployee = new HashSet<>();

	public PetStoreEmployee(Employee employee) {
		employeeId = employee.getEmployeeId();
		employeeFirstName = employee.getEmployeeFirstName();
		employeeLastName = employee.getEmployeeLastName();
		employeePhoNum = employee.getEmployeePhoNum();
		employeeJobTitle = employee.getEmployeeJobTitle();
		
	}
}
