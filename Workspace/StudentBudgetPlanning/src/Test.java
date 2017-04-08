import java.sql.*;
public class Test 
{
	//JDBC Connection
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	//Database URL
	static final String DB_URL ="jdbc:mysql://localhost:3306/test";
	
	//Database Credentials
	static final String USER="root";
	static final String PASS="admin";
	
	public static void main(String[] args)
	{
		Connection conn= null;
		Statement st = null;
		
		try
		{
			//Register JDBC Driver
			Class.forName(JDBC_DRIVER);
			
			
			//Open a Connection
			System.out.println("connecting database");
			conn= DriverManager.getConnection(DB_URL,USER,PASS);
			
			//Execute the Query
			System.out.println("Creating Statement...");
			st=conn.createStatement();
			String sql;
			sql="SELECT id,name,age from emp";
			ResultSet rs=st.executeQuery(sql);
			
			//Extract data from result set
		    while(rs.next())
		    {
		         //Read the data from the table and store it in the variables
		         int id  = rs.getInt("id");
		         int age = rs.getInt("age");
		         String name = rs.getString("name");

		         //Display the values
		         System.out.print("ID: " + id);
		         System.out.print(", Age: " + age);
		         System.out.print(", Name: " + name);
		    }
		    
		    //closing all the connections
		    rs.close();
		    st.close();
		    conn.close();
		}
		//handles all the JDBC errors
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		
		//handles all the Class.forName errors
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(st!=null)
				{
					st.close();		
				}
			}
			catch(SQLException se2)
			{
			}
			try
			{
				if(conn!=null)
		        conn.close();
		     }
			catch(SQLException se)
			{
				se.printStackTrace();
		    }
		}	
	}
}


