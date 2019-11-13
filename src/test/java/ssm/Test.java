package ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xdl.dao.EtHelloDao;
import com.xdl.service.EtOccurLogService;


public class Test {
public static void main(String[] args) {
	ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
	EtHelloDao b=app.getBean(EtHelloDao.class);
	System.out.println(b.findAllEtOccurLog());
	}
}
