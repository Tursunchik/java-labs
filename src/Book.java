public class Book {
    String title;
    String author;
    double price;

    Book(String title , String author , double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    double applyDiscount(double percent){
        price = price % percent;
        return price;
    }

    void showDetails(){
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Idiot" ; "Dostoevsky" , "200.0");
        Book b2 = new Book("Karamazov Brothers" , "Dostoevsky" , "300.0");
        Book b3 = new Book("White nights" , "Dostoevsky" , "150.0");

        b1.applyDiscount(10.0);
        b2.applyDiscount(20.0);

        b1.showDetails();
        b2.showDetails();
        b3.showDetails();

    }
}
