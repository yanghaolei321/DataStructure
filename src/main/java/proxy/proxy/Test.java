package proxy.proxy;

import com.galaxy.helloworld.entity.HumanA;
import com.galaxy.helloworld.invcationHandler.InvactionHandler;
import proxy.proxy.imp.HumanBeavior;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {

		HumanA a  =  new HumanA();
		a.walking();

		InvactionHandler invactionHandler = new InvactionHandler(a);


		HumanBeavior proxy = (HumanBeavior)Proxy.newProxyInstance
			(HumanA.class.getClassLoader(), HumanA.class.getInterfaces(),invactionHandler);

		proxy.walking();


	}


}
