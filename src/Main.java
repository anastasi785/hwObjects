import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String nameAuthor = "Michail";
        String nameBook = "Heroy of our time";
        int dateOfReleasing = 1923;
        String surnameAuthor = "Lermontov";


    }

    Book book = new Book("Michail", "Heroy of our time", 1923);

    {

        System.out.println("book.nameAuthor=" + book.getNameAuthor());
        System.out.println("book.nameBook=" + book.getNameBook());
        System.out.println("book.dateOfReleasing=" + book.getDateOfReleasing());
        book.setDateOfReleasing(1922);
    }

    public void idiot() {
        String author1 = "Fedor Dostoevsky";
        String name1 = "Idiot";
        int date1 = 1965;
        Book idiot = new Book("Fedor Dostoevsky", "Idiot", 1965);
        System.out.println("book.author1=" + book.getNameAuthor());
        System.out.println("book.name1=" + book.getNameBook());
        System.out.println("book.date1=" + book.getDateOfReleasing());
        book.setDateOfReleasing(1922);}

        String author2 = "Sergey Esenin";
        String name2 = "Bereza";
        int date2 = 1952;
        Book Bereza = new Book("Sergey Esenin", "Beresa", 1952);

}





