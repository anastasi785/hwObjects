public class Book {
    private String nameAuthor;
    private String nameBook;
    private int dateOfReleasing;
    public Book(String nameAuthor,String nameBook,int dateOfReleasing) {
        this.nameAuthor = nameAuthor;
        this.nameBook = nameBook;
        this.dateOfReleasing = dateOfReleasing;
    }
    public String getNameAuthor() {return this.nameAuthor;}
    public String getNameBook(){return this.nameBook;}
    public int getDateOfReleasing(){ return this.dateOfReleasing;}

    public void setDateOfReleasing (int dateOfReleasing){
        this.dateOfReleasing= dateOfReleasing;
    }
    }

