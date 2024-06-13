package ProblemThree;

public class MovablePoint extends Point {
    // Private instance variables
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
 
    // Constructors
    public MovablePoint() {}
 
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
 
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
 
    // Getter and setter methods
    public float getXSpeed() {
        return xSpeed;
    }
 
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
 
    public float getYSpeed() {
        return ySpeed;
    }
 
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
 
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
 
    public float[] getSpeed() {
        return new float[] { xSpeed, ySpeed };
    }
 
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }
 
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}