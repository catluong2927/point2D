public class Point2D {
    private float x;
    private float y;

    Point2D(){};
    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float [] getXY(){
        float [] xy = {this.x,this.y};
        return xy;
    }

    public String toString(){
        return "x = " + x + ", y= " +y;
    }
}

class Point3D extends Point2D{
    private float z;

    Point3D(){};

    Point3D(float x, float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y, float z){
        setX(x);
        setY(y);
        setZ(z);
    }
    public float [] getXYZ(){
        float [] xyz = {getX(),getY(),getZ()};
        return xyz;
    }



    @Override
    public String toString(){
      return  "x = " + getX() + ", y= " + getY() + " z= " + z ;
    };
}
