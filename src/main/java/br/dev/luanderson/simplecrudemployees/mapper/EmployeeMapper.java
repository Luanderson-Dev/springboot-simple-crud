package br.dev.luanderson.simplecrudemployees.mapper;

import br.dev.luanderson.simplecrudemployees.dtos.EmployeeRequestDto;
import br.dev.luanderson.simplecrudemployees.dtos.EmployeeResponseDto;
import br.dev.luanderson.simplecrudemployees.entities.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeResponseDto toDto(Employee employee);
    Employee toEntity(EmployeeRequestDto employeeDto);
    void updateEmployeeFromDto(EmployeeRequestDto employeeDto, @MappingTarget Employee employee);
}
