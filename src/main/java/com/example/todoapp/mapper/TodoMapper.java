package com.example.todoapp.mapper;

import java.util.List;

import com.example.todoapp.entity.Todo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper


public interface TodoMapper {
    @Select("select * from todo_items")
    public List<Todo> selectAll();
}
