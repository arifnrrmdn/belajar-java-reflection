package arif.unikom.belajarjavareflection;

import arif.unikom.belajarjavareflection.data.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ClassTest {


    @Test
    void createTestClass() throws ClassNotFoundException {

        // 3 Cara membuat class reflection

        // 1. cara pertama
        Class<Person> personClass1 = Person.class;

        // 2. cara kedua
        Class<?> personClass2 = Class.forName("arif.unikom.belajarjavareflection.data.Person");

        // 3. cara ketiga
        Person person = new Person();
        Class<? extends Person> personClass3 = person.getClass();

    }

    @Test
    void testClassMethod() {

        Class<Person> personClass = Person.class;

        System.out.println(personClass.getSuperclass());
        System.out.println(Arrays.toString(personClass.getInterfaces()));
        System.out.println(Arrays.toString(personClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(personClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(personClass.getDeclaredFields()));
        System.out.println(personClass.getModifiers());
        System.out.println(personClass.getPackage());
        System.out.println(personClass.getName());
        System.out.println(personClass.getSimpleName());

    }

}
