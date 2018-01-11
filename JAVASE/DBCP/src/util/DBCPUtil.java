package util;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DBCPUtil {

    static {
        Properties properties = new Properties();
        ClassLoader classLoader = DBCPUtil.class.getClassLoader();
        InputStream is =
            classLoader.getResourceAsStream("dbcp.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            DataSource ds = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static  DataSource getConn(){
        Connection connection = null;
    }




}
