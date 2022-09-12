import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author (String nameAuthor,String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
    public String getSurnameAuthor(){ return this.surnameAuthor;}

    @Override
    public String toString() {
        return "Author{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", surnameAuthor='" + surnameAuthor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(getSurnameAuthor(), author.getSurnameAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, getSurnameAuthor());
    }
}

