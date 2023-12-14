package arif.unikom.belajarjavareflection;

import arif.unikom.belajarjavareflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class FieldTest {

    @Test
    void testGetFields(){

        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName() + " : " + field.getType().getName());
        }

    }

    @Test
    void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Field firstname = personClass.getDeclaredField("firstName");
        firstname.setAccessible(true);

        Person person1 = new Person("Arif","Ramawijaya");

        String result = (String) firstname.get(person1);
        System.out.println(result);

        Person person2 = new Person("Budi","Nugroho");
        firstname.set(person2, "Tono"); // person2.setFirstName("Tono");
        System.out.println(person2.getFirstName());


    }

}
