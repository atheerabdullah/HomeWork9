public class MovablePoint implements Movable {
    private int x;
    private int y;

    private int xSpeed;
    private int ySpeed;

    // constructor

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x=x;
        this.y=y;
        this.xSpeed= xSpeed;
        this.ySpeed= ySpeed;
    }

    //getter and setter


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

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public void MoveUP() {
        y-=ySpeed;
        System.out.println(" the move tells us to :" + y);

    }

    @Override
    public void MoveDown() {
        y+=ySpeed;
        System.out.println(" the move tells us to :" + y);


    }

    @Override
    public void MoveLeft() {

        x-=xSpeed;
        System.out.println(" the move tells us to :" + x);

    }

    @Override
    public void MoveRight() {
        x+=xSpeed;
        System.out.println(" the move tells us to :" + x);

    }
}
