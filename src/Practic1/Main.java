package Practic1;
public class Main {


    public static void main(String[] args) {
        Practic1.BookClass b1 = new Practic1.BookClass("Harry Potter and the Sorcerer's Stone", 400);
        Practic1.BookClass b2 = new Practic1.BookClass("2666", 912);
        Practic1.BookClass b3 = new Practic1.BookClass("Black Leopard, Red Wolf", 620);
        Practic1.BookClass b4 = new Practic1.BookClass("Freedom", 676);
        Practic1.BookClass b5 = new Practic1.BookClass();
        Practic1.BookClass b6 = new Practic1.BookClass();
        b1.intoMinutesForReading();
        b2.intoMinutesForReading();
        b3.intoMinutesForReading();
        b4.intoMinutesForReading();
        b5.setPages(b3.getPages());
        b5.setName(b3.getName());
        b5.intoMinutesForReading();
        b6.setPages(b2.getPages());
        b6.setName(b1.getName());
        b6.intoMinutesForReading();
        System.out.println(b5);
        System.out.println(b6);
    }
}
