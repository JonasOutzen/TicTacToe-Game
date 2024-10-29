package org.example;

import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

public class Board {
    JavaCSG csg;

    public Board(JavaCSG csg) {
        this.csg = csg;
    }

    public void getBoard() {
        Geometry3D box1 = csg.box3D(100, 100, 5, false);
        Geometry3D Line1x = csg.box3D(2, 100, 5, false);
        Geometry3D Line2x = csg.box3D(2, 100, 5, false);
        Geometry3D Line1y = csg.box3D(100, 2, 5, false);
        Geometry3D Line2y = csg.box3D(100, 2, 5, false);

        Line1x = csg.translate3D(17, 0, 5).transform(Line1x);
        Line2x = csg.translate3D(-17, 0, 5).transform(Line2x);

        Line1y = csg.translate3D(0, -17, 5).transform(Line1y);
        Line2y = csg.translate3D(0, 17, 5).transform(Line2y);

        Line1y = csg.rotate3D(csg.degrees(0), csg.degrees(0), csg.degrees(180)).transform(Line1y);
        Line2y = csg.rotate3D(csg.degrees(0), csg.degrees(0), csg.degrees(180)).transform(Line2y);

        Geometry3D board = csg.union3D(box1, Line1x, Line2x, Line1y, Line2y);
        csg.view(board, 3);
    }
}