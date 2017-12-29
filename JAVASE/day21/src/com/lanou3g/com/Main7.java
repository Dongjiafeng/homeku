package com.lanou3g.com;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main7 {
    public static void main(String[] args) {
    /*
    事物的四个特性
    原子性
    一致性
    持久性
    隔离性
     */
    JdbcUtil.execute(conn -> {
        //设置为false,表示手动提交
        //也就是开启了事务
        //默认是自动提交的
        PreparedStatement pstate = null;
        try {
            conn.setAutoCommit(false);
             pstate= conn.prepareStatement("DELETE FROM  hw_user WHERE  uname =?");
            pstate.setString(1,"张三");
            pstate.execute();

//            Class.forName("");
            pstate.setString(1,"lisi");
            pstate.execute();
            //提交事务
            conn.commit();
//            return pstate;

        } catch (SQLException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
        //回滚,取消操作
        try {
            conn.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }return pstate;
    });

    }
}
