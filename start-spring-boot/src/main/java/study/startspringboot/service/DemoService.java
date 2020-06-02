package study.startspringboot.service;

import study.startspringboot.entity.Teacher;

import java.util.List;

/**
 * @author only you
 */
public interface DemoService {
    /**
     * 查询数据源1所有信息
     *
     * @return
     */
    List<Teacher> getQueryAll();
    /**
     * 查询数据源2所有信息
     *
     * @return
     */
    List<Teacher> getQueryAllTwo();
}
