import java.util.Scanner;

class library{
    String[]books;
    int no_of_books;
    library(){
        this.books = new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
    }
    public void IssueBook(String book){
        for(int i =0 ; i<this.books.length ; i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("this book doesn't exist");
    }
    public void returnBook(String book){
        addBook(book);
        System.out.println("The books has been returned successfully");
    }
    public void showAvailableBooks(){
        System.out.println("Available books are:");
        for(String book : this.books){
            if(book==null){
                continue;
            }
            System.out.println(" * "+book);
        }
    }

}
public class online_library_question {
    public static void main(String[] args) {
        library centrallibrary = new library();
        Scanner sc = new Scanner(System.in);
        int n;
        while(true) {
            System.out.println("Library have the following function : \n1.Show available books \n2.Add books to the library\n3.Issue a book from library\n4.Return the book to the library\nEnter your choice :");
            n = sc.nextInt();
            if (n == 1) {
                centrallibrary.showAvailableBooks();
            } else if (n == 2) {
                int t;
                String name;
                System.out.println("How many books you wanna add :");
                t = sc.nextInt();
                for (int i = 0; i < t; i++) {
                    System.out.println("Enter the book name :");
                    name = sc.next();
                    centrallibrary.addBook(name);
                }
                System.out.println("All the book is added in your library");

            } else if (n == 3) {
                String name;
                System.out.println("Enter the book name you want to issue");
                name = sc.next();
                centrallibrary.IssueBook(name);
            } else if (n == 4) {
                String name;
                System.out.println("Enter the book name you want to return");
                name = sc.next();
                centrallibrary.returnBook(name);
            } else {
                break;

            }
        }
//        centrallibrary.addBook("It End With Us");
//        centrallibrary.addBook("It Start With Us");
//        centrallibrary.addBook("The Harry potter");
//        centrallibrary.addBook("Million of kisses");
//        centrallibrary.addBook("Algorithms");
//        centrallibrary.showAvailableBooks();
//        centrallibrary.IssueBook("Algorithms");
//        centrallibrary.showAvailableBooks();
//        centrallibrary.returnBook("Algorithms");
//        centrallibrary.showAvailableBooks();


    }
}
