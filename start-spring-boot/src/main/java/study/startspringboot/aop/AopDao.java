package study.startspringboot.aop;

import org.springframework.stereotype.Component;

/**
 * @author only one
 */
@Component
public class AopDao {
    public void getBefore(){
        System.out.println("我操作数据库：");
    }
    @AopNote
    public void getBeforeTWO(){
        System.out.println("我是巨无霸：");
    }


}
