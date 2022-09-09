import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String nameAuthor = "Michail";
        String nameBook = "Heroy of our time";
        int dateOfReleasing = 1923;

        System.out.println("Имя автора " + nameAuthor + " " + "Название книги " + nameBook + " " + "Дата выпуска " + dateOfReleasing);

        String surnameAuthor = "Lermontov";

        System.out.println("Имя автора " + nameAuthor + " " + "Фамилия автора " + surnameAuthor);

    }

    Book book = new Book("Michail", "Heroy of our time", 1923);
    System.out.println("book.nameAuthor="+book.getNameAuthor());
    System.out.println("book.nameBook="+book.getNameBook());
    System.out.println("book.dateOfReleasing="+book.getDateOfReleasing());
    book.setDateOfReleasing(1922);

public static void idiot(){
    String author1 = "Fedor Dostoevsky";
    String name1 = "Idiot";
    int date1 = 1965;
    System.out.println("Имя автора " + author1 + " " + "Название книги " + name1 + " " + "Дата выпуска " + date1);


    String author2 = "Sergey Esenin";
    String name2 = "Bereza";
    int date2= 1952;
    System.out.println("Имя автора " + author2 + " " + "Название книги " + name2 + " " + "Дата выпуска " + date2);
}



}