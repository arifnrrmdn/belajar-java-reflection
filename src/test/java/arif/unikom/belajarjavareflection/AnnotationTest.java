package arif.unikom.belajarjavareflection;

import arif.unikom.belajarjavareflection.data.Person;
import arif.unikom.belajarjavareflection.validation.Validator;
import org.junit.jupiter.api.Test;

public class AnnotationTest {

    @Test
    void testValidateUsingAnnotation() throws IllegalAccessException {

        Person person = new Person("  ", "Ramadhan");
        Validator.validateNotBlank(person);

    }

}
