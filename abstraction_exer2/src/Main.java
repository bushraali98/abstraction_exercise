public class Main {
    public static void main(String[] args) {

        MovablePoint move = new MovablePoint(0, 0, 5, 10);
        System.out.println("Initial Position: \nX: " + move.getX() + "\nY: " + move.getY());
        move.moveUp();
        System.out.println("New Position: \nX: " + move.getX() + "\nY: " + move.getY());
        move.moveRight();
        System.out.println("New Position: \nX: " + move.getX() + "\nY: " + move.getY());
        move.moveDown();
        System.out.println("New Position: \nX: " + move.getX() + "\nY: " + move.getY());
        move.moveLeft();
        System.out.println("New Position: \nX: " + move.getX() + "\nY: " + move.getY());

    }
}