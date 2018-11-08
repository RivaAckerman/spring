package cn.ahjz.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by wind on 2018/11/7.
 */
public class DeptDao {

    private DataSource datasource;

    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
    }

    public void save(Dept dept) throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection conn =DriverManager.getConnection("jdbc:mysql:///test?characterEncoding=UTF8","root","625251580");
        Connection conn=datasource.getConnection();
        PreparedStatement prep = conn.prepareStatement("INSERT INTO t_dept(deptName) VALUE('GAT5')");
        prep.executeUpdate();
        prep.close();
        conn.close();

    }
}
