import java.sql.*;
class DBExample {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver ==============================
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database Connection =================================
            String url = "jdbc:mysql://localhost:3306/php_basic_projects";
            String user = "root";
            String password = "pankaj";
            Connection con = DriverManager.getConnection(url, user, password);

            // create statement ====================================
            String insert = "INSERT INTO students (NAME, COURSE, EMAIL) VALUES ('Amit', 'BCA', 'pd@gmail.com')";
            Statement st = con.createStatement();
            st.executeUpdate(insert);

            // Fetch Data ============================================
            ResultSet rs = st.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getString("COURSE"));
            }

            con.close();
            System.out.println("Connection Closed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
