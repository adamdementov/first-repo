package db_hopeful;
import java.sql.*;
import java.util.Scanner;

public class Main {
	public Connection conn = null;
	Scanner scan = null;
//	public static void main(String[] args) {
//		new Main().realMain();
//
//	}
//	public void realMain(){
//		
//		
//		if(getConnection("jdbc:mysql://localhost:3306/new_schema?useSSL=false","adam","adam")){
//			insertFruit();
//		}
//	}
//	public boolean getConnection(String connectionString,String user,String pass){
//		try{
//			conn = DriverManager.getConnection(
//					connectionString,user,pass);
//			return true;
//		}catch(SQLException exc){
//			return false;
//		}
//	}
//	
//	public void insertFruit(){
//		scan = new Scanner(System.in);
//		try{
//		String fruit = "";
//		do{
//		System.out.println("fruit = ");
//		fruit = scan.next();
//		if(fruit.equals("quit"))
//			break;
//		System.out.println("amount = ");
//		int amt = scan.nextInt();
//		PreparedStatement stmt = conn.prepareStatement("insert into `new_schema`.`fruits` (name,amt) values (\""+fruit+"\","+amt+")");
//		stmt.execute();
//		}while(true);
//		}catch(SQLException exc){
//			exc.printStackTrace();
//		}
//	}

}
