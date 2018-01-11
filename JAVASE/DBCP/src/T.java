import org.junit.Test;
import util.DBCPUtil;

import javax.sql.DataSource;
import java.sql.Connection;

public class T {
    @Test
    public void  t1(){
        Connection conn = DBCPUtil.getConn();
        System.out.println(conn);

    }
    @Test
    public void t2(){
        Connection conn = DBCPUtil.getConn();
        System.out.println(conn);
    }

    @Test
    public void  t3(){
        for (int i = 0; i <15 ; i++) {
            Connection conn = DBCPUtil.getConn();
            System.out.println(conn+"----------------");
        }

    }

    @Test
    public void t4(){
        for (int i = 0; i < 20; i++) {
            Connection conn = DBCPUtil.getConn();
            System.out.println(conn+"-----------");
        }
    }
}
