package DAO;

import java.io.PrintWriter;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import VO.regi_vo;
public class regi_dao {
	
	public void insert(regi_vo t)
	{	try{
		
		Class.forName("com.mysql.jdbc.Driver");
		String urldb="jdbc:mysql://localhost/demo";
		Connection conn=DriverManager.getConnection(urldb,"root","root");
		Statement stmt=conn.createStatement();
		String sql="insert into mvc(Firstname,Lastname) values('"+t.getFn()+"','"+t.getLn()+"')";
		stmt.executeUpdate(sql);
	}
	catch(Exception e){}
	}
	public List select(regi_vo t)
	{  List ls = new ArrayList();
		
		try{
			
		Class.forName("com.mysql.jdbc.Driver");
		String urldb="jdbc:mysql://localhost/demo";
		Connection conn=DriverManager.getConnection(urldb,"root","root");
		Statement stmt=conn.createStatement();
		String sql1="select * from mvc where id='"+t.getId()+"'";
		ResultSet rs=stmt.executeQuery(sql1);
		while(rs.next()){
			regi_vo v1=new regi_vo();

			int id=rs.getInt("Id");
			String fn=rs.getString("Firstname");
			String ln=rs.getString("Lastname");
			v1.setId(id);
			v1.setFn(fn);
			v1.setLn(ln);
			ls.add(v1);
			
		}
		}
		
		catch(Exception e){}
		return ls;
	}
	public List delete_search()
	{  List ls1= new ArrayList();
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		String urldb="jdbc:mysql://localhost/demo";
		Connection conn=DriverManager.getConnection(urldb,"root","root");
		Statement stmt=conn.createStatement();
		String sql1="select * from mvc";
		ResultSet rs=stmt.executeQuery(sql1);
		while(rs.next()){
			regi_vo v1=new regi_vo();
			int id=rs.getInt("Id");
			String fn=rs.getString("Firstname");
			String ln=rs.getString("Lastname");
			v1.setId(id);
			v1.setFn(fn);
			v1.setLn(ln);
			ls1.add(v1);	
		}
		}
		catch(Exception e){}
		return ls1;
	}
	public void delete_search1(regi_vo t)
	{	try{
		
		Class.forName("com.mysql.jdbc.Driver");
		String urldb="jdbc:mysql://localhost/demo";
		Connection conn=DriverManager.getConnection(urldb,"root","root");
		Statement stmt=conn.createStatement();
		String sql="delete from mvc where id='"+t.getId()+"'";
		stmt.executeUpdate(sql);
	}
	catch(Exception e){}
	}
}
