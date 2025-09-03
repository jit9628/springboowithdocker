


package com.docks.springbootwithdocker.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docks.springbootwithdocker.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	
	
}
