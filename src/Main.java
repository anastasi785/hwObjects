import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Mikchail", "Lermontov");
        Book heroyOfOurTime = new Book("Heroy of our time", 1956, author);
        heroyOfOurTime.setPublisherData(1864);
        System.out.println(author);
        System.out.println(heroyOfOurTime);

        Author fedorDostoevsky=new Author("Fedor","Dostoevsky");
        Book idiot=new Book("Idiot",1687,fedorDostoevsky);
        idiot.setPublisherData(1675);
        System.out.println(fedorDostoevsky);
        System.out.println(idiot);

        Author michailBulgakov=new Author("Michail","Bulgakov");
        Book master=new Book("Master",1847,michailBulgakov);
        master.setPublisherData(1895);
        System.out.println(michailBulgakov);
        System.out.println(master);
        System.out.println(author);
        System.out.println(michailBulgakov);
        System.out.println(fedorDostoevsky.equals(fedorDostoevsky));
        System.out.println(idiot.equals(master));
        System.out.println(idiot.hashCode());









    }
}





