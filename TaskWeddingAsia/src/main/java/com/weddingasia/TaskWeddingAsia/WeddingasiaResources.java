package com.weddingasia.TaskWeddingAsia;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("weddingasiaresources")
public class WeddingasiaResources {

	Read_all_Tasks repo1 = new Read_all_Tasks();
	
	@GET
	@Path("readtask")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON })
	public List<weddingasia_Task> getTask(){
		System.out.println("record");
		return repo1.getTask();
		
	}
	
	
	@POST
	@Path("addtask")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON })
	public weddingasia_Task addTask(weddingasia_Task a){
		System.out.println("data is inserting..."+a);
		Add_a_Task repo2 = new Add_a_Task();
		repo2.setTask(a);
		return a;
		
	}
	
	Edit_a_Task repo3 = new Edit_a_Task();
	
	@PUT
	@Path("edittask")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON })
	public weddingasia_Task update(weddingasia_Task wt){
		System.out.println(wt);
		repo3.editTask(wt);
		return wt;
		
	}
	
}