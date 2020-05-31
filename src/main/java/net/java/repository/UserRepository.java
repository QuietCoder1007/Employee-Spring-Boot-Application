package net.java.repository;

import org.springframework.data.repository.CrudRepository;

import net.java.entity.Employee;

public interface UserRepository extends CrudRepository<Employee, Long> {

}
