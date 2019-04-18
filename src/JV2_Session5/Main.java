package JV2_Session5;
//Buoc1
import java.sql.*;
public class Main {
    public static void main(String[] args){
        try {
//            Buoc2: thong bao driver muon su dung
            Class.forName("com.mysql.jdbc.Driver");

//            Buoc3: tao ket noi
            String URL="jdbc:mysql://localhost:3306/t1808m";
            Connection conn=DriverManager.getConnection(URL,"t1808m","t1808m");

//            Buoc4 thuc thi truy van
            Statement statement=conn.createStatement();

//            Them Sinh Vien
//            String insert_sql="INSERT INTO student(name,age,mark) VALUES ('Nguyen Van C',11,10)";
//            statement.executeUpdate(insert_sql);

//            Chinh sua thong tin 1 sinh vien bang ID
            String updatSQL="UPDATE student SET NAME='Nguyen Van A' WHERE ID=1";
            statement.execute(updatSQL);

//            Xoa 1 sinh vien Bang ID
            String delSQL="DELETE FROM student WHERE id=4";
            statement.execute(delSQL);

//            In Ra Thong Tin Sinh Vien
            String sql="SELECT* FROM student";
            ResultSet rs=statement.executeQuery(sql);

            while (rs.next()){
                System.out.println("ID: "+rs.getString("id"));
                System.out.println("NAME: "+rs.getString("name"));
                System.out.println("AGE: "+rs.getString("age"));
                System.out.println("MARK: "+rs.getString("mark"));
            }
        }catch (Exception e){}

    }
}
