package arif.unikom.belajarjavareflection;

import arif.unikom.belajarjavareflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

public class ModifierTest {

    @Test
    void testModifierClass() {

        Class<Person> personClass = Person.class;

        System.out.println(Modifier.isPublic(personClass.getModifiers()));
        System.out.println(Modifier.isAbstract(personClass.getModifiers()));
        System.out.println(Modifier.isInterface(personClass.getModifiers()));
        System.out.println(Modifier.isPrivate(personClass.getModifiers()));
        System.out.println(Modifier.isFinal(personClass.getModifiers()));


    }

}
