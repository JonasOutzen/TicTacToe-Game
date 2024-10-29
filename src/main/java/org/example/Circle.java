package org.example;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.Geometry3D;


public class Circle {
    JavaCSG csg;
    public Circle(JavaCSG csg)
    {
        this.csg = csg;
    }

    public void getGeometryDonut() {
        Geometry3D circle1 = csg.torus3D(2,13,100,100,false);
        csg.view(circle1,2);
    }
}
