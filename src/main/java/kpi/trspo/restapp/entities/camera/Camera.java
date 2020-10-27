package kpi.trspo.restapp.entities.camera;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public final class Camera {
    private UUID camera_id;
    private String innerInfo;
    private Boolean isPacked = false;
    private Boolean isFirmware = false;
    private Boolean isWipedClean = false;
    private Boolean isRejected = false;

    @NonNull
    private CameraBack cameraBack;
    @NonNull
    private CameraBody cameraBody;
    @NonNull
    private CameraLens cameraLens;
}
