package study.startspringboot.aop;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 * 这是一个简单的AOP类，使用注解开发的
 * @author only you
 * @date  20200603
 */
@Aspect
@Component
public class AopDemo {
    @Before(value = "execution(* study.startspringboot.aop.AopDao.getBefore())")
    public void getDemo(){
        System.out.println("用户要操作数据库了-----------------");
    }
}
