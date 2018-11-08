package cn.ahjz.tx_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by wind on 2018/11/7.
 */
public class DeptDao implements IDeptDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Dept dept){
        jdbcTemplate.update("INSERT INTO t_dept(deptName) VALUE('我的世界')");
    }
}
