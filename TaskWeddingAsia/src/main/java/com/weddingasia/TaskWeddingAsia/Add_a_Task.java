package com.weddingasia.TaskWeddingAsia;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;

import  com.weddingasia.database.GetCon;

public class Add_a_Task {
	public void setTask(weddingasia_Task a) {
		//weddingasia_Task a = new weddingasia_Task();
		String sql = "insert into Weddingasia_Task values(?,?,?,?,?);";
		try {
			Connection con = (Connection) GetCon.getCon();
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1,a.getTaskId());
			st.setString(2,a.getTaskName());
			st.setBoolean(3, a.isDone());
			st.setString(4,  a.getCreatedAt());
			st.setString(5, a.getDoneAt());
			st.executeUpdate();
			
		}
		catch(Exception e) {
			System.out.println("------"+e+"-----");
		}
	}

}
