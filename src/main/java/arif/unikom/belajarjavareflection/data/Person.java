package arif.unikom.belajarjavareflection.data;

import arif.unikom.belajarjavareflection.annotation.NotBlank;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public final class Person implements Nameable, Serializable {

    @NotBlank
    private String firstName;

    @NotBlank(allowEmptyString = true)
    private String lastName;

    private List<String> hobbies;

    private int age;


    public Person(){

    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
