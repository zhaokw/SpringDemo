package pkg;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean implements InitializingBean, DisposableBean{
	//method called when initmethod is called from xml
	public void afterPropertiesSet() throws Exception {
		System.out.println("ExampleBean is initialised!");
	}
	//method called when destroy-method is called from xml
	public void destroy() throws Exception {
		System.out.println("ExampleBean is destroyed!");
	}

}
