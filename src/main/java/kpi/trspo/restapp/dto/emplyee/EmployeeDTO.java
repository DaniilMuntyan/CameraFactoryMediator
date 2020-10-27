package kpi.trspo.restapp.dto.emplyee;

import lombok.Data;

import java.util.UUID;

@Data
public final class EmployeeDTO {
    private UUID id;
    private String name;
    private String surname;
    private String phone;
}
