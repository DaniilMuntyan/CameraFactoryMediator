package kpi.trspo.restapp.dto.final_stage;

import kpi.trspo.restapp.entities.camera.Camera;
import lombok.Data;

import java.util.UUID;

@Data
public final class FinalCheckDTO {
    private UUID technicianId;
    private UUID packerId;
    private UUID managerId;
    private Camera camera;
}
