package arif.unikom.belajarjavareflection.validation;

import arif.unikom.belajarjavareflection.annotation.NotBlank;

import java.lang.reflect.Field;

public class Validator {

    public static void validateNotBlank(Object object) throws IllegalAccessException {

        //get class
        Class<?> aClass = object.getClass();

        // get all fields
        Field[] fields = aClass.getDeclaredFields();


        // iterate each field
        for(Field field : fields){

            field.setAccessible(true);
            //get not blank annotation
            NotBlank notBlank = field.getAnnotation(NotBlank.class);

            //check if @NotBlank is exists

            if(notBlank != null){

                // get field value
                String value = (String) field.get(object);

                if(notBlank.allowEmptyString()){
                    //allow empty
                    //ignore
                }else{
                    // not allow
                    value = value.trim();
                }

                if("".equals(value)){
                    // throw error
                    throw new RuntimeException(field.getName() + " must not blank");
                }

            }

        }



    }


}
