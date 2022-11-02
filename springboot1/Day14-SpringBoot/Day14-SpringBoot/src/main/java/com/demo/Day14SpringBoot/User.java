package com.demo.Day14SpringBoot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class User {
    int Id;
    String Name;
    String city;
    
    public User()
    {
        
    }
    public User(int a, String b,String c)
    {
        Id=a;
        Name=b;
        city=c;
        
        
    }
   
    public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<User> getInformation()
    {
        List<User> ref=null;
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/witapp";
        String userName="root";
        String password="Deepika12345";
        
        String query="select * from runner";
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();
        ResultSet rs=st.executeQuery(query);
        ref = new ArrayList<User>();
        rs.next();
        while(rs.next())
        {
            User obj=new User();
            obj.setId(rs.getInt(1));
            obj.setName(rs.getString(2));
            obj.setCity(rs.getString(3));
            ref.add(obj);
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ref;
        //return "success result";
    }
}