package com.lanou3g.com;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main6 {
    public static void main(String[] args) {
//        {}匿名内部类实现ExcuteInter接口时复写的那个方法execute方法的方法体
        //conn就是execute 方法的参加
        JdbcUtil.execute(conn -> {
            try {
                PreparedStatement pstate = conn.prepareStatement("INSERT INTO  hw_user VALUES (NULL ,'zhangSan',30,'上海')");
                //将30岁的张三插入到批处理中
                pstate.addBatch();

                //添加批处理任务x
               pstate.addBatch(
                        "INSERT INTO  hw_user VALUES (NULL ,'liSi',11,'武汉')"
                );
                pstate.addBatch(
                        "INSERT INTO  hw_user VALUES (NULL ,'张三',10,'武汉')"
                );

//                开始执行批处理任务
                pstate.executeBatch();
                return pstate;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        });
    }

}
