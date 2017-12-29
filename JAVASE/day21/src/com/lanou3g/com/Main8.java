package com.lanou3g.com;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) throws SQLException {
        //dbUtil是apache公司给我们提供的一个工具类

        //强行翻译,询问执行者
        QueryRunner qr = new QueryRunner();
        String sql = "select * from hw _user";
        List<User> query = qr.query(JdbcUtil.getConnection(), sql,

        new ResultSetHandler<List<User>>() {
            @Override
            public List<User> handle(ResultSet resultSet) throws SQLException {
                //TODO 把resultset中的数据
                //封装一个对象
                List<User> users = new ArrayList<>();
               while (resultSet.next()) {
                   User user = new User();
                   user.setId(resultSet.getInt(1));
                   user.setName(resultSet.getString(2));
                   user.setAge(resultSet.getInt(3));
                   user.setLoc(resultSet.getString(4));
                   users.add(user);
               }
                return users;
            }
        });
        System.out.println(query);
    }
}
