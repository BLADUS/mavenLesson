/**
 * @author Vladislav Osada
 * @date 16.04.2023 13:26
 */
public class Vector {
    private double x;
    private double y;

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

   @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double length(){
        return Math.sqrt(x*x + y*y);
    }

}
