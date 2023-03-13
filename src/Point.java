public class Point {

    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        Point p = new Point(0,0);

        return Math.sqrt(((p.getX() - this.getX()) * (p.getX() - this.getX()))
                +((p.getY() - this.getY()) * (p.getY() - this.getY())));
    }

    public double distance(int x, int y){
        Point p = new Point(x,y);

        return Math.sqrt(((p.getX() - this.getX()) * (p.getX() - this.getX()))
                +((p.getY() - this.getY()) * (p.getY() - this.getY())));
    }

    public double distance(Point p){

        return Math.sqrt(((p.getX() - this.getX()) * (p.getX() - this.getX()))
                +((p.getY() - this.getY()) * (p.getY() - this.getY())));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
