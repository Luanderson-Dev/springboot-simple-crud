package br.dev.luanderson.simplecrudemplyees.dtos;

public record EmployeeResponseDto(
        Long id,
        String email,
        String name,
        Long salary
) {}
