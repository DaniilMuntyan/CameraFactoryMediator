package kpi.trspo.restapp.entities.employees;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;
import java.util.UUID;

@Data
@NoArgsConstructor
public final class Technician{
    private UUID id;

    private String name;

    private String surname;

    private String phone;
}
