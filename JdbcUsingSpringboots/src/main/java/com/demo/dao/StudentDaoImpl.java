package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.demo.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertStudent(Student student) {
        String sql = "insert into student(name, city, percentage) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, new Object[] {student.getName(), student.getCity(), student.getPercentage()});
    }

	@Override
	public int deletestudentById(int id) {
		// TODO Auto-generated method stub
		
		String sql="delete from student where id=?";
		return jdbcTemplate.update(sql,id) ;
	}
}
