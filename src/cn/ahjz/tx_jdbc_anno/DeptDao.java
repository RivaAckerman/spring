package cn.ahjz.tx_jdbc_anno;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by wind on 2018/11/7.
 */
@Repository //当前类加入容器
public class DeptDao implements IDeptDao {

    @Resource
    private JdbcTemplate jdbcTemplate;


    public void save(Dept dept){
        jdbcTemplate.update("INSERT INTO t_dept(deptName) VALUE('我的世界')");
    }
}
