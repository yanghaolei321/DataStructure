package proxy.proxy.annon;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnoInjection {

	public static Object getBean(Object obj) {
		try {
			// ���������
			Field f[] = obj.getClass().getDeclaredFields();
			// ��������
			for (Field ff : f) {
				// ��������ϵ�ע��
				Seven s = ff.getAnnotation(Seven.class);
				if (s != null) {
					System.err.println("ע��" + ff.getName() + "����" + "\t\t" + s.value());
					// �������public set����,���Ϊ���ʼ���private,��ô����ֱ��ʹ�����Ե�set(obj,
					// value);
					obj.getClass()
							.getMethod("set" + ff.getName().substring(0, 1).toUpperCase() + ff.getName().substring(1),
									new Class<?>[] { String.class })
							.invoke(obj, s.value());
				}
			}
			// ������з���
			Method m[] = obj.getClass().getDeclaredMethods();
			for (Method mm : m) {
				// ��÷���ע��
				Seven s = mm.getAnnotation(Seven.class);
				if (s != null) {
					System.err.println("ע��" + mm.getName() + "����" + "\t" + s.Property());
					mm.invoke(obj, s.Property());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}
