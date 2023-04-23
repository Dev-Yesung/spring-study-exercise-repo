package spring5.chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Greeter greeter1 = context.getBean("greeter", Greeter.class);
        Greeter greeter2 = context.getBean("greeter", Greeter.class);

        System.out.println("isGreeterInstance singleton? : " + (greeter1 == greeter2));
        System.out.println("greeter1 hashcode : " + greeter1.hashCode());
        System.out.println("greeter2 hashcode : " + greeter2.hashCode());
//        String msg = greeter1.greet("스프링");
//        System.out.println(msg);
        context.close();
    }
}
