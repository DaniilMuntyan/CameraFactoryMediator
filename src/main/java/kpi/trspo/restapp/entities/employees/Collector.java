package kpi.trspo.restapp.entities.employees;

import kpi.trspo.restapp.entities.camera.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;


@Data
@NoArgsConstructor
public final class Collector {
    private UUID id;

    private String name;

    private String surname;

    private String phone;

}
