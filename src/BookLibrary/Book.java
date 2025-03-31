package BookLibrary;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title,String author){
     this.title = title;
     this.author = author;
     this.isBorrowed = false;
    }

    public void borrowBook(){
        if(!isBorrowed){
            isBorrowed = true;
            System.out.println(title + "has been borrowed");
        }else {
            System.out.println(title + "already borrowed");
        }
    }
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }
    public boolean isBorrowed(){
        return isBorrowed;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}
