package springCodes;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springCodes.Bean.User;

public class ApplicationContextTest {

	ApplicationContext context;

	@Before
	public void before() {
		context = new ClassPathXmlApplicationContext("spring.xml");
	}

	@Test
	public void test() {
		User bean = context.getBean(User.class);
		System.out.println(bean.getAge());
	}

}
