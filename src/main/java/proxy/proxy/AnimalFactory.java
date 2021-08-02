package proxy.proxy;

import proxy.proxy.annon.AnnoInjection;
import proxy.proxy.imp.AOPMethod;

import java.lang.reflect.Proxy;

public class AnimalFactory {

    /***
     * ��ȡ���󷽷�
     * @param obj
     * @return
     */
    private static Object getAnimalBase(Object obj, AOPMethod method) {

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
            obj.getClass().getInterfaces(),
            new AOPHandle(AnnoInjection.getBean(obj), method));
    }

    /***
     * ��ȡ���󷽷�
     * @param obj
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getAnimal(Object obj, AOPMethod aopMethod) {
        return (T) getAnimalBase(obj, aopMethod);
    }

    /***
     * ��ȡ���󷽷�
     * @param className
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getAnimal(String className, AOPMethod method) {
        Object obj = null;
        try {
            obj = getAnimalBase(Class.forName(className).newInstance(), method);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) obj;
    }

    /***
     * ��ȡ���󷽷�
     * @param clz
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getAnimal(Class<?> clz, AOPMethod method) {
        Object obj = null;
        try {
            obj = getAnimalBase(clz.newInstance(), method);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) obj;
    }
}
