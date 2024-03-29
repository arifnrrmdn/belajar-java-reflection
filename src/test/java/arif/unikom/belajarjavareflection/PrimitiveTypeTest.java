package arif.unikom.belajarjavareflection;

import arif.unikom.belajarjavareflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrimitiveTypeTest {

    @Test
    void testClass(){

        Class<Integer> integerClass = int.class;
        Class<Boolean> booleanClass = boolean.class;
        Class<Long> longClass = long.class;

        System.out.println(integerClass.isPrimitive());
        System.out.println(booleanClass.isPrimitive());
        System.out.println(longClass.isPrimitive());

    }

    @Test
    void testGetField() throws NoSuchFieldException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Field age = personClass.getDeclaredField("age");

        System.out.println(age.getType().isPrimitive());

        age.setAccessible(true);

        Person person = new Person("Arif","Ramadhan");
        person.setAge(19);

        System.out.println(age.getInt(person));

    }

    @Test
    void testInvokeMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<Person> personClass = Person.class;

        Method setAge = personClass.getDeclaredMethod("setAge", int.class);

        Person person = new Person();
        setAge.invoke(person,25);

        System.out.println(person);

    }

}
