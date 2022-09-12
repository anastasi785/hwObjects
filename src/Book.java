import java.util.Objects;

public class Book {
    private String Author;
    private String nameBook;
    private int dateOfReleasing;
    private String nameAuthor;

    public Book(String nameAuthor,String nameBook,int dateOfReleasing) {
        this.Author = nameAuthor;
        this.nameBook = nameBook;
        this.dateOfReleasing = dateOfReleasing;
    }
    public String getNameAuthor() {return this.Author;}
    public String getNameBook(){return this.nameBook;}
    public int getDateOfReleasing(){ return this.dateOfReleasing;}

    public void setDateOfReleasing (int dateOfReleasing){
        this.dateOfReleasing= dateOfReleasing;
    }
    
    public String toString(){
       return  "Автор"+ this.nameAuthor +"Название" +this.nameBook + "Дата выпуска"+this.dateOfReleasing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getDateOfReleasing() == book.getDateOfReleasing() && Objects.equals(Author, book.Author) && getNameBook().equals(book.getNameBook()) && getNameAuthor().equals(book.getNameAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(Author, getNameBook(), getDateOfReleasing(), getNameAuthor());
    }
}


