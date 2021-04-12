package academy.belhard;

public final class Person {
    private final String firstName;
    private final String lastName;
    private final Gender gender;

    public Person(String firstName, String lastName, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Person)) return false;
        Person person = (Person) o;
        return person.firstName.equals(firstName) &&
                person.lastName.equals(lastName) &&
                person.gender.equals(gender);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Person[" +
                "firstName: " + firstName +
                ", lastName: " + lastName +
                ", gender: " + gender +
                "]";
    }

}
