public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) { //конструктор
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getAuthor() { //геттеры
        return this.author.getFirstName() + " " + this.author.getLastName(); // для имени и фамилии при выводе
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) { //сеттер
        this.year = year;
    }
}
