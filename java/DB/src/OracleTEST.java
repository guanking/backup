//import java.sql.Connection;  
//import java.sql.DriverManager;  
//import java.sql.PreparedStatement;  
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.Statement;
//import java.sql.Timestamp;
//import java.sql.Date;
//import java.math.BigDecimal;  
//
//public class OracleTEST {
//
//	public static final String url = "jdbc:oracle:" + "thin:@10.121.15.5:1521:orcl";
//	public static final String user = "system";// 用户名,系统默认的账户名
//	public static final String password = "1q2w3e4r";// 你安装时选设置的密码
//
//    
//	public static void testQueryBindvar()
//	{
//	    Connection con = null;// 创建一个数据库连接
//	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
//	    ResultSet result = null;// 创建一个结果集对象
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql = "select * from emps where job=?";
//	        pre = con.prepareStatement(sql);
//	        pre.setString(1,"1job");
//	        result = pre.executeQuery();
//
//	        pre.setString(1,"2job");
//	        result = pre.executeQuery();
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	   System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (pre != null)
//	                pre.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//	
//	
//	
//	
//	public static void testQueryBindvar034e()
//	{
//	    Connection con = null;// 创建一个数据库连接
//	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
//	    ResultSet result = null;// 创建一个结果集对象
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql = "select * from test1 where id=?";
//	        pre = con.prepareStatement(sql);
//	        pre.setInt(1, 123);
//	        result = pre.executeQuery();
//
//	        int i = 0;
//	        for(;i<100;i++)
//	        {
//		        pre.setInt(1, i);
//		        result = pre.executeQuery();        	      	
//	        }
//
//	        
//	        
//	        
//	        
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	   System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (pre != null)
//	                pre.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//	
//	public static void testQueryBindvar034e2()
//	{
//	    Connection con = null;// 创建一个数据库连接
//	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
//	    ResultSet result = null;// 创建一个结果集对象
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql = "update test1 set name=?";
//	        pre = con.prepareStatement(sql);
//	        pre.setString(1, "2222");
//	        result = pre.executeQuery();
//
//	        String mystr= "";
//	        int i = 0;
//	        for(;i<100;i++)
//	        {
//	        	mystr = "1aaa" + i;
//		        pre.setString(1, mystr);
//		        result = pre.executeQuery();        	      	
//	        }
// 
//	        
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	   System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (pre != null)
//	                pre.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//		
//	
//	
//	public static void testInsertBindvarLookupTemplateID()
//	{
//	    Connection con = null;// 创建一个数据库连接
//	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
//	    ResultSet result = null;// 创建一个结果集对象
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	               
//	        String sql = "";
//	        
//	        PreparedStatement pre1 = null;
//	        sql = "insert into aninal001(id,name) values(?,?)";
//	        pre1 = con.prepareStatement(sql);
//	        pre1.setInt(1,1);
//	        pre1.setString(2,"1name1");
//	        result = pre1.executeQuery();
//	        pre1.setInt(1,1);
//	        pre1.setString(2,"1name2");
//	        result = pre1.executeQuery();
//
//	        PreparedStatement pre2 = null;
//	        sql = "insert into aninal002(id,name) values(?,?)";
//	        pre2 = con.prepareStatement(sql);
//	        pre2.setInt(1,2);
//	        pre2.setString(2,"2name1");
//	        result = pre2.executeQuery();
//	        pre2.setInt(1,2);
//	        pre2.setString(2,"2name2");
//	        result = pre2.executeQuery();
//
//	        PreparedStatement pre3 = null;
//	        sql = "insert into aninal003(id,name) values(?,?)";
//	        pre3 = con.prepareStatement(sql);
//	        pre3.setInt(1,3);
//	        pre3.setString(2,"3name1");
//	        result = pre3.executeQuery();
//	        pre3.setInt(1,3);
//	        pre3.setString(2,"3name2");
//	        result = pre3.executeQuery();
//
//	        PreparedStatement pre4 = null;
//	        sql = "insert into aninal004(id,name) values(?,?)";
//	        pre4 = con.prepareStatement(sql);
//	        pre4.setInt(1,4);
//	        pre4.setString(2,"4name1");
//	        result = pre4.executeQuery();
//	        pre4.setInt(1,4);
//	        pre4.setString(2,"4name2");
//	        result = pre4.executeQuery();
//
//	        PreparedStatement pre5 = null;
//	        sql = "insert into aninal005(id,name) values(?,?)";
//	        pre5 = con.prepareStatement(sql);
//	        pre5.setInt(1,5);
//	        pre5.setString(2,"5name1");
//	        result = pre5.executeQuery();
//	        pre5.setInt(1,5);
//	        pre5.setString(2,"5name2");
//	        result = pre5.executeQuery();
//
//	        PreparedStatement pre6 = null;
//	        sql = "insert into aninal006(id,name) values(?,?)";
//	        pre6 = con.prepareStatement(sql);
//	        pre6.setInt(1,6);
//	        pre6.setString(2,"6name1");
//	        result = pre6.executeQuery();
//	        pre6.setInt(1,6);
//	        pre6.setString(2,"6name2");
//	        result = pre6.executeQuery();
//
//	        PreparedStatement pre7 = null;
//	        sql = "insert into aninal007(id,name) values(?,?)";
//	        pre7 = con.prepareStatement(sql);
//	        pre7.setInt(1,7);
//	        pre7.setString(2,"7name1");
//	        result = pre7.executeQuery();
//	        pre7.setInt(1,7);
//	        pre7.setString(2,"7name2");
//	        result = pre7.executeQuery();
//
//	        PreparedStatement pre8 = null;
//	        sql = "insert into aninal008(id,name) values(?,?)";
//	        pre8 = con.prepareStatement(sql);
//	        pre8.setInt(1,8);
//	        pre8.setString(2,"8name1");
//	        result = pre8.executeQuery();
//	        pre8.setInt(1,8);
//	        pre8.setString(2,"8name2");
//	        result = pre8.executeQuery();
//
//	        PreparedStatement pre9 = null;
//	        sql = "insert into aninal009(id,name) values(?,?)";
//	        pre9 = con.prepareStatement(sql);
//	        pre9.setInt(1,9);
//	        pre9.setString(2,"9name1");
//	        result = pre9.executeQuery();
//	        pre9.setInt(1,9);
//	        pre9.setString(2,"9name2");
//	        result = pre9.executeQuery();
//
//	        PreparedStatement pre10 = null;
//	        sql = "insert into aninal010(id,name) values(?,?)";
//	        pre10 = con.prepareStatement(sql);
//	        pre10.setInt(1,10);
//	        pre10.setString(2,"10name1");
//	        result = pre10.executeQuery();
//	        pre10.setInt(1,10);
//	        pre10.setString(2,"10name2");
//	        result = pre10.executeQuery();
//
//	        PreparedStatement pre11 = null;
//	        sql = "insert into aninal011(id,name) values(?,?)";
//	        pre11 = con.prepareStatement(sql);
//	        pre11.setInt(1,11);
//	        pre11.setString(2,"11name1");
//	        result = pre11.executeQuery();
//	        pre11.setInt(1,11);
//	        pre11.setString(2,"11name2");
//	        result = pre11.executeQuery();
//
//	        PreparedStatement pre12 = null;
//	        sql = "insert into aninal012(id,name) values(?,?)";
//	        pre12 = con.prepareStatement(sql);
//	        pre12.setInt(1,12);
//	        pre12.setString(2,"12name1");
//	        result = pre12.executeQuery();
//	        pre12.setInt(1,12);
//	        pre12.setString(2,"12name2");
//	        result = pre12.executeQuery();
//
//	        PreparedStatement pre13 = null;
//	        sql = "insert into aninal013(id,name) values(?,?)";
//	        pre13 = con.prepareStatement(sql);
//	        pre13.setInt(1,13);
//	        pre13.setString(2,"13name1");
//	        result = pre13.executeQuery();
//	        pre13.setInt(1,13);
//	        pre13.setString(2,"13name2");
//	        result = pre13.executeQuery();
//
//	        PreparedStatement pre14 = null;
//	        sql = "insert into aninal014(id,name) values(?,?)";
//	        pre14 = con.prepareStatement(sql);
//	        pre14.setInt(1,14);
//	        pre14.setString(2,"14name1");
//	        result = pre14.executeQuery();
//	        pre14.setInt(1,14);
//	        pre14.setString(2,"14name2");
//	        result = pre14.executeQuery();
//
//	        PreparedStatement pre15 = null;
//	        sql = "insert into aninal015(id,name) values(?,?)";
//	        pre15 = con.prepareStatement(sql);
//	        pre15.setInt(1,15);
//	        pre15.setString(2,"15name1");
//	        result = pre15.executeQuery();
//	        pre15.setInt(1,15);
//	        pre15.setString(2,"15name2");
//	        result = pre15.executeQuery();
//
//	        PreparedStatement pre16 = null;
//	        sql = "insert into aninal016(id,name) values(?,?)";
//	        pre16 = con.prepareStatement(sql);
//	        pre16.setInt(1,16);
//	        pre16.setString(2,"16name1");
//	        result = pre16.executeQuery();
//	        pre16.setInt(1,16);
//	        pre16.setString(2,"16name2");
//	        result = pre16.executeQuery();
//
//	        PreparedStatement pre17 = null;
//	        sql = "insert into aninal017(id,name) values(?,?)";
//	        pre17 = con.prepareStatement(sql);
//	        pre17.setInt(1,17);
//	        pre17.setString(2,"17name1");
//	        result = pre17.executeQuery();
//	        pre17.setInt(1,17);
//	        pre17.setString(2,"17name2");
//	        result = pre17.executeQuery();
//
//	        PreparedStatement pre18 = null;
//	        sql = "insert into aninal018(id,name) values(?,?)";
//	        pre18 = con.prepareStatement(sql);
//	        pre18.setInt(1,18);
//	        pre18.setString(2,"18name1");
//	        result = pre18.executeQuery();
//	        pre18.setInt(1,18);
//	        pre18.setString(2,"18name2");
//	        result = pre18.executeQuery();
//
//	        PreparedStatement pre19 = null;
//	        sql = "insert into aninal019(id,name) values(?,?)";
//	        pre19 = con.prepareStatement(sql);
//	        pre19.setInt(1,19);
//	        pre19.setString(2,"19name1");
//	        result = pre19.executeQuery();
//	        pre19.setInt(1,19);
//	        pre19.setString(2,"19name2");
//	        result = pre19.executeQuery();
//
//	        PreparedStatement pre20 = null;
//	        sql = "insert into aninal020(id,name) values(?,?)";
//	        pre20 = con.prepareStatement(sql);
//	        pre20.setInt(1,20);
//	        pre20.setString(2,"20name1");
//	        result = pre20.executeQuery();
//	        pre20.setInt(1,20);
//	        pre20.setString(2,"20name2");
//	        result = pre20.executeQuery();
//
//	        PreparedStatement pre21 = null;
//	        sql = "insert into aninal021(id,name) values(?,?)";
//	        pre21 = con.prepareStatement(sql);
//	        pre21.setInt(1,21);
//	        pre21.setString(2,"21name1");
//	        result = pre21.executeQuery();
//	        pre21.setInt(1,21);
//	        pre21.setString(2,"21name2");
//	        result = pre21.executeQuery();
//
//	        PreparedStatement pre22 = null;
//	        sql = "insert into aninal022(id,name) values(?,?)";
//	        pre22 = con.prepareStatement(sql);
//	        pre22.setInt(1,22);
//	        pre22.setString(2,"22name1");
//	        result = pre22.executeQuery();
//	        pre22.setInt(1,22);
//	        pre22.setString(2,"22name2");
//	        result = pre22.executeQuery();
//
//	        PreparedStatement pre23 = null;
//	        sql = "insert into aninal023(id,name) values(?,?)";
//	        pre23 = con.prepareStatement(sql);
//	        pre23.setInt(1,23);
//	        pre23.setString(2,"23name1");
//	        result = pre23.executeQuery();
//	        pre23.setInt(1,23);
//	        pre23.setString(2,"23name2");
//	        result = pre23.executeQuery();
//
//	        PreparedStatement pre24 = null;
//	        sql = "insert into aninal024(id,name) values(?,?)";
//	        pre24 = con.prepareStatement(sql);
//	        pre24.setInt(1,24);
//	        pre24.setString(2,"24name1");
//	        result = pre24.executeQuery();
//	        pre24.setInt(1,24);
//	        pre24.setString(2,"24name2");
//	        result = pre24.executeQuery();
//
//	        PreparedStatement pre25 = null;
//	        sql = "insert into aninal025(id,name) values(?,?)";
//	        pre25 = con.prepareStatement(sql);
//	        pre25.setInt(1,25);
//	        pre25.setString(2,"25name1");
//	        result = pre25.executeQuery();
//	        pre25.setInt(1,25);
//	        pre25.setString(2,"25name2");
//	        result = pre25.executeQuery();
//
//	        PreparedStatement pre26 = null;
//	        sql = "insert into aninal026(id,name) values(?,?)";
//	        pre26 = con.prepareStatement(sql);
//	        pre26.setInt(1,26);
//	        pre26.setString(2,"26name1");
//	        result = pre26.executeQuery();
//	        pre26.setInt(1,26);
//	        pre26.setString(2,"26name2");
//	        result = pre26.executeQuery();
//
//	        PreparedStatement pre27 = null;
//	        sql = "insert into aninal027(id,name) values(?,?)";
//	        pre27 = con.prepareStatement(sql);
//	        pre27.setInt(1,27);
//	        pre27.setString(2,"27name1");
//	        result = pre27.executeQuery();
//	        pre27.setInt(1,27);
//	        pre27.setString(2,"27name2");
//	        result = pre27.executeQuery();
//
//	        PreparedStatement pre28 = null;
//	        sql = "insert into aninal028(id,name) values(?,?)";
//	        pre28 = con.prepareStatement(sql);
//	        pre28.setInt(1,28);
//	        pre28.setString(2,"28name1");
//	        result = pre28.executeQuery();
//	        pre28.setInt(1,28);
//	        pre28.setString(2,"28name2");
//	        result = pre28.executeQuery();
//
//	        PreparedStatement pre29 = null;
//	        sql = "insert into aninal029(id,name) values(?,?)";
//	        pre29 = con.prepareStatement(sql);
//	        pre29.setInt(1,29);
//	        pre29.setString(2,"29name1");
//	        result = pre29.executeQuery();
//	        pre29.setInt(1,29);
//	        pre29.setString(2,"29name2");
//	        result = pre29.executeQuery();
//
//	        PreparedStatement pre30 = null;
//	        sql = "insert into aninal030(id,name) values(?,?)";
//	        pre30 = con.prepareStatement(sql);
//	        pre30.setInt(1,30);
//	        pre30.setString(2,"30name1");
//	        result = pre30.executeQuery();
//	        pre30.setInt(1,30);
//	        pre30.setString(2,"30name2");
//	        result = pre30.executeQuery();
//
// 	   
//
//	        
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	   System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (pre != null)
//	                pre.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }	    
//	}
//	
//	
//	public static void testQueryBindvarLookupTemplateID()
//	{
//	    Connection con = null;// 创建一个数据库连接
//	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
//	    ResultSet result = null;// 创建一个结果集对象
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        
//
//	        String sql = "";
//	        PreparedStatement pre1 = null;
//	        sql = "select * from aninal001 where name=?";
//	        pre1 = con.prepareStatement(sql);
//	        pre1.setString(1,"1name1");
//	        result = pre1.executeQuery();
//	        pre1.setString(1,"1name2");
//	        result = pre1.executeQuery();
//
//	        PreparedStatement pre2 = null;
//	        sql = "select * from aninal002 where name=?";
//	        pre2 = con.prepareStatement(sql);
//	        pre2.setString(1,"2name1");
//	        result = pre2.executeQuery();
//	        pre2.setString(1,"2name2");
//	        result = pre2.executeQuery();
//
//	        PreparedStatement pre3 = null;
//	        sql = "select * from aninal003 where name=?";
//	        pre3 = con.prepareStatement(sql);
//	        pre3.setString(1,"3name1");
//	        result = pre3.executeQuery();
//	        pre3.setString(1,"3name2");
//	        result = pre3.executeQuery();
//
//	        PreparedStatement pre4 = null;
//	        sql = "select * from aninal004 where name=?";
//	        pre4 = con.prepareStatement(sql);
//	        pre4.setString(1,"4name1");
//	        result = pre4.executeQuery();
//	        pre4.setString(1,"4name2");
//	        result = pre4.executeQuery();
//
//	        PreparedStatement pre5 = null;
//	        sql = "select * from aninal005 where name=?";
//	        pre5 = con.prepareStatement(sql);
//	        pre5.setString(1,"5name1");
//	        result = pre5.executeQuery();
//	        pre5.setString(1,"5name2");
//	        result = pre5.executeQuery();
//
//	        PreparedStatement pre6 = null;
//	        sql = "select * from aninal006 where name=?";
//	        pre6 = con.prepareStatement(sql);
//	        pre6.setString(1,"6name1");
//	        result = pre6.executeQuery();
//	        pre6.setString(1,"6name2");
//	        result = pre6.executeQuery();
//
//	        PreparedStatement pre7 = null;
//	        sql = "select * from aninal007 where name=?";
//	        pre7 = con.prepareStatement(sql);
//	        pre7.setString(1,"7name1");
//	        result = pre7.executeQuery();
//	        pre7.setString(1,"7name2");
//	        result = pre7.executeQuery();
//
//	        PreparedStatement pre8 = null;
//	        sql = "select * from aninal008 where name=?";
//	        pre8 = con.prepareStatement(sql);
//	        pre8.setString(1,"8name1");
//	        result = pre8.executeQuery();
//	        pre8.setString(1,"8name2");
//	        result = pre8.executeQuery();
//
//	        PreparedStatement pre9 = null;
//	        sql = "select * from aninal009 where name=?";
//	        pre9 = con.prepareStatement(sql);
//	        pre9.setString(1,"9name1");
//	        result = pre9.executeQuery();
//	        pre9.setString(1,"9name2");
//	        result = pre9.executeQuery();
//
//	        PreparedStatement pre10 = null;
//	        sql = "select * from aninal010 where name=?";
//	        pre10 = con.prepareStatement(sql);
//	        pre10.setString(1,"10name1");
//	        result = pre10.executeQuery();
//	        pre10.setString(1,"10name2");
//	        result = pre10.executeQuery();
//
//	        PreparedStatement pre11 = null;
//	        sql = "select * from aninal011 where name=?";
//	        pre11 = con.prepareStatement(sql);
//	        pre11.setString(1,"11name1");
//	        result = pre11.executeQuery();
//	        pre11.setString(1,"11name2");
//	        result = pre11.executeQuery();
//
//	        PreparedStatement pre12 = null;
//	        sql = "select * from aninal012 where name=?";
//	        pre12 = con.prepareStatement(sql);
//	        pre12.setString(1,"12name1");
//	        result = pre12.executeQuery();
//	        pre12.setString(1,"12name2");
//	        result = pre12.executeQuery();
//
//	        PreparedStatement pre13 = null;
//	        sql = "select * from aninal013 where name=?";
//	        pre13 = con.prepareStatement(sql);
//	        pre13.setString(1,"13name1");
//	        result = pre13.executeQuery();
//	        pre13.setString(1,"13name2");
//	        result = pre13.executeQuery();
//
//	        PreparedStatement pre14 = null;
//	        sql = "select * from aninal014 where name=?";
//	        pre14 = con.prepareStatement(sql);
//	        pre14.setString(1,"14name1");
//	        result = pre14.executeQuery();
//	        pre14.setString(1,"14name2");
//	        result = pre14.executeQuery();
//
//	        PreparedStatement pre15 = null;
//	        sql = "select * from aninal015 where name=?";
//	        pre15 = con.prepareStatement(sql);
//	        pre15.setString(1,"15name1");
//	        result = pre15.executeQuery();
//	        pre15.setString(1,"15name2");
//	        result = pre15.executeQuery();
//
//	        PreparedStatement pre16 = null;
//	        sql = "select * from aninal016 where name=?";
//	        pre16 = con.prepareStatement(sql);
//	        pre16.setString(1,"16name1");
//	        result = pre16.executeQuery();
//	        pre16.setString(1,"16name2");
//	        result = pre16.executeQuery();
//
//	        PreparedStatement pre17 = null;
//	        sql = "select * from aninal017 where name=?";
//	        pre17 = con.prepareStatement(sql);
//	        pre17.setString(1,"17name1");
//	        result = pre17.executeQuery();
//	        pre17.setString(1,"17name2");
//	        result = pre17.executeQuery();
//
//	        PreparedStatement pre18 = null;
//	        sql = "select * from aninal018 where name=?";
//	        pre18 = con.prepareStatement(sql);
//	        pre18.setString(1,"18name1");
//	        result = pre18.executeQuery();
//	        pre18.setString(1,"18name2");
//	        result = pre18.executeQuery();
//
//	        PreparedStatement pre19 = null;
//	        sql = "select * from aninal019 where name=?";
//	        pre19 = con.prepareStatement(sql);
//	        pre19.setString(1,"19name1");
//	        result = pre19.executeQuery();
//	        pre19.setString(1,"19name2");
//	        result = pre19.executeQuery();
//
//	        PreparedStatement pre20 = null;
//	        sql = "select * from aninal020 where name=?";
//	        pre20 = con.prepareStatement(sql);
//	        pre20.setString(1,"20name1");
//	        result = pre20.executeQuery();
//	        pre20.setString(1,"20name2");
//	        result = pre20.executeQuery();
//
//	        PreparedStatement pre21 = null;
//	        sql = "select * from aninal021 where name=?";
//	        pre21 = con.prepareStatement(sql);
//	        pre21.setString(1,"21name1");
//	        result = pre21.executeQuery();
//	        pre21.setString(1,"21name2");
//	        result = pre21.executeQuery();
//
//	        PreparedStatement pre22 = null;
//	        sql = "select * from aninal022 where name=?";
//	        pre22 = con.prepareStatement(sql);
//	        pre22.setString(1,"22name1");
//	        result = pre22.executeQuery();
//	        pre22.setString(1,"22name2");
//	        result = pre22.executeQuery();
//
//	        PreparedStatement pre23 = null;
//	        sql = "select * from aninal023 where name=?";
//	        pre23 = con.prepareStatement(sql);
//	        pre23.setString(1,"23name1");
//	        result = pre23.executeQuery();
//	        pre23.setString(1,"23name2");
//	        result = pre23.executeQuery();
//
//	        PreparedStatement pre24 = null;
//	        sql = "select * from aninal024 where name=?";
//	        pre24 = con.prepareStatement(sql);
//	        pre24.setString(1,"24name1");
//	        result = pre24.executeQuery();
//	        pre24.setString(1,"24name2");
//	        result = pre24.executeQuery();
//
//	        PreparedStatement pre25 = null;
//	        sql = "select * from aninal025 where name=?";
//	        pre25 = con.prepareStatement(sql);
//	        pre25.setString(1,"25name1");
//	        result = pre25.executeQuery();
//	        pre25.setString(1,"25name2");
//	        result = pre25.executeQuery();
//
//	        PreparedStatement pre26 = null;
//	        sql = "select * from aninal026 where name=?";
//	        pre26 = con.prepareStatement(sql);
//	        pre26.setString(1,"26name1");
//	        result = pre26.executeQuery();
//	        pre26.setString(1,"26name2");
//	        result = pre26.executeQuery();
//
//	        PreparedStatement pre27 = null;
//	        sql = "select * from aninal027 where name=?";
//	        pre27 = con.prepareStatement(sql);
//	        pre27.setString(1,"27name1");
//	        result = pre27.executeQuery();
//	        pre27.setString(1,"27name2");
//	        result = pre27.executeQuery();
//
//	        PreparedStatement pre28 = null;
//	        sql = "select * from aninal028 where name=?";
//	        pre28 = con.prepareStatement(sql);
//	        pre28.setString(1,"28name1");
//	        result = pre28.executeQuery();
//	        pre28.setString(1,"28name2");
//	        result = pre28.executeQuery();
//
//	        PreparedStatement pre29 = null;
//	        sql = "select * from aninal029 where name=?";
//	        pre29 = con.prepareStatement(sql);
//	        pre29.setString(1,"29name1");
//	        result = pre29.executeQuery();
//	        pre29.setString(1,"29name2");
//	        result = pre29.executeQuery();
//
//	        PreparedStatement pre30 = null;
//	        sql = "select * from aninal030 where name=?";
//	        pre30 = con.prepareStatement(sql);
//	        pre30.setString(1,"30name1");
//	        result = pre30.executeQuery();
//	        pre30.setString(1,"30name2");
//	        result = pre30.executeQuery();
//
//
//
//
//
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	   System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (pre != null)
//	                pre.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//	public static void testQuery2()
//	{
//	    Connection con = null;// 创建一个数据库连接
//	    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
//	    ResultSet result = null;// 创建一个结果集对象
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql = "select * from emps where job33='abcd'";
//
//	        
//	        stmt = con.createStatement();
//	        result = stmt.executeQuery(sql);
//
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	   System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (stmt != null)
//	            	stmt.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//
//
//	public static void testDeleteBindvarLookupTemplateID()
//	{
//	    Connection con = null;// 创建一个数据库连接
//	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
//	    ResultSet result = null;// 创建一个结果集对象
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//
//	        String sql = "";
//	        PreparedStatement pre1 = null;
//	        sql = "delete from aninal001 where name=?";
//	        pre1 = con.prepareStatement(sql);
//	        pre1.setString(1,"1name1");
//	        result = pre1.executeQuery();
//	        pre1.setString(1,"1name2");
//	        result = pre1.executeQuery();
//
//	        /*
//	        PreparedStatement pre2 = null;
//	        sql = "delete from aninal002 where name=?";
//	        pre2 = con.prepareStatement(sql);
//	        pre2.setString(1,"2name1");
//	        result = pre2.executeQuery();
//	        pre2.setString(1,"2name2");
//	        result = pre2.executeQuery();
//
//	        PreparedStatement pre3 = null;
//	        sql = "delete from aninal003 where name=?";
//	        pre3 = con.prepareStatement(sql);
//	        pre3.setString(1,"3name1");
//	        result = pre3.executeQuery();
//	        pre3.setString(1,"3name2");
//	        result = pre3.executeQuery();
//
//	        PreparedStatement pre4 = null;
//	        sql = "delete from aninal004 where name=?";
//	        pre4 = con.prepareStatement(sql);
//	        pre4.setString(1,"4name1");
//	        result = pre4.executeQuery();
//	        pre4.setString(1,"4name2");
//	        result = pre4.executeQuery();
//
//	        PreparedStatement pre5 = null;
//	        sql = "delete from aninal005 where name=?";
//	        pre5 = con.prepareStatement(sql);
//	        pre5.setString(1,"5name1");
//	        result = pre5.executeQuery();
//	        pre5.setString(1,"5name2");
//	        result = pre5.executeQuery();
//
//	        PreparedStatement pre6 = null;
//	        sql = "delete from aninal006 where name=?";
//	        pre6 = con.prepareStatement(sql);
//	        pre6.setString(1,"6name1");
//	        result = pre6.executeQuery();
//	        pre6.setString(1,"6name2");
//	        result = pre6.executeQuery();
//
//	        PreparedStatement pre7 = null;
//	        sql = "delete from aninal007 where name=?";
//	        pre7 = con.prepareStatement(sql);
//	        pre7.setString(1,"7name1");
//	        result = pre7.executeQuery();
//	        pre7.setString(1,"7name2");
//	        result = pre7.executeQuery();
//
//	        PreparedStatement pre8 = null;
//	        sql = "delete from aninal008 where name=?";
//	        pre8 = con.prepareStatement(sql);
//	        pre8.setString(1,"8name1");
//	        result = pre8.executeQuery();
//	        pre8.setString(1,"8name2");
//	        result = pre8.executeQuery();
//
//	        PreparedStatement pre9 = null;
//	        sql = "delete from aninal009 where name=?";
//	        pre9 = con.prepareStatement(sql);
//	        pre9.setString(1,"9name1");
//	        result = pre9.executeQuery();
//	        pre9.setString(1,"9name2");
//	        result = pre9.executeQuery();
//
//	        PreparedStatement pre10 = null;
//	        sql = "delete  from aninal010 where name=?";
//	        pre10 = con.prepareStatement(sql);
//	        pre10.setString(1,"10name1");
//	        result = pre10.executeQuery();
//	        pre10.setString(1,"10name2");
//	        result = pre10.executeQuery();
//
//	        PreparedStatement pre11 = null;
//	        sql = "delete  from aninal011 where name=?";
//	        pre11 = con.prepareStatement(sql);
//	        pre11.setString(1,"11name1");
//	        result = pre11.executeQuery();
//	        pre11.setString(1,"11name2");
//	        result = pre11.executeQuery();
//
//	        PreparedStatement pre12 = null;
//	        sql = "delete  from aninal012 where name=?";
//	        pre12 = con.prepareStatement(sql);
//	        pre12.setString(1,"12name1");
//	        result = pre12.executeQuery();
//	        pre12.setString(1,"12name2");
//	        result = pre12.executeQuery();
//
//	        PreparedStatement pre13 = null;
//	        sql = "delete  from aninal013 where name=?";
//	        pre13 = con.prepareStatement(sql);
//	        pre13.setString(1,"13name1");
//	        result = pre13.executeQuery();
//	        pre13.setString(1,"13name2");
//	        result = pre13.executeQuery();
//
//	        PreparedStatement pre14 = null;
//	        sql = "delete  from aninal014 where name=?";
//	        pre14 = con.prepareStatement(sql);
//	        pre14.setString(1,"14name1");
//	        result = pre14.executeQuery();
//	        pre14.setString(1,"14name2");
//	        result = pre14.executeQuery();
//
//	        PreparedStatement pre15 = null;
//	        sql = "delete  from aninal015 where name=?";
//	        pre15 = con.prepareStatement(sql);
//	        pre15.setString(1,"15name1");
//	        result = pre15.executeQuery();
//	        pre15.setString(1,"15name2");
//	        result = pre15.executeQuery();
//
//	        PreparedStatement pre16 = null;
//	        sql = "delete  from aninal016 where name=?";
//	        pre16 = con.prepareStatement(sql);
//	        pre16.setString(1,"16name1");
//	        result = pre16.executeQuery();
//	        pre16.setString(1,"16name2");
//	        result = pre16.executeQuery();
//
//	        PreparedStatement pre17 = null;
//	        sql = "delete  from aninal017 where name=?";
//	        pre17 = con.prepareStatement(sql);
//	        pre17.setString(1,"17name1");
//	        result = pre17.executeQuery();
//	        pre17.setString(1,"17name2");
//	        result = pre17.executeQuery();
//
//	        PreparedStatement pre18 = null;
//	        sql = "delete  from aninal018 where name=?";
//	        pre18 = con.prepareStatement(sql);
//	        pre18.setString(1,"18name1");
//	        result = pre18.executeQuery();
//	        pre18.setString(1,"18name2");
//	        result = pre18.executeQuery();
//
//	        PreparedStatement pre19 = null;
//	        sql = "delete  from aninal019 where name=?";
//	        pre19 = con.prepareStatement(sql);
//	        pre19.setString(1,"19name1");
//	        result = pre19.executeQuery();
//	        pre19.setString(1,"19name2");
//	        result = pre19.executeQuery();
//
//	        PreparedStatement pre20 = null;
//	        sql = "delete  from aninal020 where name=?";
//	        pre20 = con.prepareStatement(sql);
//	        pre20.setString(1,"20name1");
//	        result = pre20.executeQuery();
//	        pre20.setString(1,"20name2");
//	        result = pre20.executeQuery();
//
//	        PreparedStatement pre21 = null;
//	        sql = "delete  from aninal021 where name=?";
//	        pre21 = con.prepareStatement(sql);
//	        pre21.setString(1,"21name1");
//	        result = pre21.executeQuery();
//	        pre21.setString(1,"21name2");
//	        result = pre21.executeQuery();
//
//	        PreparedStatement pre22 = null;
//	        sql = "delete  from aninal022 where name=?";
//	        pre22 = con.prepareStatement(sql);
//	        pre22.setString(1,"22name1");
//	        result = pre22.executeQuery();
//	        pre22.setString(1,"22name2");
//	        result = pre22.executeQuery();
//
//	        PreparedStatement pre23 = null;
//	        sql = "delete  from aninal023 where name=?";
//	        pre23 = con.prepareStatement(sql);
//	        pre23.setString(1,"23name1");
//	        result = pre23.executeQuery();
//	        pre23.setString(1,"23name2");
//	        result = pre23.executeQuery();
//
//	        PreparedStatement pre24 = null;
//	        sql = "delete  from aninal024 where name=?";
//	        pre24 = con.prepareStatement(sql);
//	        pre24.setString(1,"24name1");
//	        result = pre24.executeQuery();
//	        pre24.setString(1,"24name2");
//	        result = pre24.executeQuery();
//
//	        PreparedStatement pre25 = null;
//	        sql = "delete  from aninal025 where name=?";
//	        pre25 = con.prepareStatement(sql);
//	        pre25.setString(1,"25name1");
//	        result = pre25.executeQuery();
//	        pre25.setString(1,"25name2");
//	        result = pre25.executeQuery();
//
//	        PreparedStatement pre26 = null;
//	        sql = "delete  from aninal026 where name=?";
//	        pre26 = con.prepareStatement(sql);
//	        pre26.setString(1,"26name1");
//	        result = pre26.executeQuery();
//	        pre26.setString(1,"26name2");
//	        result = pre26.executeQuery();
//
//	        PreparedStatement pre27 = null;
//	        sql = "delete  from aninal027 where name=?";
//	        pre27 = con.prepareStatement(sql);
//	        pre27.setString(1,"27name1");
//	        result = pre27.executeQuery();
//	        pre27.setString(1,"27name2");
//	        result = pre27.executeQuery();
//
//	        PreparedStatement pre28 = null;
//	        sql = "delete  from aninal028 where name=?";
//	        pre28 = con.prepareStatement(sql);
//	        pre28.setString(1,"28name1");
//	        result = pre28.executeQuery();
//	        pre28.setString(1,"28name2");
//	        result = pre28.executeQuery();
//
//	        PreparedStatement pre29 = null;
//	        sql = "delete  from aninal029 where name=?";
//	        pre29 = con.prepareStatement(sql);
//	        pre29.setString(1,"29name1");
//	        result = pre29.executeQuery();
//	        pre29.setString(1,"29name2");
//	        result = pre29.executeQuery();
//
//	        PreparedStatement pre30 = null;
//	        sql = "delete  from aninal030 where name=?";
//	        pre30 = con.prepareStatement(sql);
//	        pre30.setString(1,"30name1");
//	        result = pre30.executeQuery();
//	        pre30.setString(1,"30name2");
//	        result = pre30.executeQuery();
//	        */
//	        	
//   	      
//
//
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	   System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (pre != null)
//	                pre.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }	    
//	}
//		
//	
//	public static void testQuery4()
//	{
//	    Connection con = null;// 创建一个数据库连接
//	    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
//	    ResultSet result = null;// 创建一个结果集对象
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql = "select * from emps ";
//
//	        
//	        stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
//	       stmt.setFetchSize(1);
//	      // stmt.setCursorName("1mycursor");
//	       stmt.setFetchDirection(ResultSet.FETCH_FORWARD);
//	        // stmt = con.createStatement();
//	        result = stmt.executeQuery(sql);
//	        //result.setFetchSize(1);
//	        
//
//
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	   System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (stmt != null)
//	            	stmt.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//
//
//	
//	public static void testVartype()
//	{
//	    Connection con = null;
//	    PreparedStatement pre = null;
//	    ResultSet result = null;
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");
//	        System.out.println("开始尝试连接数据库！");
//	        oracle.jdbc.driver.OracleLog.setTrace(true);
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql =  "insert into emps(empno,ename,sal,hiredate) values(?,?,?,?,?,?,?,?  ,?,?,?,?, ?)";
//	      
//	        pre = con.prepareStatement(sql);
//	        
//	        
//	        java.util.Date javaDate = new java.util.Date();
//	        long javaTime = javaDate.getTime();
//	        
//	        System.out.println("The Java Date is:" +  javaDate.toString());
//
//	         //Get and display SQL DATE
//	         java.sql.Date sqlDate = new java.sql.Date(javaTime);
//	         System.out.println("The SQL DATE is: " + sqlDate.toString());
//
//	         //Get and display SQL TIME
//	         java.sql.Time sqlTime = new java.sql.Time(javaTime);
//	         System.out.println("The SQL TIME is: " +  sqlTime.toString());
//	         //Get and display SQL TIMESTAMP
//	         java.sql.Timestamp sqlTimestamp =new java.sql.Timestamp(javaTime);
//	         System.out.println("The SQL TIMESTAMP is: " + sqlTimestamp.toString());
//	         
//	         
//	        pre.setTimestamp(1, new Timestamp(System.currentTimeMillis())); 
//	        pre.setInt(2, 100); 
//	        pre.setString(3, "3test"); 
//	        pre.setDate(4, sqlDate);
//	        pre.setTime(5, sqlTime);
//	        pre.setFloat(6,  1.5021564555F);
//	        pre.setDouble(7, 1.5021564555D);
//	        pre.setLong(8, 0x12345678458975L);
//	        
//	        pre.setBoolean(9, false);
//	        pre.setByte(10, (byte)0x31);
//	        pre.setShort(11, (short)1234);
//	        byte []mybytes = {1, 2};
//	        pre.setBytes(12, mybytes);
//	        
//	        
//	        BigDecimal  mydecimal =  new BigDecimal("18888888888888888888888888888888888888882.352555555555555");
//	        pre.setBigDecimal(13, mydecimal);
//	        result = pre.executeQuery();
//	        	        
//	        
//	        
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	 System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (pre != null)
//	                pre.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }	    
//	}
//	
//	public static void testInsertBindvar()
//	{
//	    Connection con = null;
//	    PreparedStatement pre = null;
//	    ResultSet result = null;
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");
//	        System.out.println("开始尝试连接数据库！");
//	        oracle.jdbc.driver.OracleLog.setTrace(true);
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql =  "insert into emps(empno,ename,sal,hiredate, a1) values(?,?,?,?,?)";
//	      
//	        pre = con.prepareStatement(sql);
//	        pre.setInt(1, 11111);   //0x1  0x60
//	        pre.setInt(2, 12111);   //0x1  0x60
//	        pre.setInt(3, 11211);   //0x1  0x60
//	        pre.setInt(4, 11121);   //0x1  0x60
//	        pre.setInt(5, 11112);   //0x1  0x60
//	        result = pre.executeQuery();
//	        /*
//	        Method method = Class.forName("oracle.jdbc.driver.OraclePreparedStatementWrapper").getDeclaredMethod("getOriginalSql",null);  
//	        method.setAccessible(true);  
//	        System.out.println("sql:  "+ method.invoke(pre, null));
//	        
//	        
//	      
//	        Field field = Class.forName("oracle.jdbc.driver.OraclePreparedStatementWrapper").getDeclaredField("preparedStatement");  
//	        field.setAccessible(true); 
//	        Object s = field.get(pre);  
//	
//
//	        System.out.println("preparedStatement: " + s.getClass());
//	        
//	        
//	        Method[] mths = Class.forName("oracle.jdbc.driver.T4CPreparedStatement").getDeclaredMethods();
//            for (int i = 0; i < mths.length; i++) {
//               // System.out.println("所有方法之" + mths[i].getName());
//                //System.out.println("修饰符类型：" + mths[i].getModifiers());
//            }
//            
//            Field[] fls = Class.forName("oracle.jdbc.driver.T4CPreparedStatement").getFields();
//            for (int i = 0; i < fls.length; i++) {
//                System.out.println("公有属性之" + fls[i].getName());
//                System.out.println("修饰符类型：" + fls[i].getModifiers());
//            }
//            
//            Field[] fls1 = Class.forName("oracle.jdbc.driver.T4CPreparedStatement").getDeclaredFields();
//            for (int i = 0; i < fls1.length; i++) {
//                System.out.println("所有属性之" + fls1[i].getName());
//                System.out.println("修饰符类型：" + fls1[i].getModifiers());
//            }
//            */
//            /*
//	        Field field2 = Class.forName("oracle.jdbc.driver.OracleStatement").getDeclaredField("sqlKind");  
//	        field2.setAccessible(true); 
//	        
//	        Object sqlKind = field.get(s);  
//	        
//	        System.out.println("sqlKind" + sqlKind.getClass());
//	        */
//            
//            
//	       // System.out.println("pre" + pre.getClass());
//	       
//
//	
//	        
//	        
//	        //timestamp 
//	        /*
//	        pre.setTimestamp(1, new Timestamp(System.currentTimeMillis())); 
//	        pre.setTimestamp(2, new Timestamp(System.currentTimeMillis())); 
//	        pre.setTimestamp(3, new Timestamp(System.currentTimeMillis())); 
//	        pre.setTimestamp(4, new Timestamp(System.currentTimeMillis())); 
//	        result = pre.executeQuery();
//	        */
//	  
//	        //pre.setLong(1, 0x12345678L);  //0x8
//	        //pre.setDate(1, new Date(2018-01-02));  //0xc
//	        
//	        /*
//	        pre.setInt(1, 1);   //0x1  0x60
//	        pre.setString(2, "2TEST2");   //0x1  0x60
//	        pre.setInt(3, 1);   //0x1  0x60
//	        pre.setString(4, "4TEST2");   //0x1  0x60
//	        result = pre.executeQuery();
//	        
//	        pre.setInt(1, 1);   //0x1  0x60
//	        pre.setString(2, "5TEST2");   //0x1  0x60
//	        pre.setInt(3, 1);   //0x1  0x60
//	        pre.setString(4, "6TEST2");   //0x1  0x60
//	        result = pre.executeQuery();	        
//	        */
//	        /*
//	        pre.setInt(2, 2);
//	        //pre.setString(2, "TEST2");   //0x1  0x60
//	        //pre.setDate(2, new Date(2018-01-02));  //0xc
//	        //pre.setDate(3, new Date(2018-01-02));  //0xc
//	        pre.setInt(3, 1500);
//	        pre.setString(4, "03-12-81");    //0x1  0x60
//	       // pre.setDate(4, new Date(2018-01-02));  //0x
//	        result = pre.executeQuery();
//			*/
//	        /*
//	        pre.setInt(1, 3);
//	        pre.setString(2, "TEST3");
//	        pre.setInt(3, 1500);
//	        pre.setString(4, "03-12-81");
//	        result = pre.executeQuery();
//	        
//	      
//	        pre.setInt(1, 4);
//	        pre.setString(2, "TEST4");
//	        pre.setInt(3, 1500);
//	        pre.setString(4, "03-12-81");
//	        result = pre.executeQuery();	        
//	        */
//	        
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	 System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (pre != null)
//	                pre.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//	
//	
//	
//	public static void testInsertBindAnimal()
//	{
//	    Connection con = null;
//	    PreparedStatement pre = null;
//	    ResultSet result = null;
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");
//	        System.out.println("开始尝试连接数据库！");
//	        oracle.jdbc.driver.OracleLog.setTrace(true);
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        
//
//	        String sql =  "insert into aninal050(id,name,age,birth1,birth2, price) values(?,?,?,?, ?, ?)";
//	      
//	        pre = con.prepareStatement(sql);
//	        int i = 0;
//	        for(i=0;i<20;i++)
//	        {
//		        pre.setInt(1, 1);   
//		        pre.setString(2, i+ "name");  
//		        pre.setString(3, i+ "age");   
//		        pre.setDate(4, new Date(2018-01-02)); 
//		        pre.setTimestamp(5, new Timestamp(System.currentTimeMillis())); 
//		        pre.setFloat(6, 1.12345678f);
//		        result = pre.executeQuery();	   	        	  	
//	        }
//     
//	
//	        
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	 System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (pre != null)
//	                pre.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//	
//	
//	
//	
//	public static void testDeleteBindAnimal()
//	{
//	    Connection con = null;
//	    PreparedStatement pre = null;
//	    ResultSet result = null;
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");
//	        System.out.println("开始尝试连接数据库！");
//	        oracle.jdbc.driver.OracleLog.setTrace(true);
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        
//
//	        String sql =  "delete from aninal050 where name =  ?";
//	      
//	        pre = con.prepareStatement(sql);
//	        pre.setString(1, "1name1");   
//	        result = pre.executeQuery();	   	      
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	 System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (pre != null)
//	                pre.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//	public static void testlookupDeleteAffectedRows()
//	{
//	    Connection con = null;
//	    PreparedStatement pre = null;
//	    ResultSet result = null;
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");
//	        System.out.println("开始尝试连接数据库！");
//	        oracle.jdbc.driver.OracleLog.setTrace(true);
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        
//	      
//	        String sql =  "select * from aninal050 ";
//	        //String sql =  "delete from aninal050 where id < 30";
//	        /*
//	        pre = con.prepareStatement(sql);
//	        int rd = pre.executeUpdate(sql);
//			*/
//	        pre = con.prepareStatement(sql);
//	        result = pre.executeQuery();	   	 
//	        System.out.println("11 result :"+result.getClass());
//	    
//	        if(result.next()) {
//	        	int count=result.getInt(1);
//	            System.out.println("22 result :"+result.getClass());
//	        	System.out.println("count:"+count);
//	        	}
//	        
///*
//	        sql =  "delete from aninal050";
//	        pre = con.prepareStatement(sql);
//	        int mycount = pre.executeUpdate(); 
//	    	System.out.println("count2:"+mycount);
//	*/
//	        
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	 System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (pre != null)
//	                pre.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//	
//	public static void testInsertBindvarMultiTemplate()
//	{
//	    Connection con = null;
//	    PreparedStatement pre1 = null;
//	    PreparedStatement pre2 = null;
//	    ResultSet result1 = null;
//	    ResultSet result2 = null;
//	    String sql1 = "insert into emps(empno,ename,sal,hiredate) values(?,?,?,?)";
//	    String sql2 =  "select * from emps where job=?";
//	    
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//
//	      
//	        pre1 = con.prepareStatement(sql1);
//	        pre2 = con.prepareStatement(sql2);
//	        
//	        pre1.setInt(1, 200);
//	        pre1.setString(2, "TEST200");
//	        pre1.setInt(3, 1500);
//	        pre1.setString(4, "03-12-81");
//	        result1 = pre1.executeQuery();      
//	            
//	        pre2.setInt(1, 1);
//	        result2 = pre2.executeQuery();	        
//	        
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	 System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	        	result1.close();
//	        	result2.close();
//	        	pre1.close();
//	        	pre2.close();
//	            con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//	
//	
//	 
//	
//	public static void testQueryTransaction()
//	{
//	    Connection con = null;
//	    PreparedStatement pre = null;
//	    PreparedStatement pre2 = null;
//	    ResultSet result = null;
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");
//	        System.out.println("开始尝试连接数据库！");
//	        oracle.jdbc.driver.OracleLog.setTrace(true);
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        con.setAutoCommit(false);
//	
//	        String sql =  "delete from aninal050 where name =  ?";
//	      
//	        pre = con.prepareStatement(sql);
//	        pre.setString(1, "1name1");   
//	        result = pre.executeQuery();	
//	        
//	        
//	    	 sql = "insert into aninal050(id,name) values(?,?)";
//	    	  pre2 = con.prepareStatement(sql);
//	    	  pre2.setInt(1, 1234);  
//	    	  pre2.setString(2, "2name1");  
//
//	    	  result = pre2.executeQuery();	
//			
//	        
//	        con.commit();
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	 System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
//	            // 注意关闭的顺序，最后使用的最先关闭
//	            if (result != null)
//	                result.close();
//	            if (pre != null)
//	                pre.close();
//	            if (con != null)
//	                con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//
//
//	public static void testQuery()
//	{
//	    Connection con = null;// 创建一个数据库连接
//	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
//	    ResultSet result = null;// 创建一个结果集对象
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql = "select * from emps where job='market'";
//	        pre = con.prepareStatement(sql);
//	        pre.setInt(1, 1);
//	        result = pre.executeQuery();
//
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	   System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	        	result.close();
//	        	pre.close();
//	            con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//	public static void generateBtracecode()
//	{
//		int i = 0;
//		for(i=1;i<16;i++)
//		{
//			
//			generateBtracecode2(i);
//			
//		}
//		
//	
//	}
//	
//	public static void generateBtracecode2(int num )
//	{
//		int i ;
//		String mystr;
//		int j;
//		
//		System.out.println("************num start****************\n\n");
//			for(i=0;i<num;)
//			{
//				
//				mystr = "teststr = strcat(\"" + num + "mybytes:\", str( (mybytes["+ i + "]>>4)&0xf));\n";
//				mystr += "teststr = strcat(teststr,\" \");\n";  
//				mystr += "teststr = strcat(teststr,str( mybytes["+ i + "]&0xf));\n";
//				mystr += "println(teststr);\n";
//				System.out.println(mystr);
//				i++;
//			}
//			System.out.println("\n\n************num end****************");
//	}
//	public static void testQueryData()
//	{
//	    Connection con = null;// 创建一个数据库连接
//	    Statement stmt = null;// 创建预编译语句对象，一般都是用这个而不用Statement
//	    ResultSet result = null;// 创建一个结果集对象
//	    ResultSet rs = null;// 创建一个结果集对象
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql = "select * from aninal050";
//	        stmt = con.createStatement();
//
//	        result = stmt.executeQuery(sql);
//	        rs = result;
//	        
//	        //5.处理ResultSet
//	        /*
//	        int i =0;
//	        int a = 10;
//            while(a>0)
//            {
//                if(i< 10)
//                {
//                	rs.next();        
//                    String name = rs.getString("name");                	
//                }
//                else
//                {   
//                	rs.next();        
//                    String name = rs.getString("name");                       	
//                	break;
//                }
//                i++;
//            }
//			*/
//
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	   System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	        	result.close();
//	        	stmt.close();
//	            con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//	
//	
//	
//	public static void testBatch()
//	{
//	    Connection con = null;// 创建一个数据库连接
//	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
//	    ResultSet result = null;// 创建一个结果集对象
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql = "select * from emps where job='market'";
//	        pre = con.prepareStatement(sql);
//	        pre.setInt(1, 1);
//	        result = pre.executeQuery();
//
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	   System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	        	result.close();
//	        	pre.close();
//	            con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//
//	
//	public static void testUpdate()
//	{
//	    Connection con = null;
//	    Statement stmt = null;
//	    ResultSet result = null;
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql = "update job= ?  frome emps where id=1";
//
//	        result = stmt.executeQuery(sql);
//
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	        	result.close();
//	        	stmt.close();
//	            con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//	
//	public static void testDelete()
//	{
//	    Connection con = null;
//	    Statement stmt = null;
//	    ResultSet result = null;
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql = "delete from mytest";
//	        
//	        
//	        result = stmt.executeQuery(sql);
//
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	   System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	        	result.close();
//	        	stmt.close();
//	            con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}	
//	
//	public static void testCreateTable()
//	{
//	    Connection con = null;
//	    Statement stmt = null;
//	    ResultSet result = null;
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql = "create table cam_lc2(id  number primary key,name varchar2(30),sal   number(11,2),dt    date)";
//	      
//	        stmt = con.createStatement();
//	        result = stmt.executeQuery(sql);
//
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	        	result.close();
//	        	stmt.close();
//	            con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}	
//	
//	
//	public static void testCommonSql()
//	{
//	    Connection con = null;
//	    Statement stmt = null;
//	    ResultSet result = null;
//	    try
//	    {
//	        Class.forName("oracle.jdbc.driver.OracleDriver");
//	        System.out.println("开始尝试连接数据库！");
//	        
//	        con = DriverManager.getConnection(OracleTEST.url, OracleTEST.user, OracleTEST.password);
//	        System.out.println("连接成功！");
//	        String sql = "describe   aninal050";
//	         stmt = con.createStatement();
//	        
//	        boolean hasResultSet = stmt.execute(sql);
//	        if (hasResultSet)
//            {
//                try(
//                    // 获取结果集
//                    ResultSet rs = stmt.getResultSet())
//                {
//                    // ResultSetMetaData是用于分析结果集的元数据接口
//                    ResultSetMetaData rsmd = rs.getMetaData();
//                    int columnCount = rsmd.getColumnCount();
//                    // 迭代输出ResultSet对象
//                    while (rs.next())
//                    {
//                        // 依次输出每列的值
//                        for (int i = 0 ; i < columnCount ; i++ )
//                        {
//                            System.out.print(rs.getString(i + 1) + "\t");
//                        }
//                        System.out.print("\n");
//                    }
//                }
//            }
//            else
//            {
//                System.out.println("该SQL语句影响的记录有"
//                    + stmt.getUpdateCount() + "条");
//            }
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//	    finally
//	    {
//	    	System.out.println("22开始关闭数据库！");
//	        try
//	        {
//	        	if(result!=null)
//	        		result.close();
//	        	stmt.close();
//	            con.close();
//	            System.out.println("数据库连接已关闭！");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}	
//	
//	
//	public static void generateCode()
//	{
//	    
//		String sql = "String sql = \"\";";
//		int i;
//		System.out.println(sql);
//		
//		for(i=1;i<10;i++)
//		{
//			System.out.println("PreparedStatement pre" + i + " = null;");
//			
//			sql = "sql = \"select * from aninal00" +  i  +  " where name=" + "?\";\n";
//			sql += "pre" + i + " = con.prepareStatement(sql);\n";
//			sql += "pre" + i  +".setString(1,"+ "\""+ i + "name1\");\n";
//			sql += "result = pre" + i + ".executeQuery();\n";
//			
//			sql += "pre" + i  +".setString(1,"+ "\""+ i + "name2\");\n";
//			sql += "result = pre" + i + ".executeQuery();\n";
//
//	        	        
//			System.out.println(sql);
//		}
//
//		for(i=10;i<31;i++)
//		{
//			System.out.println("PreparedStatement pre" + i + " = null;");
//			
//			sql = "sql = \"select * from aninal0" +  i  +  " where name=" + "?\";\n";
//			sql += "pre" + i + " = con.prepareStatement(sql);\n";
//			sql += "pre" + i  +".setString(1,"+ "\""+ i + "name1\");\n";
//			sql += "result = pre" + i + ".executeQuery();\n";
//			
//			sql += "pre" + i  +".setString(1,"+ "\""+ i + "name2\");\n";
//			sql += "result = pre" + i + ".executeQuery();\n";		
//			
//			System.out.println(sql);
//		}
//
//
//			
//			
//	}
//	
//	
//	
//	
//	public static int generateSelectBindvarCode2(String para_name,  String para_type, int idx)
//	{
//	    
//		String sql = "String sql = \"\";";
//		int i;
//		System.out.println(sql);
//		
//
//		for(i=1;i<10;i++)
//		{
//			System.out.println("PreparedStatement pre" + idx + " = null;");
//			
//			sql = "sql = \"select * from aninal00" +  i  +  " where " + para_name + "=" + "?\";\n";
//			sql += "pre" + i + " = con.prepareStatement(sql);\n";
//		
//	        java.util.Date javaDate = new java.util.Date();
//	        long javaTime = javaDate.getTime();
//	         java.sql.Date sqlDate = new java.sql.Date(javaTime);
//			 				      
//			switch (para_type)
//			{				
//				case "int":
//					sql += "pre" + idx +".setInt(1," + idx + ");\n";		
//					break;					
//				case "date":
//					sql += "pre" + idx  +".setDate(1," + "sqlDate);\n";		
//					break;
//				case "timestamp":
//					sql += "pre" + idx  +".setTimestamp(1," + "new Timestamp(System.currentTimeMillis());\n";		 
//					break;					
//				case "float":
//					sql += "pre" + idx  +".setFloat(1," + idx + ".0005f);\n";		
//					break;
//				case "string":				
//				default:
//					sql += "pre" + idx  +".setString(1,"+ "\""+ idx + para_name + "1\");\n";					
//			}
//
//			sql += "result = pre" + idx + ".executeQuery();\n";
//			
//			switch (para_type)
//			{				
//				case "int":
//					sql += "pre" + idx  +".setInt(1," + idx + ");\n";		
//					break;					
//				case "date":
//					sql += "pre" +idx +".setDate(1," + "sqlDate);\n";		
//					break;
//				case "timestamp":
//					sql += "pre" +idx +".setTimestamp(1," + "new Timestamp(System.currentTimeMillis());\n";		 
//					break;					
//				case "float":
//					sql += "pre" + idx  +".setFloat(1," + idx + ".0005f);\n";		
//					break;
//				case "string":				
//				default:
//					sql += "pre" + idx  +".setString(1,"+ "\""+ idx + para_name + "1\");\n";					
//			}
//			sql += "result = pre" + idx + ".executeQuery();\n";
//
//			idx ++;	        
//			System.out.println(sql);
//		}
//
//		for(i=10;i<=50;i++)
//		{
//			System.out.println("PreparedStatement pre" + idx + " = null;");
//			
//			sql = "sql = \"select * from aninal0" +  i  +  " where " + para_name + "=" + "?\";\n";
//			sql += "pre" + idx + " = con.prepareStatement(sql);\n";
//			
//			switch (para_type)
//			{				
//				case "int":
//					sql += "pre" + idx  +".setInt(1," + idx + ");\n";		
//					break;					
//				case "date":
//					sql += "pre" + idx  +".setDate(1," + "sqlDate);\n";		
//					break;
//				case "timestamp":
//					sql += "pre" +idx +".setTimestamp(1," + "new Timestamp(System.currentTimeMillis());\n";		 
//					break;					
//				case "float":
//					sql += "pre" + idx  +".setFloat(1," + idx + ".0005f);\n";		
//					break;
//				case "string":				
//				default:
//					sql += "pre" + idx  +".setString(1,"+ "\""+ idx + para_name + "1\");\n";					
//			}			
//
//			sql += "result = pre" + idx + ".executeQuery();\n";
//			
//			switch (para_type)
//			{				
//				case "int":
//					sql += "pre" +idx  +".setInt(1," + idx + ");\n";		
//					break;					
//				case "date":
//					sql += "pre" + idx  +".setDate(1," + "sqlDate);\n";		
//					break;
//				case "timestamp":
//					sql += "pre" + idx  +".setTimestamp(1," + "new Timestamp(System.currentTimeMillis());\n";		 
//					break;					
//				case "float":
//					sql += "pre" + idx +".setFloat(1," + idx + ".0005f);\n";		
//					break;
//				case "string":				
//				default:
//					sql += "pre" + idx  +".setString(1,"+ "\""+ idx + para_name + "1\");\n";					
//			}	
//			sql += "result = pre" + idx + ".executeQuery();\n";		
//			
//			idx ++;
//			System.out.println(sql);
//		}
//
//
//		return idx;
//	}
//	
//	public static void generateSelectBindvarCode()
//	{
//	    int idx;
//		
//	    idx = generateSelectBindvarCode2("id", "int", 1);
//	    idx = generateSelectBindvarCode2("name", "string", idx);
//	    idx = generateSelectBindvarCode2("age", "string", idx);
//	    idx = generateSelectBindvarCode2("birth1", "date", idx);
//	    idx = generateSelectBindvarCode2("birth2", "timestamp", idx);
//	    idx = generateSelectBindvarCode2("price", "float", idx);
//	}
//	
//	
//	public static void generateInsertBindvarCode()
//	{
//	    
//		String sql = "String sql = \"\";";
//		int i;
//		System.out.println(sql);
//		
//		for(i=1;i<10;i++)
//		{
//			System.out.println("PreparedStatement pre" + i + " = null;");
//			
//			sql = "sql = \"insert into aninal00" + i + "(id,name) values(?,?)\";\n";
//
//			sql += "pre" + i + " = con.prepareStatement(sql);\n";
//			
//
//	        
//	        sql += "pre" + i  +".setInt(1,"+ i + ");\n";
//			sql += "pre" + i  +".setString(2,"+ "\""+ i + "name1\");\n";
//			sql += "result = pre" + i + ".executeQuery();\n";
//			
//			sql += "pre" + i  +".setInt(1," + i + ");\n";
//			sql += "pre" + i  +".setString(2,"+ "\""+ i + "name2\");\n";
//			sql += "result = pre" + i + ".executeQuery();\n";
//
//	        	        
//			System.out.println(sql);
//		}
//
//		for(i=10;i<31;i++)
//		{
//			System.out.println("PreparedStatement pre" + i + " = null;");
//			
//			sql = "sql = \"insert into aninal0" + i + "(id,name) values(?,?)\";\n";
//			sql += "pre" + i + " = con.prepareStatement(sql);\n";
//			
//			 sql += "pre" + i  +".setInt(1," + i + ");\n";
//			sql += "pre" + i  +".setString(2,"+ "\""+ i + "name1\");\n";
//			sql += "result = pre" + i + ".executeQuery();\n";
//			
//			sql += "pre" + i  +".setInt(1," + i + ");\n";
//			sql += "pre" + i  +".setString(2,"+ "\""+ i + "name2\");\n";
//			sql += "result = pre" + i + ".executeQuery();\n";		
//			
//			System.out.println(sql);
//		}
//
//       
//
//			
//			
//	}
//	
//	
//
//	
//	
//	public static void generateDeleteBindvarCode()
//	{
//	    
//		String sql = "String sql = \"\";";
//		int i;
//		System.out.println(sql);
//		
//		
//
//		for(i=1;i<10;i++)
//		{
//			System.out.println("PreparedStatement pre" + i + " = null;");
//			
//			sql = "sql = \"delete from aninal00" +  i  +  " where name=" + "?\";\n";
//			sql += "pre" + i + " = con.prepareStatement(sql);\n";
//			sql += "pre" + i  +".setString(1,"+ "\""+ i + "name1\");\n";
//			sql += "result = pre" + i + ".executeQuery();\n";
//			
//			sql += "pre" + i  +".setString(1,"+ "\""+ i + "name2\");\n";
//			sql += "result = pre" + i + ".executeQuery();\n";
//
//	        	        
//			System.out.println(sql);
//		}
//
//		for(i=10;i<31;i++)
//		{
//			System.out.println("PreparedStatement pre" + i + " = null;");
//			
//			sql = "sql = \"delete  from aninal0" +  i  +  " where name=" + "?\";\n";
//			sql += "pre" + i + " = con.prepareStatement(sql);\n";
//			sql += "pre" + i  +".setString(1,"+ "\""+ i + "name1\");\n";
//			sql += "result = pre" + i + ".executeQuery();\n";
//			
//			sql += "pre" + i  +".setString(1,"+ "\""+ i + "name2\");\n";
//			sql += "result = pre" + i + ".executeQuery();\n";		
//			
//			System.out.println(sql);
//		}
//
//
//			
//			
//	}
//	
//	/**
//	 * @param args
//	 */
//	public static void t_main(String[] args) 
//	{
//		// TODO Auto-generated method stub
//		//testQueryBindvar();
//
//		//testInsertBindvarMultiTemplate();
//		
//		//System.setProperty("oracle.jdbc.Trace", "true");
//		//System.setProperty("java.util.logging.config.file", "e:/OracleLog.properties");
//		
//		
//
//		/*
//	
//		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
//
//		ObjectName pattern;
//		try {
//			pattern = new ObjectName("com.oracle.jdbc:type=diagnosability,*");
//	
//			ObjectName diag = ((ObjectName[])
//			 (mbs.queryNames(pattern, null).toArray(new ObjectName[0])))[0];
//		
//			System.out.println("LoggingEnabled = " + mbs.getAttribute(diag, "LoggingEnabled"));
//	
//			mbs.setAttribute(diag, new Attribute("LoggingEnabled", true));
//
//			mbs.setAttribute(diag, new Attribute("LoggingEnabled", false));					
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		*/
//		
//		//testInsertBindvar();
//		
//		//System.out.println("system Properties:" + System.getProperties().toString() );
//		
//		
//		
//		int a = 100;
//
//
//		while(a > 1)
//		{
//			//testQueryBindvar();
//			//testQueryBindvar034e();
//			//testQueryBindvar034e2();
//			//testInsertBindvar();
//			//testQuery2();
//			testVartype();
//			//testQuery4();
//			//testInsertBindAnimal();
//			//testDeleteBindAnimal();
//			//generateCode();
//			//generateSelectBindvarCode();
//			//generateInsertBindvarCode();
//			//testQueryBindvarLookupTemplateID();
//			//testInsertBindvarLookupTemplateID();
//			//testDeleteBindvarLookupTemplateID();
//			//generateDeleteBindvarCode();
//			//testQueryData();
//			generateBtracecode();
//			//testQueryTransaction();
//			//testCommonSql();
//			//testlookupDeleteAffectedRows();
//			//generateBtracecode2(10);
//			try {
//				Thread.sleep(10000);
//			} catch (InterruptedException e) {
//
//				e.printStackTrace();
//			} 
//		
//			
//		}
//	
//	}
//	
//	
//	
//	
//
//}