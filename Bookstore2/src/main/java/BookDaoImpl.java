

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDaoImpl implements BookDao {

    Connection connection;

    public BookDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public void createBooks(Book book) throws SQLException {

        String sql = "create table Book (Name varchar(50), ISBN integer, Title varchar(30), Author varchar(30)," +
                " Price double(7,2), Category varchar(50), Description varchar(100));";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.addBatch(sql);
        preparedStatement.executeBatch();
    }

    @Override
    public void updateBooks(Book book) throws SQLException {
        String sql = "insert into Book (Name, ISBN, Title, Author, Price, Category, Description) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, book.getName());
        preparedStatement.setInt(2, book.getIsbn());
        preparedStatement.setString(3, book.getTitle());
        preparedStatement.setString(4, book.getAuthor());
        preparedStatement.setDouble(5, book.getPrice());
        preparedStatement.setString(6, book.category);
        preparedStatement.setString(7, book.description);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Updated Successfully");
        }
        else
            System.out.println("Update failed");
    }

}

