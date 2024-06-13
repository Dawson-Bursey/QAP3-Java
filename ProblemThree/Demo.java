package ProblemThree;

public class Demo {
    public static void main(String[] args) {
        // Creating instances of Point and MovablePoint
        Point p1 = new Point(1.5f, 2.5f);
        System.out.println("Point: " + p1);
 
        MovablePoint mp1 = new MovablePoint(1.5f, 2.5f, 0.5f, 1.5f);
        System.out.println("MovablePoint before move: " + mp1);
 
        // Moving the MovablePoint
        mp1.move();
        System.out.println("MovablePoint after move: " + mp1);
    }
}