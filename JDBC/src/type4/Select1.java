package type4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select1 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:XE","uday","mercury");
		Statement stmt = con.createStatement();
		String cmd = "select * from items";
		ResultSet rs = stmt.executeQuery(cmd);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getDouble(3));
		}
		rs.close();
		stmt.close();
		con.close();

	}
}
