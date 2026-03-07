package in.smvitm.ecea.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.smvitm.ecea.beans.Student;

public class Main {
    public static void main(String[] args) {

        String path="in/smvitm/ecea/resources/applicationContext.xml";
            ApplicationContext container = new ClassPathXmlApplicationContext(path);
         Student std = (Student) container.getBean("student");
         std.display();
    }
}
