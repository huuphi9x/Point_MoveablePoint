public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    private float[] arrCoordinate = new float[2];

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
        arrCoordinate = new float[]{x, y};
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
        arrCoordinate[0] = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
        arrCoordinate[1] = y;
    }

    public float[] getXY() {
        return arrCoordinate;
    }

    public void setXY(float[] arrCoordinate) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" + arrCoordinate[0] + ", " + arrCoordinate[1] + ")";
    }
}
