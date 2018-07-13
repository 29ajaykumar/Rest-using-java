package com.weddingasia.TaskWeddingAsia;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;

import  com.weddingasia.database.GetCon;


public class Edit_a_Task {
	
	public void editTask(weddingasia_Task a ) {
		//weddingasia_Task a = new weddingasia_Task();
		String sql = "update Weddingasia_Task set taskName = ?, isDone = ?, createdAt = ?, doneAt = ? where taskId = ?";
		try {
			Connection con = (Connection) GetCon.getCon();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,a.getTaskName());
			st.setBoolean(2, a.isDone());
			st.setString(3, a.getCreatedAt());
			st.setString(4,  a.getDoneAt());
			st.setInt(5, a.getTaskId());
			st.executeUpdate();
			
		}
		catch(Exception e) {
			System.out.println("------"+e+"-----");
		}
	}

}