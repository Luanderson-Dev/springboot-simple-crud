package br.dev.luanderson.simplecrudemplyees.services;

import br.dev.luanderson.simplecrudemplyees.dtos.EmployeeDto;
import br.dev.luanderson.simplecrudemplyees.entities.Employee;
import br.dev.luanderson.simplecrudemplyees.exceptions.ResourceNotFoundException;
import br.dev.luanderson.simplecrudemplyees.mapper.EmployeeMapper;
import br.dev.luanderson.simplecrudemplyees.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));
        return employeeMapper.toDto(employee);
    }

    public EmployeeDto createNewEmployee(EmployeeDto employeeDto) {
        Employee newEmployee = employeeMapper.toEntity(employeeDto);
        Employee savedEmployee = employeeRepository.save(newEmployee);
        return employeeMapper.toDto(savedEmployee);
    }

    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));
        employeeMapper.updateEmployeeFromDto(employeeDto, employee);
        Employee updatedEmployee = employeeRepository.save(employee);
        return employeeMapper.toDto(updatedEmployee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
