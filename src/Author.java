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

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return lastName.equals(c2.lastName) && firstName.equals(c2.firstName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }
}
