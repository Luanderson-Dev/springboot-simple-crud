package br.dev.luanderson.simplecrudemployees.repositories;

import br.dev.luanderson.simplecrudemployees.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
