public class NEULibrary {
    public static void main(String[] args) {
        Student student = new Student();

        // Borrowing a book
        Resource book = new LibBook("Java Programming 1");
        student.borrowResource(book);

        // Borrowing a journal
        Resource journal = new Journals("Technology Journal");
        student.borrowResource(journal);

        // Accessing the internet
        Resource internet = new InternetAccs();
        student.borrowResource(internet);

        // Borrowing a newspaper
        Resource newspaper = new Newspaper("The Observer");
        student.borrowResource(newspaper);
    }
}