package com.json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DBtoJSONReport{
    public static void main(String[] args) throws Exception{

        Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test", "root", "password");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT id, name, age FROM users");
        List<Map<String, Object>> list = new ArrayList<>();
        while(rs.next()){
            Map<String, Object> row = new HashMap<>();
            row.put("id", rs.getInt("id"));
            row.put("name", rs.getString("name"));
            row.put("age", rs.getInt("age"));
            list.add(row);
        }
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(list);
        System.out.println(json);
        con.close();
    }
}
