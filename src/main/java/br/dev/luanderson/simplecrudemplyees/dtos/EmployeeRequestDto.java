package br.dev.luanderson.simplecrudemplyees.dtos;

public record EmployeeRequestDto(
   String email,
   String name,
   Long salary
) {}
