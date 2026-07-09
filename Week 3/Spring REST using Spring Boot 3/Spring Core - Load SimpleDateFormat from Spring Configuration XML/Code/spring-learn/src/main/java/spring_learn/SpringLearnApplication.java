package spring_learn;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat formatter =
                context.getBean("dateFormat", SimpleDateFormat.class);

        System.out.println("Today's Date : " + formatter.format(new Date()));

        context.close();
    }
}