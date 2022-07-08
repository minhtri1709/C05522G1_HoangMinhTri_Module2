package ss6_inheritance.excersice.excersice3.model;

public class Point {
    private float x;
    private float y;

    public Point(){

    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{getX(), getY()};
    }

    public void setXY(float x, float y){
        this.x= x;
        this.y = y;
    }

}
