package practices.tutorials.Annotations;

import java.lang.reflect.Method;

@VeryImportant
class Cat{
    String name;

    public Cat(String name){
        this.name = name;
    }

    @Quick(times = 4)
    public void sound(){
        System.out.println("Meow");
    }

    public void eat(){
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
    }

    @SuppressWarnings("unused")
    @VeryImportant
    public static void displayInfo(Cat cat){
        System.out.println(cat.name);
    }
}
