//code for insert command...................................................................
/*
package techfully;

	import java.sql.*;  
	class test{  
	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/elangovan","root","root");  
	
	PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?,?)");  
	stmt.setInt(1,2);
	stmt.setString(2,"Ram"); 
	stmt.setInt(3,97845865);
	
	  
	int i=stmt.executeUpdate();  
	System.out.println(i+" record is  inserted");  
	
	
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	} 
	
	 
	 
*/
// code for update command........................................................................
/*
 


package techfully;

	import java.sql.*;  
	class test{  
	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/elangovan","root","root");  
	
	PreparedStatement stmt=con.prepareStatement("update emp set name=? where id=?");  
	stmt.setString(1,"vijay");//1 specifies the first parameter in the query i.e. name  
	stmt.setInt(2,1);  
	  
	int i=stmt.executeUpdate();  
	System.out.println(i+" record is updated"); 
	
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	} 
	
	 
*/
//code for delete command.................................................................................
/*
 
 
package techfully;
import java.sql.*;  
class test{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/elangovan","root","root"); 

PreparedStatement stmt=con.prepareStatement("delete from emp where id=?");  
stmt.setInt(1,2);  
  
int i=stmt.executeUpdate();  
System.out.println(i+" record is  deleted");  

con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  


*/