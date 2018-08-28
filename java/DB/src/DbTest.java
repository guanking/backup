import java.sql.CallableStatement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Logger;

//import org.apache.log4j.BasicConfigurator;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;  

import com.microsoft.sqlserver.jdbc.*;

public class DbTest {


		//2005
		public static final String url = "jdbc:sqlserver://10.121.15.1:1433;DatabaseName=tempdb";   
		//2000
		//public static final String url = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=tempdb";    
		public static final String user = "sa";
		public static final String password = "5584101";
		//2005
		public static final String driver_name = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		//2000
		//public static final String driver_name = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
		/*
		 * 2000
		Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver"); 
		URL = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=tempdb"; 
	
		2005
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		URL = "jdbc:sqlserver://localhost:1433;DatabaseName=tempdb"; 
		*/
		
		public static void testCreateTable2(int idx )
		{
		    Connection con = null;// 创建一个数据库连接
		    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
		    ResultSet result = null;// 创建一个结果集对象
		    
		

		    try
		    {
		        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
		        
		        FileWriter fwTrace = new FileWriter("c:\\JDBCTrace.log");
	            PrintWriter pwTrace = new PrintWriter(fwTrace);
	            DriverManager.setLogWriter(pwTrace);
	            
	            
		        System.out.println("开始尝试连接数据库！");
		        
		    
		        
		        con = DriverManager.getConnection(DbTest.url , DbTest.user, DbTest.password);
		        System.out.println("连接成功！");
		        String sql = "";
		        

		        if(idx < 10)
		        {
		         sql = "CREATE TABLE animal00" + idx +   
	                    "(ID int    NOT NULL ," +   
	                    " NAME    char   , " +   
	                    " NAME2    varchar(128)   , " +   
	                    " age       int    , " +   
	                    " birth1    date  , " +   
	                    " birth2    datetime year to second, " +  
	                    " price1    float  , " +   
	                    " price2    real  )";   
		        }
		        else if(idx < 100)
		        {
			         sql = "CREATE TABLE animal0" + idx +   
			                   "(ID int    NOT NULL ," +   
			                    " NAME    char   , " +   
			                    " NAME2    varchar(128)   , " +   
			                    " age       int    , " +   
			                    " birth1    smalldatetime  , " +   
			                    " birth2    datetime , " +  
			                    " price1    float  , " +   
			                    " price2    real  )";           	
		        	
		        }
		        else if(idx > 500)
		        {
			         sql = "CREATE TABLE animal" + idx +   
			                   "(ID int    NOT NULL ," +   
			                    " NAME    char   , " +   
			                    " NAME2    varchar(128)   , " +   
			                    " age       int    , " +   
			                    " birth1    smalldatetime  , " +   
			                    " birth2    datetime , " +  
			                    " price1    float  , " +   
			                    " price2    real  )";           	
		        	
		        }		
		        
		        System.out.println(sql);
		       stmt = con.createStatement();
		        int ret = stmt.executeUpdate(sql);   
	       
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }
		    finally
		    {
		    	   System.out.println("22开始关闭数据库！");
		        try
		        {
		            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
		            // 注意关闭的顺序，最后使用的最先关闭
		            if (result != null)
		                result.close();
		            if (stmt != null)
		            	stmt.close();
		            if (con != null)
		                con.close();
		            System.out.println("数据库连接已关闭！");
		        }
		        catch (Exception e)
		        {
		            e.printStackTrace();
		        }
		    }
		}

		
		
		public static void testDeleteTableData( )
		{
		    Connection con = null;// 创建一个数据库连接
		    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
		    ResultSet result = null;// 创建一个结果集对象
		    
	
		    try
		    {
		        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
		        
		        FileWriter fwTrace = new FileWriter("c:\\JDBCTrace.log");
	            PrintWriter pwTrace = new PrintWriter(fwTrace);
	            DriverManager.setLogWriter(pwTrace);
	            
	            
		        System.out.println("开始尝试连接数据库！");
		        

		        
		        con = DriverManager.getConnection(DbTest.url , DbTest.user, DbTest.password);
		        System.out.println("连接成功！");
		      //  String sql = "select *  from animal999 where aaaa='bb'";
		       // String sql = "update animal999 set name='myname' where aaaa='bb'";
		      //  String sql = "update animal999 set name='2' ";
		        String sql = "delete from  animal999  ";
		      //  String sql = "select * from  animal999  ";
		        
		        
		        System.out.println(sql);
		       stmt = con.createStatement();
		        int ret = stmt.executeUpdate(sql);   
	       
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }
		    finally
		    {
		    	   System.out.println("22开始关闭数据库！");
		        try
		        {
		            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
		            // 注意关闭的顺序，最后使用的最先关闭
		            if (result != null)
		                result.close();
		            if (stmt != null)
		            	stmt.close();
		            if (con != null)
		                con.close();
		            System.out.println("数据库连接已关闭！");
		        }
		        catch (Exception e)
		        {
		            e.printStackTrace();
		        }
		    }
		}

		
		
