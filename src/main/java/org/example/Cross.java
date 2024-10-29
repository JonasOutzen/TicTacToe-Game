package org.example;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.Geometry3D;

public class Cross {
    JavaCSG csg;
    public Cross() {
        this.csg = csg;
    }

    public void getGeometry() {
        Geometry3D box1 = csg.box3D(15, 5, 5, false);
        Geometry3D box2 = csg.box3D(15, 5, 5, false);
        box2 = csg.rotate3D(csg.degrees(45), csg.degrees(0), csg.degrees(0)).transform(box2);

    }
}