package mysql;

//import java.sql.Connection;
import java.sql.*;

public class JdbcA {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		try{
		//String name="nitin";
		//String pass = "abc";
		
		//Class.forName("com.mysql.jdbc.Driver");
		//Class.forName("com.mysql.jdbc.Driver"); 
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logicaldoc", "root", "123456");
			JdbcA jb = new JdbcA();
			Connection con = jb.connectDB();
			jb.exSql();
			/*PreparedStatement stm = con.prepareStatement("select * from ld_version where ld_id=?");
		stm.setInt(1, 3407872);
		
			ResultSet rs =	stm.executeQuery();
			//System.out.println(rs);
			while(rs.next()){
				//System.out.println(rs.getNString("ld_title"));
				System.out.println(rs.getInt(1));
			}*/
		}catch(Exception e){
			
			System.out.println(e);
		}
		
	}
	
	public Connection connectDB() throws SQLException, ClassNotFoundException
	{
		Connection con;
		
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logicaldoc", "root", "123456");
			// return con;
		
		
		return con;
		
	}
	
	public void exSql() throws ClassNotFoundException, SQLException
	{
		Connection con = this.connectDB();
		
		/*PreparedStatement pstm = con.prepareStatement("select * from ld_version where ld_id=?");
		pstm.setInt(1, 3407872);
		
		ResultSet prs = pstm.executeQuery();
		*/
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from ld_version where ld_id=3407872");
		while(rs.next()){
			
			System.out.println(rs.getString(2));
		}
	}
	
	public void getCon()
	{
		try{
		Connection con = this.connectDB();
		}
		catch (Exception e)
		{
			System.out.println(e);
			
		}
	}

}
