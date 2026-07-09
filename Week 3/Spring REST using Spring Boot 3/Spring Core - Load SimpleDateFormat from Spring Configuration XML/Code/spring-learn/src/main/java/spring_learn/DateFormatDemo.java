package spring_learn;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DateFormatDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat formatter =
                context.getBean("dateFormat", SimpleDateFormat.class);

        System.out.println("Today's Date : " +
                formatter.format(new Date()));

        context.close();
    }
}