package com.weddingasia.TaskWeddingAsia;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;

import  com.weddingasia.database.GetCon;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.List;


public class Read_all_Tasks {
	public List<weddingasia_Task> getTask(){

		List<weddingasia_Task> task = new ArrayList<weddingasia_Task>();
		String sql = "select * from Weddingasia_Task";
		try {
			java.sql.Connection con = GetCon.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				weddingasia_Task a = new weddingasia_Task();
				a.setTaskId(rs.getInt(1));
				a.setTaskName(rs.getString(2));
				a.setDone(rs.getBoolean(3));
				a.setCreatedAt(rs.getString(4));
				a.setDoneAt(rs.getString(5));
				
				task.add(a); 
			}
			
			
			
		}
		catch(Exception e) {
			System.out.println("------"+e+"-----");
		}
		return(task);
	}
	
	

}