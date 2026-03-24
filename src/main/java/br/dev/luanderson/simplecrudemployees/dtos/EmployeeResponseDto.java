package br.dev.luanderson.simplecrudemployees.dtos;

public record EmployeeResponseDto(
        Long id,
        String email,
        String name,
        Long salary
) {}
