package br.dev.luanderson.simplecrudemplyees.mapper;

import br.dev.luanderson.simplecrudemplyees.dtos.EmployeeRequestDto;
import br.dev.luanderson.simplecrudemplyees.dtos.EmployeeResponseDto;
import br.dev.luanderson.simplecrudemplyees.entities.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeResponseDto toDto(Employee employee);
    Employee toEntity(EmployeeRequestDto employeeDto);
    @Mapping(target = "id", ignore = true)
    void updateEmployeeFromDto(EmployeeRequestDto employeeDto, @MappingTarget Employee employee);
}
