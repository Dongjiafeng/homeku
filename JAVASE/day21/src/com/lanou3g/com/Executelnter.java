package com.lanou3g.com;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public interface Executelnter {
    Statement execute(Connection conn) throws SQLException;
}
