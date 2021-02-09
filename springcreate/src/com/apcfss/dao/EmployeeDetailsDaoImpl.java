package com.apcfss.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.apcfss.model.EmployeeDetails;

@Repository("employeedao")
public class EmployeeDetailsDaoImpl implements EmployeeDetailsDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public boolean createEmployee(EmployeeDetails emp) {
		String sql="insert into springemployee(id,name,salary,designation) values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getSalary()+"','"+emp.getDesignation()+"')";
		int i=jdbcTemplate.update(sql);
	//	jdbcTemplate.
		if(i>0){
			System.out.println("-----------inserted successfully-------");
			return true;
					
		}
		return false;

	}
	   public int delete(int id) {
		      //String SQL = "delete from Student where id = 'emp.getId()'";
		      String SQL = "delete from springemployee where id = "+id+"";
		      int delres = jdbcTemplate.update(SQL);
		     if(delres>0){
		    	System.out.println("sucess");
		     }
		     System.out.println("failed");
			return delres;
		}
	   public EmployeeDetails getEmpById(int id){    
		    String sql="select * from springemployee where id=?";    
		    return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<EmployeeDetails>(EmployeeDetails.class));    
		}   
	   public List<EmployeeDetails> getEmployees(){    
		    return jdbcTemplate.query("select * from springemployee",new RowMapper<EmployeeDetails>(){    
		        public EmployeeDetails mapRow(ResultSet rs, int row) throws SQLException {    
		        	EmployeeDetails e=new EmployeeDetails();    
		            e.setId(rs.getInt(1));    
		            e.setName(rs.getString(2));    
		            e.setSalary(rs.getFloat(3));    
		            e.setDesignation(rs.getString(4));    
		            return e;    
		        }    
		    });    
		}
	public String edit(EmployeeDetails emp) {
	    String sql="update springemployee set name='"+emp.getName()+"', salary="+emp.getSalary()+",designation='"+emp.getDesignation()+"' where id="+emp.getId()+"";    
	    int editresult= jdbcTemplate.update(sql);    
	    System.out.println("editresult:"+editresult);
	    if(editresult>0){
	    	System.out.println("sucess update");
	    }else{
	    	System.out.println("failed update");
	    }
	     return null;
	}
}
