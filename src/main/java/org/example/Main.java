package org.example;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class Main {
    public static void main(String[] args) {
        JavaCSG csg = JavaCSGFactory.createNoCaching();
        Cross cross = new Cross(csg);
        Board board = new Board(csg);
        Circle circle = new Circle(csg);

        cross.getGeometry();
        circle.getGeometryDonut();
        board.getBoard();

    }
}