package com.example.myspringbootdemo.mapper;

import com.example.myspringbootdemo.entity.Department;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author zp
 * @create 2020/6/9 9:57
 */
@Mapper
public interface DepartmentMapper {

    /**
     * 普通单条
     * @param id
     * @return
     */
    Department getDepartmentById(int id);

    /**
     * 分步查询（collection）
     * @param id
     * @return
     */
    Department getDepsUser(int id);


}
