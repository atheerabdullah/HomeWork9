public class Main {
    public static void main(String[] args) {


        Book B1= new Book("HI",16,"SALAH");
        Book B2= new Book("HELLO",18,"khaled");

        B1.displayIngo();
        B2.displayIngo();

        MovablePoint point1 = new MovablePoint(8,7,9,0);
        MovablePoint point2 = new MovablePoint(9,6,9,2);

        point1.MoveDown();
        point1.MoveUP();
        point1.MoveLeft();
        point1.MoveRight();




    }
    }