		public static void testQueryTableData( )
		{
		    Connection con = null;// 创建一个数据库连接
		    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
		    ResultSet result = null;// 创建一个结果集对象
		    ResultSet rs = null;// 创建一个结果集对象

		    
		    String debug_url = "SQLIDEBUG=C:\\sqlidebug.trace";
		    try
		    {
		        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
		        
		        FileWriter fwTrace = new FileWriter("c:\\JDBCTrace.log");
	            PrintWriter pwTrace = new PrintWriter(fwTrace);
	            DriverManager.setLogWriter(pwTrace);
	            
	            
		        System.out.println("开始尝试连接数据库！");
	
		        
		        con = DriverManager.getConnection(DbTest.url , DbTest.user, DbTest.password);
		        System.out.println("连接成功！");
		      //  String sql = "select *  from animal999 where aaaa='bb'";
		       // String sql = "update animal999 set name='myname' where aaaa='bb'";
		       // String sql = "update animal999 set name='myname' ";
		        
		       String sql = "select * from  animal999  ";
		        
		        
		        System.out.println(sql);
		       stmt = con.createStatement();
		       result = stmt.executeQuery(sql);  
		       rs = result;
		       
		       int i= 0;
               while (rs.next())
               {
            	   i++;
               }
               System.out.println("rs cnt : "+ i);
	       
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }
		    finally
		    {
		    	   System.out.println("22开始关闭数据库！");
		        try
		        {
		            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
		            // 注意关闭的顺序，最后使用的最先关闭
		            if (result != null)
		                result.close();
		            if (stmt != null)
		            	stmt.close();
		            if (con != null)
		                con.close();
		            System.out.println("数据库连接已关闭！");
		        }
		        catch (Exception e)
		        {
		            e.printStackTrace();
		        }
		    }
		}
	public static void testCreateTable3( )
	{
		int i = 0;
		
		for(i=1;i<100;i++)
		{
			testCreateTable2(i);
		}
		
	}
	
