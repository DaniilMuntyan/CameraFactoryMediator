package kpi.trspo.restapp.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public final class Calibrator {

    private UUID id;
    private String name;
}
