package study.startspringboot.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author only you
 */
@Aspect
@Component
public class AopNoteDemo {
    @Before(value ="@annotation(study.startspringboot.aop.AopNote)")
    public void getDemo(){
        System.out.println("我是注解开发AOP-----------------");
    }
}