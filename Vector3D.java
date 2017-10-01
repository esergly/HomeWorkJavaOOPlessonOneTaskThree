package HomeWorkLessonOneTaskThree;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        super();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    public static Vector3D sumVectors(Vector3D a, Vector3D b){
        Vector3D c = new Vector3D(a.x + b.x, a.y + b.y,a.z + b.z);
        return c;
    }

    public static Vector3D scalmulVectors(Vector3D a, Vector3D b){
        Vector3D c = new Vector3D(a.x * b.x, a.y * b.y,a.z * b.z);
        return c;
    }

    public static Vector3D mulVectors(Vector3D a, Vector3D b){
        Vector3D c = new Vector3D((a.y*b.z - a.z*b.y), (a.z*b.x - a.x*b.z), (a.x*b.y-a.y*b.x));
        return c;
    }
}
