package com.herux.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.herux.models.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{
    
}
