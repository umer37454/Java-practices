package practices.tutorials.Annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@VeryImportant
class Cat{
    @Important
    String name;

    public Cat(String name){
        this.name = name;
    }

    @Quick(times = 3)
    @SuppressWarnings("unused") public void sound(){
        System.out.println("Meow");
    }

    @SuppressWarnings("unused") public void eat(){
        System.out.println("Ate the food");
    }
}

public class Annotations {
    public static void main(String[] args) throws Exception {

        @SuppressWarnings("unused")
        Cat cat = new Cat("Tom");

        Cat cat2 = new Cat("Jerry");
        displayInfo(cat2);

        // checking if class has annotation
        System.out.println(cat.getClass().isAnnotationPresent(VeryImportant.class));

        // checking which method of cat has annotations
        for (Method method : cat.getClass().getMethods()){
            if(method.isAnnotationPresent(Quick.class)){
                Quick annotation = method.getAnnotation(Quick.class);
                System.out.println(annotation);

                for(int i = 0; i < annotation.times(); i++){
                    method.invoke(cat);
                }
            }
        }

        // checking field annotations
        for (Field fields : cat.getClass().getDeclaredFields()) {
            if(fields.isAnnotationPresent(Important.class)){
                System.out.println("Important present");
            }

            if(fields.isAnnotationPresent(Important.class)){
                String name = (String) fields.get(cat);
                System.out.println(name);
            }

            Important annotation = fields.getAnnotation(Important.class);

            cat.name = annotation.name();
            System.out.println(cat.name);
        }

        @Important @SuppressWarnings("unused") String name;
    }

    @SuppressWarnings("unused")
    @VeryImportant
    public static void displayInfo(Cat cat){
        System.out.println(cat.name);
    }
}
