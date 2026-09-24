package task1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {

        AbstractApplicationContext con = new ClassPathXmlApplicationContext("task11.xml");
        Employee e1= con.getBean("s1",Employee.class);
        System.out.println(e1);

        con.close();
    }
}
