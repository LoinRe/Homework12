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

        System.out.println("----Вторая часть домашки-----");

        System.out.println(new Author("Alex", "Ivanov")); //проверяем toString
        System.out.println(ivanBook);

        Author c = new Author("Vanya", "Ivanov"); //проверяем equals
        Author c2 = ivan;
        System.out.println(c.equals(c2));

        Book a = new Book("Лето", ivan, 2010);
        Book a2 = ivanBook;
        System.out.println(a.equals(a2));

        System.out.println(ron.hashCode()); //проверяем hashcode
        System.out.println(ivanBook.hashCode());
    }
}