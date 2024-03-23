package com.example.yugabytedbtestcontainersspringboot;

import java.sql.Connection;

public interface DBConnection {
    Connection getConnection();
}
