//foodDetailDAO

package com.sist.dao;
// DBCP (톰캣)=> 웹에서만 사용이 가능 (웹애플리케이션의 데이터베이스 기본)
// 일반 JDBC 사용 
import java.util.*;
import java.sql.*;
/*
 *   MNO      NOT NULL NUMBER        
	CNO               NUMBER        
	TITLE    NOT NULL VARCHAR2(500) 
	GRADE    NOT NULL VARCHAR2(50)  
	RESERVE           VARCHAR2(20)  
	GENRE    NOT NULL VARCHAR2(200) 
	TIME              VARCHAR2(30)  
	REGDATE           VARCHAR2(200) 
	DIRECTOR NOT NULL VARCHAR2(100) 
	ACTOR             VARCHAR2(200) 
	SHOWUSER          VARCHAR2(20)  
	POSTER   NOT NULL VARCHAR2(260) 
	STORY             CLOB          
	KEY      NOT NULL VARCHAR2(50)  
	HIT               NUMBER        
	SCORE             NUMBER(3,2)   
 */
public class foodDetailDAO {
   private Connection conn;
   private PreparedStatement ps;
   private final String URL="jdbc:oracle:thin:@211.63.89.131:1521:XE";
   private static foodDetailDAO dao;
   // 드라이버 등록 
   public foodDetailDAO()
   {
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
	   }catch(Exception ex){}
   }
   // 연결 
   public void getConnection()
   {
	   try
	   {
		   conn=DriverManager.getConnection(URL,"hr","happy");
	   }catch(Exception ex) {}
   }
   public void disConnection()
   {
	   try
	   {
		   if(ps!=null) ps.close();
		   if(conn!=null) conn.close();
	   }catch(Exception ex) {}
   }
   // 싱글턴 => DAO를 한번만 사용이 가능 (메모리 공간을 1개만 생성) = 재사용
   // 스프링에서는 기본 (싱글턴) => 필요시에는 여러개 객체 생성 => prototype
   public static foodDetailDAO newInstance()
   {
	   if(dao==null)
		   dao=new foodDetailDAO();
	   return dao;
   }
   // 데이터 수집 => insert
   
   // 카테고리 저장 
   public void foodCategoryInsert(CategoryVO vo)
   {
	   try
	   {
		   getConnection();
		   
		   String sql="INSERT INTO gg_foodCategory_4 VALUES("
				     +"gfc_fcno_seq_4.nextval,?,?,?,?)";
		   
		   ps=conn.prepareStatement(sql);
		   
		   //ps.setInt(1, vo.getFcno());
		   ps.setString(1, vo.getTitle());
		   ps.setString(2, vo.getSubtitle());
		   ps.setString(3, vo.getPoster());
		   ps.setString(4, vo.getLink());
		   ps.executeUpdate();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   disConnection();
	   }
   }
   // 카테고리별 맛집 저장
   /*
    *   NO      NOT NULL NUMBER         
	CNO              NUMBER         
	POSTER  NOT NULL VARCHAR2(2000) 
	NAME    NOT NULL VARCHAR2(300)  
	SCORE   NOT NULL NUMBER(2,1)    
	ADDRESS NOT NULL VARCHAR2(1000) 
	TEL     NOT NULL VARCHAR2(20)   
	TYPE    NOT NULL VARCHAR2(100)  
	PRICE            VARCHAR2(100)  
	PARKING          VARCHAR2(100)  
	TIME             VARCHAR2(100)  
	MENU             VARCHAR2(4000) 
	GOOD             NUMBER         
	SOSO             NUMBER         
	BAD              NUMBER 
    */
   public void foodDetailInsert(foodDetailVO vo)
   {
	   try
	   {
		   //gfd_fno_seq_4.nextval
		   getConnection();
		   // (fno,fcno,poster,name,score,addr,tel,type,price,parking,time,menu,good,soso,bad)
		   String sql="INSERT INTO gg_foodDetail_4(fno,fcno,poster,name,score,addr,tel,type,price,parking,time,menu,good,soso,bad) VALUES("
				     +"gfd_fno_seq_4.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		   ps=conn.prepareStatement(sql);
		   //ps.setInt(1, vo.getFno());
		   ps.setInt(1, vo.getFcno());
		   ps.setString(2, vo.getPoster());
		   ps.setString(3, vo.getName());
		   ps.setDouble(4, vo.getScore());
		   ps.setString(5, vo.getAddr());
		   ps.setString(6, vo.getTel());
		   ps.setString(7, vo.getType());
		   ps.setString(8, vo.getPrice());
		   ps.setString(9, vo.getParking());
		   ps.setString(10, vo.getTime());
		   ps.setString(11, vo.getMenu());
		   ps.setInt(12, vo.getGood());
		   ps.setInt(13, vo.getSoso());
		   ps.setInt(14, vo.getBad());
		   
		   ps.executeUpdate();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   disConnection();
	   }
   }
   // 지역별 맛집 => 캡쳐 

   public void foodLocationInsert(foodLocationVO vo)
   {
	   try
	   {
		   getConnection();
		   String sql="INSERT INTO gg_locationFood_4(no,poster,name,score,addr,tel,type,price,parking,time,menu,good,soso,bad) VALUES("
				     +"glf_no_seq_4.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		   ps=conn.prepareStatement(sql);
		   //ps.setInt(1, vo.getNo());
		   ps.setString(1, vo.getPoster());
		   ps.setString(2, vo.getName());
		   ps.setDouble(3, vo.getScore());
		   ps.setString(4, vo.getAddr());
		   ps.setString(5, vo.getTel());
		   ps.setString(6, vo.getType());
		   ps.setString(7, vo.getPrice());
		   ps.setString(8, vo.getParking());
		   ps.setString(9, vo.getTime());
		   ps.setString(10, vo.getMenu());
		   ps.setInt(11, vo.getGood());
		   ps.setInt(12, vo.getSoso());
		   ps.setInt(13, vo.getBad());
		   ps.executeUpdate();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   disConnection();
	   }
   }
   
   public ArrayList<CategoryVO> foodCategoryInfoData()
   {
	   // link , fcno
	   ArrayList<CategoryVO> list=new ArrayList<CategoryVO>();
	   try
	   {
		   getConnection();
		   String sql="SELECT fcno,link FROM gg_foodCategory_4 "
				     +"ORDER BY 1";
		   ps=conn.prepareStatement(sql);
		   ResultSet rs=ps.executeQuery();
		   while(rs.next())
		   {
			   CategoryVO vo=new CategoryVO();
			   vo.setFcno(rs.getInt(1));
			   vo.setLink(rs.getString(2));
			   list.add(vo);
		   }
		   rs.close();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   disConnection();
	   }
	   return list;
   }
/////////////////////////////////////////////////////////////////////////////////////////////////

   
}


