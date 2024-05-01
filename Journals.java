public class Journals implements Resource {
    private String title;

    public Journals(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing journal: " + title);
    }
}