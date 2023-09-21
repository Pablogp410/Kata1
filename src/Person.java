package software.ulpgc.es;
import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge(){
        return toYears(LocalDate.now().toEpochDay()- birthday.toEpochDay());
    }

    private int toYears(long l) {
        return (int)
    }
}
