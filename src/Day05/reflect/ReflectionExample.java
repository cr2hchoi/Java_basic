package Day05.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//리플렉션으로 car 클래스 정보 받아오는 예제 코드
//Spring 에서 내부적으로 사용하는 기법
public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class clazz = Car.class;
        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "(");
            Class[] parameters = constructor.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
        System.out.println(")(");

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods) {
            System.out.print(method.getName() + "(");
            Class[] parameters = method.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
    }

    private static void printParameters(Class[] parameters){
        for (int i = 0; i < parameters.length; i++) {
            System.out.println(parameters[i].getName());
            if(i<(parameters.length-1)){
                System.out.println(",");
            }
        }
    }
}
