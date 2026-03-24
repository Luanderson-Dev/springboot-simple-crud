package br.dev.luanderson.simplecrudemployees.services;

import br.dev.luanderson.simplecrudemployees.dtos.EmployeeRequestDto;
import br.dev.luanderson.simplecrudemployees.dtos.EmployeeResponseDto;
import br.dev.luanderson.simplecrudemployees.entities.Employee;
import br.dev.luanderson.simplecrudemployees.exceptions.ResourceNotFoundException;
import br.dev.luanderson.simplecrudemployees.mapper.EmployeeMapper;
import br.dev.luanderson.simplecrudemployees.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeResponseDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));
        return employeeMapper.toDto(employee);
    }

    public EmployeeResponseDto createNewEmployee(EmployeeRequestDto employeeDto) {
        Employee newEmployee = employeeMapper.toEntity(employeeDto);
        Employee savedEmployee = employeeRepository.save(newEmployee);
        return employeeMapper.toDto(savedEmployee);
    }

    public EmployeeResponseDto updateEmployee(Long id, EmployeeRequestDto employeeDto) {
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
