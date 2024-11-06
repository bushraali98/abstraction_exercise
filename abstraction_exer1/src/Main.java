public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Head First Java", 137, "Kathy Sierra");
        Book book2 = new Book("Atomic Habits", 70, "James Clear");

        Movie movie1 = new Movie("It Ends with Us", 75, "Justin Baldoni");
        Movie movie2 = new Movie("Deadpool & Wolverine", 120,  "Shawn Levy");

        System.out.println("The price before discount for " + book1.getName() + " book is: " + book1.getPrice());
        System.out.println("The price after discount is: " + book1.getDiscount());

        System.out.println();
        System.out.println("The price before discount for " + book2.getName() + " book is: " + book2.getPrice());
        System.out.println("The price after discount is: " + book2.getDiscount());

        System.out.println();
        System.out.println("The price before discount for " + movie1.getName() + " movie is: " + movie1.getPrice());
        System.out.println("The price after discount is: " + movie1.getDiscount());

        System.out.println();
        System.out.println("The price before discount for " + movie2.getName() + " movie is: " + movie2.getPrice());
        System.out.println("The price after discount is: " + movie2.getDiscount());

    }
}