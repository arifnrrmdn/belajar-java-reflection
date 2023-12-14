package arif.unikom.belajarjavareflection;

import arif.unikom.belajarjavareflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ConstructorTest {

    @Test
    void testGetConstructors(){

        Class<Person> personClass = Person.class;

        Constructor<?>[] constructors = personClass.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors){
            System.out.println(constructor.getName());
            System.out.println(Arrays.toString(constructor.getParameterTypes()));
            System.out.println("=========");
        }
    }

    @Test
    void testCreateObjectUsingConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Person> personClass = Person.class;

        Constructor<Person> constructor = personClass.getConstructor();
        Constructor<Person> constructorParameters = personClass.getConstructor(String.class,String.class);

        Person person1 = constructor.newInstance();
        Person person2 = constructorParameters.newInstance("Test", "Berhasil");

        System.out.println(person1);
        System.out.println(person2);


    }

}
