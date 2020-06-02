package study.startspringboot.mapper.datasource2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import study.startspringboot.entity.Teacher;

import java.util.List;

/**
 * @author only  you
 */
@Component
@Mapper
public interface DemoQueryTwo {
    /**
     *  查询所有老师信息
     * @return List<Teacher>
     */
    @Select("select * from teacher")
    @Results(id = "teacher",value= {
            @Result(property = "sno", column = "sno", javaType = String.class),
            @Result(property = "name", column = "sname", javaType = String.class),
            @Result(property = "sex", column = "ssex", javaType = String.class)
    })
    List<Teacher> getQueryAll();

}
