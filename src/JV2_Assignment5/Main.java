package JV2_Assignment5;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static final int DEACTIVE = 0;
    public static final int ACTIVE = 1;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/t1808m";
            Connection conect = DriverManager.getConnection(URL, "t1808m", "t1808m");
            boolean stop = false;
            while (!stop) {
                System.out.println("Menu:");
                System.out.println("1.dang nhap");
                System.out.println("2.dang ki ");
                System.out.println("3.Xem danh sach");
                System.out.println("4.Xoa user");
                System.out.println("5.Exit");
                Scanner nhap = new Scanner(System.in);
                int menu = nhap.hasNextInt() ? nhap.nextInt() : 0;
                if (menu > 0 && menu < 6) {
                    switch (menu) {
                        case 1: login(conect);
                            break;
                        case 2:register(conect);
                            break;
                        case 3:list(conect);
                            break;
                        case 4:delUser(conect);
                            break;
                        case 5: stop = true;
                            break;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void login(Connection conect) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;
        while (!success) {
            System.out.println("Username: ");
            String username = scanner.nextLine();
            System.out.println("Password: ");
            String password = scanner.nextLine();
            Statement sttm = conect.createStatement();
            String sql = "SELECT * FROM user WHERE username = '" + username
                    + "'AND password = '" + password+"'";
            ResultSet rs = sttm.executeQuery(sql);
            if (rs.next()) {

                System.out.println("Dang nhap thanh cong");
                return;
            }
            System.out.println("Dang nhap sai , vui long nhap lai ");

        }
    }
    public static void register(Connection conect) throws Exception{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap THong tin dang ki ");
        System.out.println("username : ");
        String username=scanner.nextLine();
        System.out.println("Email : ");
        String email=scanner.nextLine();
        System.out.println("Password : ");
        String password=scanner.nextLine();
        System.out.println("Status");
        int status=scanner.nextInt();
        Statement sttm = conect.createStatement();
        String insert_sql="INSERT INTO User(username,email,password,status) VALUES ('"+username+"','"+email+"','"+password+"',"+status+")";
        System.out.println(insert_sql);
        sttm.executeUpdate(insert_sql);
    }
    public static void list(Connection conect) throws Exception{
       try {

           Statement statement=conect.createStatement();
           String listSql="SELECT * FROM User";
           ResultSet resultSet=statement.executeQuery(listSql);
           while (resultSet.next()){
               System.out.println("ID: "+resultSet.getString("id"));
               System.out.println("UserName: "+resultSet.getString("username"));
               System.out.println("Email: "+resultSet.getString("email"));
               System.out.println("Password: "+resultSet.getString("password"));
               System.out.println("Status: "+resultSet.getString("status"));
           }
       }catch (Exception e){}
    }
    public static void delUser(Connection conect) throws Exception{
        System.out.println("1.Xoa User");
        System.out.println("2.Disable");
        Scanner scanner=new Scanner(System.in);
        int DelAndDis=scanner.hasNextInt()?scanner.nextInt():5;

        if (DelAndDis>0 && DelAndDis<3){
            switch (DelAndDis){
                case 1:DelUser(conect);
                break;
                case 2:Disable(conect);
                break;
            }
        }
    }
    public static void DelUser(Connection conect)throws Exception{
        try {
            Statement statement=conect.createStatement();
            Scanner scanner=new Scanner(System.in);
            System.out.println("Chon id de xoa: ");
            int id=scanner.nextInt();
            String dellUser="DELETE FROM User WHERE id="+id;
            statement.executeUpdate(dellUser);
            System.out.println(dellUser);
        }catch (Exception e){}
    }
    public static void Disable(Connection conect)throws Exception{
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Chon id de sua: ");
            int id=scanner.nextInt();
            Statement statement=conect.createStatement();
            String disable="UPDATE User SET status=1 WHERE id="+id;
            statement.executeUpdate(disable);
            System.out.println(disable);
        }catch (Exception e){}
    }

}