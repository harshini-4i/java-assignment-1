abstract class LibraryItem {
    protected String title;
    protected int itemId;
    protected boolean issued;

    LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.issued = false;
    }

    abstract int calculateFine(int daysLate);

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
        System.out.println("Issued: " + issued);
    }

    public String getTitle() {
        return title;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }
}

interface Issuable {
    void issueItem();
    void returnItem();
}

class Book extends LibraryItem implements Issuable {

    Book(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int calculateFine(int daysLate) {
        return daysLate * 5;
    }

    @Override
    public void issueItem() {
        issued = true;
    }

    @Override
    public void returnItem() {
        issued = false;
    }

    @Override
    public String toString() {
        return "Item : " + title + " (Book)";
    }
}

class Magazine extends LibraryItem implements Issuable {

    Magazine(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int calculateFine(int daysLate) {
        return daysLate * 2;
    }

    @Override
    public void issueItem() {
        issued = true;
    }

    @Override
    public void returnItem() {
        issued = false;
    }

    @Override
    public String toString() {
        return "Item : " + title + " (Magazine)";
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Book book1 = new Book("Java Basics", 101);
        Book book2 = new Book("Data Structures", 102);

        Magazine magazine1 = new Magazine("Science Today", 201);
        Magazine magazine2 = new Magazine("Tech World", 202);

        book1.issueItem();
        book2.issueItem();
        magazine1.issueItem();
        magazine2.issueItem();

        LibraryItem[] items = {
            book1, magazine1, book2, magazine2
        };

        int[] lateDays = {4, 4, 2, 2};

        for (int i = 0; i < items.length; i++) {

            int fine = items[i].calculateFine(lateDays[i]);

            System.out.println(
                items[i] + " | Fine for "
                + lateDays[i] + " days late : Rs." + fine
            );
        }

        book1.returnItem();
        book2.returnItem();
        magazine1.returnItem();
        magazine2.returnItem();
    }
}