package kpi.trspo.restapp.entities.camera;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class Dimensions {
    private Integer width;
    private Integer length;
    private Integer depth;

    public Dimensions(String s) {
        this(Integer.parseInt(s.split("x")[0]), Integer.parseInt(s.split("x")[1]),
                Integer.parseInt(s.split("x")[2]));
    }

    @Override
    public String toString() {
        return width + "x" + length + "x" + depth + " см³";
    }
}
