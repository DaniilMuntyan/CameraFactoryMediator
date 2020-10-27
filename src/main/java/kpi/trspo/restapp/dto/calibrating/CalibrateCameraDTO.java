package kpi.trspo.restapp.dto.calibrating;

import kpi.trspo.restapp.entities.camera.Camera;
import lombok.Data;

import java.util.UUID;

@Data
public final class CalibrateCameraDTO {
    private UUID calibratorId;
    private Camera camera;
}
