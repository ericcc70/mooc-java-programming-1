
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public boolean equals(Object compared) {
        // if the variables are located in the same place, they are the same.
        if (this == compared) {
            return true;
        }

        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof Book)) {
            return false;
        }

        // let's cast the object to SimpleDate
        Book otherDate = (Book) compared;

        // if the object's values are the same, the objects are the same
        if (this.name.equals(otherDate.name) && this.publicationYear == otherDate.publicationYear){
                 
            return true;
        }

        // other wise, the objects are not the same
        return false;
    }

}
