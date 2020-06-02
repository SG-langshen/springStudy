package study.startspringboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.startspringboot.entity.Teacher;
import study.startspringboot.mapper.datasource1.DemoQuery;
import study.startspringboot.mapper.datasource2.DemoQueryTwo;
import study.startspringboot.service.DemoService;

import java.util.List;

/**
 * @author only you
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    DemoQuery demoQuery;
    @Autowired
    DemoQueryTwo demoQueryTwo;

    @Override
    public List<Teacher> getQueryAll() {
        return demoQuery.getQueryAll();
    }

    @Override
    public List<Teacher> getQueryAllTwo() {
        return demoQuery.getQueryAll();
    }
}
