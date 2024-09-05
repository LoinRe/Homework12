public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) { //конструктор
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { //геттеры
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
