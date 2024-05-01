public class LibBook implements Resource {
    private String title;

    public LibBook(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing book: " + title);
    }
}