package springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;
import springexpressionlanguage.model.Demo;
@Component
public class SpELApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spEL.xml");
        Demo demo = context.getBean("demo", Demo.class);
        System.out.println(demo);


        SpelExpressionParser parser = new SpelExpressionParser();
        SpelExpression expression = parser.parseRaw("10+20+30+40");
        System.out.println(expression.getValue());

    }
}
