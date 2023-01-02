package com.example.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class Controller {
    @Autowired
private JdbcTemplate db;

    @GetMapping("/test")
    public String test(){
        String sql = "INSERT INTO menn(Name, Age) VALUES ('thomas', 25)";
        db.update(sql);
        return "HEI";
    }

}
