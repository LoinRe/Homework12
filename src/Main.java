public class Main {
    public static void main(String[] args) {
        Author ivan = new Author("Ivan", "Ivanov");
        Author ron = new Author("Ron", "Pupkin");
        System.out.println("ron.firstName = " + ron.getFirstName());
        System.out.println("ivan.lastName = " + ivan.getLastName());
        Book ivanBook = new Book("Summer", ivan, 2010);
        Book ronBook = new Book("Autumn", ron, 2015);
        ronBook.setYear(2013);
        System.out.println("Книга Рона: " + ronBook.getAuthor() + ", " + ronBook.getName() + ", " + ronBook.getYear());

    }
}