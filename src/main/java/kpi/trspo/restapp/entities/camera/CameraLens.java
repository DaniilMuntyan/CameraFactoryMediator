package kpi.trspo.restapp.entities.camera;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public final class CameraLens {
    private UUID id;
    @NonNull
    private Integer focalLength;
    @NonNull
    private LensType lensType;
    private Camera camera;
}
