package br.dev.luanderson.simplecrudemployees.dtos;

public record EmployeeRequestDto(
   String email,
   String name,
   Long salary
) {}
