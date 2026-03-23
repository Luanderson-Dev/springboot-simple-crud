package br.dev.luanderson.simplecrudemplyees.dtos;

public record EmployeeDto(
        Long id,
        String email,
        String name,
        Long salary
) {}
