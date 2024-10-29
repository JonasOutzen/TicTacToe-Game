package org.example;

import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSGFactory;

public class Cross {
    JavaCSG csg;

    public Cross(JavaCSG csg)
    {
        this.csg = csg;
    }

    public void getGeometry() {
        Geometry3D box1 = csg.box3D(30, 6,6, false);
        Geometry3D box2 = csg.box3D(30, 6, 6, false); // Make the second box wider for cross effect
        box2 = csg.rotate3D(csg.degrees(0), csg.degrees(0), csg.degrees(90)).transform(box2);
        Geometry3D cross1 = csg.union3D(box1, box2);
        csg.view(cross1,1);
    }
}