
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class APS {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:system/Password123@localhost:1521:xe");
		String s="Select * from ASHISH";
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(s);
ResultSetMetaData rsmd=rs.getMetaData();
while(rs.next())
{
System.out.println(rs.getString(1));	
}
	}

}
