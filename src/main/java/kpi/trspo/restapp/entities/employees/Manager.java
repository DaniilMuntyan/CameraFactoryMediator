package kpi.trspo.restapp.entities.employees;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
public final class Manager {

    private UUID id;

    private String name;

    private String surname;

    private String phone;
}
