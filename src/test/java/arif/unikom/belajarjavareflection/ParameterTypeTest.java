package arif.unikom.belajarjavareflection;

import arif.unikom.belajarjavareflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;

public class ParameterTypeTest {

    @Test
    void getMethodGeneric() throws NoSuchMethodException {

        Class<Person> personClass = Person.class;
        Method getHobbies = personClass.getDeclaredMethod("getHobbies");


        Type type = getHobbies.getGenericReturnType();
        System.out.println(type.getTypeName());

        if (type instanceof ParameterizedType){
            ParameterizedType parameterizedType = (ParameterizedType) type;

            System.out.println(parameterizedType.getRawType());
            System.out.println(parameterizedType.getOwnerType());
            System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
        }

    }

    @Test
    void getMethodParameterGeneric() throws NoSuchMethodException {

        Class<Person> personClass = Person.class;
        Method getHobbies = personClass.getDeclaredMethod("setHobbies", List.class);

        Type[] types = getHobbies.getGenericParameterTypes();

        for (Type type : types){

            System.out.println(type.getClass());

            if (type instanceof ParameterizedType){
                ParameterizedType parameterizedType = (ParameterizedType) type;

                System.out.println(parameterizedType.getRawType());
                System.out.println(parameterizedType.getOwnerType());
                System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
            }
        }

    }

    @Test
    void getFieldGeneric() throws NoSuchMethodException, NoSuchFieldException {

        Class<Person> personClass = Person.class;
        Field hobbies = personClass.getDeclaredField("hobBies");

        Type type = hobbies.getGenericType();
        System.out.println(type.getTypeName());

        if (type instanceof ParameterizedType){
            ParameterizedType parameterizedType = (ParameterizedType) type;

            System.out.println(parameterizedType.getRawType());
            System.out.println(parameterizedType.getOwnerType());
            System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
        }

    }

}
