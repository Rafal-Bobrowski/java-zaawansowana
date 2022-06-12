package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    private static void exercise1() {
        Class<Student> clazz = Student.class;
        var methods = clazz.getMethods();
        var fields = clazz.getDeclaredFields();
        var constructors = clazz.getConstructors();

        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("\nFields:");
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }

    private static void exercise2(){
        Class<Student> clazz = Student.class;
        try {
            Constructor<Student> constructor = clazz.getConstructor(String.class, String.class, int.class, String.class);
            Student student = constructor.newInstance("Jan", "Kowalski", 8, "Economy");
            System.out.println(student);

            Method nameGetter = clazz.getMethod("getName");
            System.out.println((String) nameGetter.invoke(student));

            Method indexGetter = clazz.getMethod("getIndex");
            System.out.println((int) indexGetter.invoke(student));

            Field lastName = clazz.getDeclaredField("lastName");
            lastName.setAccessible(true);
            lastName.set(student, "Nowak");
            System.out.println(student.getLastName());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}

