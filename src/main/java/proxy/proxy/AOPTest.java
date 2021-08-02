package proxy.proxy;

import proxy.proxy.imp.AOPMethod;
import proxy.proxy.imp.AnimalInterface;

import java.lang.reflect.Method;

public class AOPTest {

    public static void main(String[] args) {

        AnimalInterface dog = AnimalFactory.getAnimal(DogImp.class, new AOPMethod() {
            @Override
            public void before(Object proxy, Method method, Object[] args) {
                if (method.getName().equals("getProperty")) {
                    System.err.println("before" + method.getName() + "");
                }
            }

            @Override
            public void after(Object proxy, Method method, Object[] args) {
                if (method.getName().equals("getProperty")){
                    System.err.println("after" + method.getName() + "");
                }
            }
        });
        dog.say();
        String name1 = "name1" + dog.getName();
        System.out.println(name1);
        dog.setName("dog");
        String name2 = "name2" + dog.getName();
        System.out.println(name2);
        dog.getProperty();
    }
}
