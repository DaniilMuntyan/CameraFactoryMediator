package kpi.trspo.restapp.entities.camera;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public final class CameraBack {
    private UUID id;
    private Boolean matrixCheck = false;
    @NonNull
    private Dimensions dimensions;
    @NonNull
    private Integer resolution;
    @NonNull
    private Integer colorDepth;
    private Camera camera;
}
