package br.dev.luanderson.simplecrudemplyees.mapper;

import br.dev.luanderson.simplecrudemplyees.dtos.EmployeeDto;
import br.dev.luanderson.simplecrudemplyees.entities.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeDto toDto(Employee employee);
    Employee toEntity(EmployeeDto employeeDto);
    @Mapping(target = "id", ignore = true)
    void updateEmployeeFromDto(EmployeeDto employeeDto, @MappingTarget Employee employee);
}
