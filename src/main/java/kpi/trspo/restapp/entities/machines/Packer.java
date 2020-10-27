package kpi.trspo.restapp.entities.machines;

import kpi.trspo.restapp.entities.camera.Camera;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public final class Packer extends Machine {

    public Packer(String name) {
        super(name);
    }

    public void pack(Camera camera) {
        camera.setIsPacked(true);
    }

}
