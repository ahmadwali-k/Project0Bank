

import java.sql.SQLException;

public interface BookDao {


    void createBooks(Book book) throws SQLException;
    void updateBooks(Book book) throws SQLException;


}
