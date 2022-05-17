package generic_types.ex4;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
class Author {
    private String name;
    private String lastName;
    private Sex sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName) && sex == author.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, sex);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}