	public static void testCommonQuery( )
	{
	    Connection con = null;// 创建一个数据库连接
	    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    
	    
	    try
	    {
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        String sql = "select * from animal001 where id=200";
	  
	        System.out.println(sql);
	       stmt = con.createStatement();
	   
	       result = stmt.executeQuery(sql);   
       
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (stmt != null)
	            	stmt.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
	public static void testQueryBindvar()
	{
	    Connection con = null;// 创建一个数据库连接
	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
		        
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        
	        FileWriter fwTrace = new FileWriter("c:\\JDBCTrace.log");
            PrintWriter pwTrace = new PrintWriter(fwTrace);
            DriverManager.setLogWriter(pwTrace);
            
            
	        System.out.println("开始尝试连接数据库！");

	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        
	        
	        Enumeration days =  DriverManager.getDrivers();
	        
	      while (days.hasMoreElements()){
	          
	    	  java.sql.Driver mydrv =  (java.sql.Driver)days.nextElement();
	          System.out.println("mydrv！" + mydrv);
	          
	       }
	        
	       // String sql =  "insert into animal002(ID,NAME,age,birth1,birth2,price) values(?,?,?,?,?,?)";
	      

			   
	 

		  	  String userdir = System.getProperty("user.dir");

		        System.out.println("user.dir : " + userdir);
		        
		   	  userdir = System.getProperty("SQLIDEBUG");

		        System.out.println("SQLIDEBUG : " + userdir);
       
	        
	        String sql = "select * from customer where create_time=?";
	        pre = con.prepareStatement(sql);
	       // pre.setInt(1,10);
	        //pre.setFloat(1, 1.123F);
	        //pre.setString(1,"1str1");
	       // pre.setDate(1, new Date(2018-01-02));
	        pre.setTimestamp(1, new Timestamp(System.currentTimeMillis())); 
	        result = pre.executeQuery();

	 	   //pre.setDate(4, new Date(2018-01-02));
		   //pre.setTimestamp(5, new Timestamp(System.currentTimeMillis())); 
		   
	        //pre.setString(1,"1str2");
	        //pre.setInt(1,10);
	       // pre.setFloat(1, 1.123F);
	        //result = pre.executeQuery();
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (pre != null)
	                pre.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
	public static void testQueryMultiBindvar()
	{
	    Connection con = null;// 创建一个数据库连接
	    PreparedStatement pre = null;
	    PreparedStatement pre2 = null;
	    PreparedStatement pre3 = null;
	    PreparedStatement pre4 = null;
	    
	    
	    PreparedStatement pre5 = null;
	    PreparedStatement pre6 = null;
	    
	    PreparedStatement pre7 = null;
	        
	    
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
		   
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        
	        FileWriter fwTrace = new FileWriter("c:\\JDBCTrace.log");
            PrintWriter pwTrace = new PrintWriter(fwTrace);
            DriverManager.setLogWriter(pwTrace);
            
            
	        System.out.println("开始尝试连接数据库！");
	        

	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        
	        
	        String sql = "select * from animal999 where ID=?";
	        pre = con.prepareStatement(sql);
	        pre.setInt(1, 0x12345678);  
	        result = pre.executeQuery();

	        sql = "select * from animal999 where NAME=?";
	        pre3 = con.prepareStatement(sql);  
	        pre3.setString(1, "1TEST2");   //0x1  0x60
	        result = pre3.executeQuery();	       
	        
	        
	        sql = "select * from animal999 where age=?";
	        pre4 = con.prepareStatement(sql);      
	        pre4.setInt(1, 0x12345679);
	        result = pre4.executeQuery();	     	        
	        
	        sql = "select * from animal999 where birth1=?";
	        pre5 = con.prepareStatement(sql);  
	      //  pre5.setDate(1, new Date(2018-01-02));
	        result = pre5.executeQuery();	
	        
	        sql = "select * from animal999 where birth2=?";
	        pre6 = con.prepareStatement(sql);  
	        pre6.setTimestamp(1, new Timestamp(System.currentTimeMillis())); 
	        result = pre6.executeQuery();	
	 	   
	        sql = "select * from animal999 where price1=?";
	        pre7 = con.prepareStatement(sql);  
	        pre7.setFloat(1, 200.23456F);   
	        result = pre7.executeQuery();	

   	        

	        pre.executeQuery();	
	        pre3.executeQuery();	
	        
	        pre4.executeQuery();		        
	        pre5.executeQuery();
	        
	        pre6.executeQuery();		        
	        pre7.executeQuery();	        
	        
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (pre != null)
	                pre.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
		
	
	public static void testQuery1111()
	{
	    Connection con = null;// 创建一个数据库连接
	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {


		        
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        
	        
	        Enumeration days =  DriverManager.getDrivers();
	        
	      while (days.hasMoreElements()){
	          
	    	  java.sql.Driver mydrv =  (java.sql.Driver )days.nextElement();
	          System.out.println("mydrv！" + mydrv);
	          
	       }
	        
	       // String sql =  "insert into animal002(ID,NAME,age,birth1,birth2,price) values(?,?,?,?,?,?)";
	      

			   
	 

		  	  String userdir = System.getProperty("user.dir");

		        System.out.println("user.dir : " + userdir);
		        
		   	  userdir = System.getProperty("SQLIDEBUG");

		        System.out.println("SQLIDEBUG : " + userdir);
       
	        
	        String sql = "select * from customer where name=?  and create_time=? ";
	        pre = con.prepareStatement(sql);
	       // pre.setInt(1,10);
	        //pre.setFloat(1, 1.123F);
	        //pre.setString(1,"1str1");
	       // pre.setDate(1, new Date(2018-01-02));
	        pre.setString(1,"1str1");
	        pre.setTimestamp(2, new Timestamp(System.currentTimeMillis())); 
	      
	        result = pre.executeQuery();

	        
	        pre.setString(1,"2str1");
	        pre.setTimestamp(2, new Timestamp(System.currentTimeMillis())); 
	        result = pre.executeQuery();
	        
	 	   //pre.setDate(4, new Date(2018-01-02));
		   //pre.setTimestamp(5, new Timestamp(System.currentTimeMillis())); 
		   
	        //pre.setString(1,"1str2");
	        //pre.setInt(1,10);
	       // pre.setFloat(1, 1.123F);
	        //result = pre.executeQuery();
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (pre != null)
	                pre.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	

	
	

        
	
	public static void testQuery222()
	{
	    Connection con = null;// 创建一个数据库连接
	    Statement stmt = null;
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
	    
			    System.setProperty("SQLIDEBUG", "c:\\");
		        System.setProperty("PROTOCOLTRACEFILE", "c:\\ifx.log");
		        
		        System.setProperty("PROTOCOLTRACE", "10");
		        
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        
	        
	        Enumeration days =  DriverManager.getDrivers();
	        
	      while (days.hasMoreElements()){
	          
	    	  java.sql.Driver mydrv =  (java.sql.Driver)days.nextElement();
	          System.out.println("mydrv！" + mydrv);
	          
	       }
	        
	       // String sql =  "insert into animal002(ID,NAME,age,birth1,birth2,price) values(?,?,?,?,?,?)";
	      

			   
	 

		  	  String userdir = System.getProperty("user.dir");

		        System.out.println("user.dir : " + userdir);
		        
		   	  userdir = System.getProperty("SQLIDEBUG");

		        System.out.println("SQLIDEBUG : " + userdir);
       
	        
	        String sql = "select * from customer";
	        stmt = con.createStatement();
	        result = stmt.executeQuery(sql);

	 	   //pre.setDate(4, new Date(2018-01-02));
		   //pre.setTimestamp(5, new Timestamp(System.currentTimeMillis())); 
		   
	        //pre.setString(1,"1str2");
	        //pre.setInt(1,10);
	       // pre.setFloat(1, 1.123F);
	        //result = pre.executeQuery();
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (stmt != null)
	                stmt.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
	public static void testprocedure()
	{
	    Connection con = null;// 创建一个数据库连接
	    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	      //  String sql = "select * from emps where job33='abcd'";
	      //  String sql =  "delete from book";
	        /*
	        String sql =  "select *  from cat";
	        stmt = con.createStatement();
	        result = stmt.executeQuery(sql);
	        */
	        /*
	         * CREATE PROCEDURE noParam() 
				BEGIN 
				SELECT AVG(price) AS priceAvg FROM fruit; 
				END$$ 
				DELIMITER ; 
	         * */
	        String proStr = "{call noParam}";  
	        CallableStatement  callableStatement = con.prepareCall(proStr);  
	        callableStatement.execute();  
	        ResultSet resultSet = callableStatement.getResultSet();  
	        
	        
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (stmt != null)
	            	stmt.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
	
	public static void testprocedure2()
	{
	    Connection con = null;// 创建一个数据库连接
	    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	      //  String sql = "select * from emps where job33='abcd'";
	      //  String sql =  "delete from book";
	        /*
	        String sql =  "select *  from cat";
	        stmt = con.createStatement();
	        result = stmt.executeQuery(sql);
	        */
	        /*
	         * CREATE PROCEDURE noParam() 
				只有两个输入参数的存储过程 
	         * */
	        String procStr = "{call inTwoParam(?,?)}";  
	        CallableStatement callableStatement = con.prepareCall(procStr);  
	        callableStatement.setString(1, "1mystr");  
	        callableStatement.setDouble(2, 88.88);//对DECIMAL类型的属性设值要使用setDouble方法。  
	        callableStatement.execute();  
	        ResultSet resultSet = callableStatement.getResultSet();  
	        
	        
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (stmt != null)
	            	stmt.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
	
	
	
	public static void testprocedure3()
	{
	    Connection con = null;// 创建一个数据库连接
	    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	      //  String sql = "select * from emps where job33='abcd'";
	      //  String sql =  "delete from book";
	        /*
	        String sql =  "select *  from cat";
	        stmt = con.createStatement();
	        result = stmt.executeQuery(sql);
	        */
	        /*
	         * CREATE PROCEDURE noParam() 
				只有两个输出参数的存储过程   
				http://blog.csdn.net/gaohuanjie/article/details/34422903
	         * */
	        String proStr = "{call outTwoParam(?,?)}";  
	        CallableStatement callableStatement = con.prepareCall(proStr);  
	        callableStatement.registerOutParameter(1, Types.VARCHAR);  
	        callableStatement.registerOutParameter(2, Types.DECIMAL);  
	        callableStatement.execute();  
	        String fruitName = callableStatement.getString(1);  
	        double fruitPrice = callableStatement.getDouble(2);// 获取DECIMAL类型的属性要使用getDouble方法。
	        
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (stmt != null)
	            	stmt.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
	
	
	
	public static void testprocedure4()
	{
	    Connection con = null;// 创建一个数据库连接
	    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	      //  String sql = "select * from emps where job33='abcd'";
	      //  String sql =  "delete from book";
	        /*
	        String sql =  "select *  from cat";
	        stmt = con.createStatement();
	        result = stmt.executeQuery(sql);
	        */
	        /*
	         * CREATE PROCEDURE noParam() 
				含有一个输入参数和一个输出参数的存储过程 
				http://blog.csdn.net/gaohuanjie/article/details/34422903
	         * */
	        String procStr="{call inOneParamAndOutOneParam(?,?)}";  
	        CallableStatement callableStatement=con.prepareCall(procStr);  
	        String fruitName = "1apple";  
	        callableStatement.setString(1, fruitName);  
	        callableStatement.registerOutParameter(2, Types.DECIMAL);  
	        callableStatement.execute();  
	        
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (stmt != null)
	            	stmt.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	public static void testQuery2()
	{
	    Connection con = null;// 创建一个数据库连接
	    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	      //  String sql = "select * from emps where job33='abcd'";
	      //  String sql =  "delete from book";
	        
	       
	        String sql =  "select id as myid , name as myname   from cat ";
	        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
	        result = stmt.executeQuery(sql);
	      /*
	        result.last();//移动到最后一行
			 int rownum=result.getRow();//记录当前的行号，记录的条数
			  System.out.println("rownum！" +  rownum);
			*/
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (stmt != null)
	            	stmt.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}


	
	
	
	public static void testQueryAliasName()
	{
	    Connection con = null;// 创建一个数据库连接
	    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	      //  String sql = "select * from emps where job33='abcd'";
	      //  String sql =  "delete from book";
	        
	        String sql =  "select id as myid , name as myname   from cat  as A  where A.id = 1";
	        stmt = con.createStatement();
	        result = stmt.executeQuery(sql);

	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (stmt != null)
	            	stmt.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}


	
	
	public static void testQueryCursor()
	{
	    Connection con = null;// 创建一个数据库连接
	    PreparedStatement  ps = null;
	    ResultSet rs = null;// 创建一个结果集对象
	    try
	    {
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	      //  String sql = "select * from emps where job33='abcd'";
	      //  String sql =  "delete from book";
	        
	        String sql =  "select *  from cat";
	   
	        ps = con.prepareStatement(sql,ResultSet.TYPE_FORWARD_ONLY,  ResultSet.CONCUR_READ_ONLY);  
            //ps = con.prepareStatement(sql,ResultSet.TYPE_FORWARD_ONLY,  ResultSet.CONCUR_READ_ONLY);  
                        
            //ps.setFetchSize(Integer.MIN_VALUE);  
              
            //ps.setFetchDirection(ResultSet.FETCH_REVERSE);  
  
            rs = ps.executeQuery();  
            int count  = 0;
            
          // rs.last();//移动到最后一行


            while (rs.next()) {  
                
            	if(count > 5)
            	{
            		break;
            	}
                count++;  

                  
            } 
            int rownum=rs.getRow();//记录当前的行号，记录的条数
            System.out.println("取回数据量为  "+rownum+" 行！");  
            System.out.println("取回数据量为  "+count+" 行！");
            Thread.sleep(100000);

	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (rs != null)
	                rs.close();
	            if (ps != null)
	            	ps.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}


	public static void testVartype()
	{
	    Connection con = null;
	    PreparedStatement pre = null;
	    ResultSet result = null;
	    try
	    {
	        Class.forName(DbTest.driver_name);
	        System.out.println("开始尝试连接数据库！");

	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        String sql =  "insert into emps(empno,ename,sal,hiredate) values(?,?,?,?,?,?,?,?  ,?,?,?,?, ?)";
	      
	        pre = con.prepareStatement(sql);
	        
	        
	        java.util.Date javaDate = new java.util.Date();
	        long javaTime = javaDate.getTime();
	        
	        System.out.println("The Java Date is:" +  javaDate.toString());

	         //Get and display SQL DATE
	         java.sql.Date sqlDate = new java.sql.Date(javaTime);
	         System.out.println("The SQL DATE is: " + sqlDate.toString());

	         //Get and display SQL TIME
	         java.sql.Time sqlTime = new java.sql.Time(javaTime);
	         System.out.println("The SQL TIME is: " +  sqlTime.toString());
	         //Get and display SQL TIMESTAMP
	         java.sql.Timestamp sqlTimestamp =new java.sql.Timestamp(javaTime);
	         System.out.println("The SQL TIMESTAMP is: " + sqlTimestamp.toString());
	         
	         
	        pre.setTimestamp(1, new Timestamp(System.currentTimeMillis())); 
	        pre.setInt(2, 100); 
	        pre.setString(3, "3test"); 
	        pre.setDate(4, sqlDate);
	        pre.setTime(5, sqlTime);
	        pre.setFloat(6,  1.5021564555F);
	        pre.setDouble(7, 1.5021564555D);
	        pre.setLong(8, 0x12345678458975L);
	        
	        pre.setBoolean(9, false);
	        pre.setByte(10, (byte)0x31);
	        pre.setShort(11, (short)1234);
	        byte []mybytes = {1, 2};
	        pre.setBytes(12, mybytes);
	        
	        
	        BigDecimal  mydecimal =  new BigDecimal("18888888888888888888888888888888888888882.352555555555555");
	        pre.setBigDecimal(13, mydecimal);
	        result = pre.executeQuery();
	        	        
	        
	        
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	 System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (pre != null)
	                pre.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }	    
	}
	
	
	public static void testInsertBindvar()
	{
	    Connection con = null;
	    PreparedStatement pre = null;
	    ResultSet result = null;
	    try
	    {
	        Class.forName(DbTest.driver_name);
	        System.out.println("开始尝试连接数据库！");

	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        
	        
	        String sql =  "insert into emps(empno,ename,sal,hiredate) values(?,?,?,?)";
	
	        

	        pre = con.prepareStatement(sql);

	        /*
	        Method method = Class.forName("oracle.jdbc.driver.OraclePreparedStatementWrapper").getDeclaredMethod("getOriginalSql",null);  
	        method.setAccessible(true);  
	        System.out.println("sql:  "+ method.invoke(pre, null));
	        
	        
	      
	        Field field = Class.forName("oracle.jdbc.driver.OraclePreparedStatementWrapper").getDeclaredField("preparedStatement");  
	        field.setAccessible(true); 
	        Object s = field.get(pre);  
	

	        System.out.println("preparedStatement: " + s.getClass());
	        
	        
	        Method[] mths = Class.forName("oracle.jdbc.driver.T4CPreparedStatement").getDeclaredMethods();
            for (int i = 0; i < mths.length; i++) {
               // System.out.println("所有方法之" + mths[i].getName());
                //System.out.println("修饰符类型：" + mths[i].getModifiers());
            }
            
            Field[] fls = Class.forName("oracle.jdbc.driver.T4CPreparedStatement").getFields();
            for (int i = 0; i < fls.length; i++) {
                System.out.println("公有属性之" + fls[i].getName());
                System.out.println("修饰符类型：" + fls[i].getModifiers());
            }
            
            Field[] fls1 = Class.forName("oracle.jdbc.driver.T4CPreparedStatement").getDeclaredFields();
            for (int i = 0; i < fls1.length; i++) {
                System.out.println("所有属性之" + fls1[i].getName());
                System.out.println("修饰符类型：" + fls1[i].getModifiers());
            }
            */
            /*
	        Field field2 = Class.forName("oracle.jdbc.driver.OracleStatement").getDeclaredField("sqlKind");  
	        field2.setAccessible(true); 
	        
	        Object sqlKind = field.get(s);  
	        
	        System.out.println("sqlKind" + sqlKind.getClass());
	        */
            
            
	       // System.out.println("pre" + pre.getClass());
	       

	
	        
	        
	        //timestamp 
	        /*
	        pre.setTimestamp(1, new Timestamp(System.currentTimeMillis())); 
	        pre.setTimestamp(2, new Timestamp(System.currentTimeMillis())); 
	        pre.setTimestamp(3, new Timestamp(System.currentTimeMillis())); 
	        pre.setTimestamp(4, new Timestamp(System.currentTimeMillis())); 
	        result = pre.executeQuery();
	        */
	  
	        //pre.setLong(1, 0x12345678L);  //0x8
	        //pre.setDate(1, new Date(2018-01-02));  //0xc
	        
	        /*
	        pre.setInt(1, 1);   //0x1  0x60
	        pre.setString(2, "2TEST2");   //0x1  0x60
	        pre.setInt(3, 1);   //0x1  0x60
	        pre.setString(4, "4TEST2");   //0x1  0x60
	        result = pre.executeQuery();
	        
	        pre.setInt(1, 1);   //0x1  0x60
	        pre.setString(2, "5TEST2");   //0x1  0x60
	        pre.setInt(3, 1);   //0x1  0x60
	        pre.setString(4, "6TEST2");   //0x1  0x60
	        result = pre.executeQuery();	        
	        */
	        /*
	        pre.setInt(2, 2);
	        //pre.setString(2, "TEST2");   //0x1  0x60
	        //pre.setDate(2, new Date(2018-01-02));  //0xc
	        //pre.setDate(3, new Date(2018-01-02));  //0xc
	        pre.setInt(3, 1500);
	        pre.setString(4, "03-12-81");    //0x1  0x60
	       // pre.setDate(4, new Date(2018-01-02));  //0x
	        result = pre.executeQuery();
			*/
	        /*
	        pre.setInt(1, 3);
	        pre.setString(2, "TEST3");
	        pre.setInt(3, 1500);
	        pre.setString(4, "03-12-81");
	        result = pre.executeQuery();
	        
	      
	        pre.setInt(1, 4);
	        pre.setString(2, "TEST4");
	        pre.setInt(3, 1500);
	        pre.setString(4, "03-12-81");
	        result = pre.executeQuery();	        
	        */
	        
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	 System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (pre != null)
	                pre.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
	
	
	public static void testInsertBindvar2()
	{
	    Connection con = null;
	    PreparedStatement pre = null;
	    ResultSet result = null;
	    try
	    {
	 
	    	System.setProperty("java.util.logging.config.file","c:\\msjdklog.properties");
	    	
	    	 System.out.println("user.home: " + System.getProperty("user.home")); 

	        Class.forName(DbTest.driver_name);
	        System.out.println("开始尝试连接数据库！");

	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        

	  
	        String sql =  "insert into animal999(ID,NAME,age,birth1,birth2,price1) values(?,?,?,?,?,?)";

	        pre = con.prepareStatement(sql);

            
		   System.out.println("pre" + pre.getClass());
		       
		   SQLServerPreparedStatement  msps = (SQLServerPreparedStatement)pre;
		  
		   Logger myogger = Logger.getLogger("com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement");
		   System.out.println("myogger" + myogger.getClass());
		   
		   java.util.Date javaDate = new java.util.Date();
	        long javaTime = javaDate.getTime();
	        
	        java.sql.Date sqlDate = new java.sql.Date(javaTime);   
	         java.sql.Time sqlTime = new java.sql.Time(javaTime);
	         java.sql.Timestamp sqlTimestamp =new java.sql.Timestamp(javaTime);
	      
	 
	        /*
	 	   pre.setDate(4, sqlDate);
	       pre.setTime(5, sqlTime);
	       pre.setTimestamp(1, sqlTimestamp)); 
			*/   
		   
		   pre.setInt(1, 0x12345678);  
		   pre.setString(2, "1");   //0x1  0x60
		   pre.setInt(3, 0x12345679);
		   pre.setDate(4,sqlDate);
		   pre.setTimestamp(5, sqlTimestamp); 
		   pre.setFloat(6, 200.23456F);
	
		
	        int rows = pre.executeUpdate();	        
	   
	        /*
			
			   pre.setInt(1, 0xaa345678);  
			   pre.setString(2, "2TEST2");   //0x1  0x60
			   pre.setInt(3, 0xaa345679);
			   pre.setDate(4, new Date(2018-01-02));
			   pre.setTimestamp(5, new Timestamp(System.currentTimeMillis())); 
			   pre.setFloat(6, 100.23456F);
		
			
			    rows = pre.executeUpdate();	    
			    
				   pre.setInt(1, 0xaa345678);  
				   pre.setString(2, "3TEST2");   //0x1  0x60
				   pre.setInt(3, 0xaa345679);
				   pre.setDate(4, new Date(2018-01-02));
				   pre.setTimestamp(5, new Timestamp(System.currentTimeMillis())); 
				   pre.setFloat(6, 100.23456F);
			
				
				    rows = pre.executeUpdate();	    		    
			    

				    
					   pre.setInt(1, 0xaa345678);  
					   pre.setString(2, "4TEST2");   //0x1  0x60
					   pre.setInt(3, 0xaa345679);
					   pre.setDate(4, new Date(2018-01-02));
					   pre.setTimestamp(5, new Timestamp(System.currentTimeMillis())); 
					   pre.setFloat(6, 100.23456F);
				
					
					    rows = pre.executeUpdate();	    		    
				    
					    
						   pre.setInt(1, 0xaa345678);  
						   pre.setString(2, "5TEST2");   //0x1  0x60
						   pre.setInt(3, 0xaa345679);
						   pre.setDate(4, new Date(2018-01-02));
						   pre.setTimestamp(5, new Timestamp(System.currentTimeMillis())); 
						   pre.setFloat(6, 100.23456F);
					
						
						    rows = pre.executeUpdate();	    		    
					    					    
							   pre.setInt(1, 0xaa345678);  
							   pre.setString(2, "6TEST2");   //0x1  0x60
							   pre.setInt(3, 0xaa345679);
							   pre.setDate(4, new Date(2018-01-02));
							   pre.setTimestamp(5, new Timestamp(System.currentTimeMillis())); 
							   pre.setFloat(6, 100.23456F);
						
							
							    rows = pre.executeUpdate();	    
							    */
						            
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	 System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (pre != null)
	                pre.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
	
	
	public static void testInsertBindvar3()
	{
	    Connection con = null;
	    PreparedStatement pre = null;
	    ResultSet result = null;
	    try
	    {
	        Class.forName(DbTest.driver_name);
	        System.out.println("开始尝试连接数据库！");

	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        

	  
	        String sql =  "insert into animal999(ID,NAME,age,birth1,birth2,price1) values(?,?,?,?,?,?)";

	        pre = con.prepareStatement(sql);
	        System.out.println("pre" + pre.getClass());
	        int rows ;
	        for(int i=0;i<1000;i++)
	        {
	 		   pre.setInt(1, 0x12345678);  
			   pre.setString(2, i + "TEST2");   //0x1  0x60
			   pre.setInt(3, i);
			  // pre.setDate(4, new Date(2018-01-02));
			   pre.setTimestamp(5, new Timestamp(System.currentTimeMillis())); 
			   pre.setFloat(6, 200.23456F);
		       rows = pre.executeUpdate();	    	        	  	
	        }
		
						            
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	 System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (pre != null)
	                pre.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	public static void testDeleteBindvar2()
	{
	    Connection con = null;
	    PreparedStatement pre = null;
	    ResultSet result = null;
	    try
	    {
	        Class.forName(DbTest.driver_name);
	        System.out.println("开始尝试连接数据库！");

	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        

	  
	        String sql =  "delete from animal999 where name=?";

	        pre = con.prepareStatement(sql);

            
		   System.out.println("pre" + pre.getClass());
		       
	
		
	
		   pre.setString(1, "1TEST2");   //0x1  0x60

	
		
	        int rows = pre.executeUpdate();	        
	   
	
			   pre.setString(1, "2TEST2");   //0x1  0x60

		
			
			    rows = pre.executeUpdate();	    	        
	        
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	 System.out.println("22开始关闭数据库！");
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (pre != null)
	                pre.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}	
	
	
	
	public static void testInsertBindvarMultiTemplate()
	{
	    Connection con = null;
	    PreparedStatement pre1 = null;
	    PreparedStatement pre2 = null;
	    ResultSet result1 = null;
	    ResultSet result2 = null;
	    String sql1 = "insert into emps(empno,ename,sal,hiredate) values(?,?,?,?)";
	    String sql2 =  "select * from emps where job=?";
	    
	    try
	    {
	        Class.forName(DbTest.driver_name);
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");

	      
	        pre1 = con.prepareStatement(sql1);
	        pre2 = con.prepareStatement(sql2);
	        
	        pre1.setInt(1, 200);
	        pre1.setString(2, "TEST200");
	        pre1.setInt(3, 1500);
	        pre1.setString(4, "03-12-81");
	        result1 = pre1.executeQuery();      
	            
	        pre2.setInt(1, 1);
	        result2 = pre2.executeQuery();	        
	        
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	 System.out.println("22开始关闭数据库！");
	        try
	        {
	        	result1.close();
	        	result2.close();
	        	pre1.close();
	        	pre2.close();
	            con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
	public static void testQuery()
	{
	    Connection con = null;// 创建一个数据库连接
	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        String sql = "select * from emps where job='market'";
	        pre = con.prepareStatement(sql);
	        pre.setInt(1, 1);
	        result = pre.executeQuery();

	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	        	result.close();
	        	pre.close();
	            con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
	
	
	public static void testBatch()
	{
	    Connection con = null;// 创建一个数据库连接
	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        String sql = "select * from emps where job='market'";
	        pre = con.prepareStatement(sql);
	        pre.setInt(1, 1);
	        result = pre.executeQuery();

	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	        	result.close();
	        	pre.close();
	            con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}

	
	public static void testUpdate()
	{
	    Connection con = null;
	    Statement stmt = null;
	    ResultSet result = null;
	    try
	    {
	        Class.forName(DbTest.driver_name);
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        String sql = "update job= ?  frome emps where id=1";

	        result = stmt.executeQuery(sql);

	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	System.out.println("22开始关闭数据库！");
	        try
	        {
	        	result.close();
	        	stmt.close();
	            con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
	public static void testDelete()
	{
	    Connection con = null;
	    Statement stmt = null;
	    ResultSet result = null;
	    try
	    {
	        Class.forName(DbTest.driver_name);// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        String sql = "delete from mytest";
	        
	        
	        result = stmt.executeQuery(sql);

	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	   System.out.println("22开始关闭数据库！");
	        try
	        {
	        	result.close();
	        	stmt.close();
	            con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}	
	
	public static void testCreateTable()
	{
	    Connection con = null;
	    Statement stmt = null;
	    ResultSet result = null;
	    try
	    {
	        Class.forName(DbTest.driver_name);
	        System.out.println("开始尝试连接数据库！");
	        
	        con = DriverManager.getConnection(DbTest.url, DbTest.user, DbTest.password);
	        System.out.println("连接成功！");
	        String sql = "create table cam_lc2(id  number primary key,name varchar2(30),sal   number(11,2),dt    date)";
	      
	        result = stmt.executeQuery(sql);

	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	    	System.out.println("22开始关闭数据库！");
	        try
	        {
	        	result.close();
	        	stmt.close();
	            con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//testQueryBindvar();

		//testInsertBindvarMultiTemplate();
		
		//System.setProperty("oracle.jdbc.Trace", "true");
		//System.setProperty("java.util.logging.config.file", "e:/OracleLog.properties");
		
		

		/*
	
		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

		ObjectName pattern;
		try {
			pattern = new ObjectName("com.oracle.jdbc:type=diagnosability,*");
	
			ObjectName diag = ((ObjectName[])
			 (mbs.queryNames(pattern, null).toArray(new ObjectName[0])))[0];
		
			System.out.println("LoggingEnabled = " + mbs.getAttribute(diag, "LoggingEnabled"));
	
			mbs.setAttribute(diag, new Attribute("LoggingEnabled", true));

			mbs.setAttribute(diag, new Attribute("LoggingEnabled", false));					
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//testInsertBindvar();
		
		//System.out.println("system Properties:" + System.getProperties().toString() );
		
//		BasicConfigurator.configure(); //自动快速地使用缺省Log4j环境。
		int a = 100;


		while(a > 1)
		{
			//testQueryBindvar();
			//testInsertBindvar();
			//testQuery2();
			//testQueryAliasName();
			//testVartype();
			//testprocedure4();
			//testQueryCursor();
			//testCreateTable2(2);
			//testQueryBindvar();
			//testCommonQuery();
			//testInsertBindvar2();
			//testQueryBindvar();
			//testQuery1111();
			//testQuery222();
			//testCreateTable2(999);
			testInsertBindvar2();
			//testInsertBindvar3();
			//testDeleteBindvar2();
			//testDeleteTableData();
			//testQueryTableData();
			//testQueryMultiBindvar();
			
			try {
				//Thread.sleep(10000);
			} catch (Exception e) {

				e.printStackTrace();
			} 
		
			break;
		}
	
	}
	
	
	

}