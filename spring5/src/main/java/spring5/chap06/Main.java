package spring5.chap06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring5.chap06.config.AppConfImport;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfImport.class);
        Client client1 = ctx.getBean(Client.class);
        Client2 client2 = ctx.getBean(Client2.class);

        client1.send();
        client2.send();

        ctx.close();
    }
}
