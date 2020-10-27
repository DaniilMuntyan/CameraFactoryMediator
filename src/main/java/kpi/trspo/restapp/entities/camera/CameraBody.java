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
public final class CameraBody {
    private UUID id;
    @NonNull
    private Dimensions dimensions;
    @NonNull
    private String color;
    private Camera camera;
}
