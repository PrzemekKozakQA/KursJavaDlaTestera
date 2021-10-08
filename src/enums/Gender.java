package enums;

public enum Gender {
    MALE("mężczyzna"),
    FEMALE("kobieta");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }
}
