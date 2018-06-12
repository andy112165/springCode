package springCodes;

import org.junit.Before;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import springCodes.Bean.User;

public class XmlBeanFactoryTest {
	Resource resource;
	BeanFactory beanFactory;

	@Before
	public void before() {
		resource = new ClassPathResource("spring.xml");
		beanFactory = new XmlBeanFactory(resource);

	}

	@org.junit.Test
	public void test() {
		User user = beanFactory.getBean(User.class);
		user.setAge(10);
	}
}
