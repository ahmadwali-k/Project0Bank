import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList.*;

public class BooksDaoImpl implements BooksDao {

    Connection connection;

    public BooksDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public void createBooks(Book book) throws SQLException {

        String sql = "create table Book (Title varchar(30), ISBN integer, Author varchar(30)," +
                " Price double(7,2), Category varchar(50), Description varchar(100));";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.addBatch(sql);
        preparedStatement.executeBatch();
    }
    @Override
    public void createUsers(Book book) throws SQLException {
        String sql = "create table User (Name varchar(30), ID integer, password varchar(50));";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.addBatch();
        preparedStatement.executeBatch();
    }

    @Override
    public void updateBooks(Book book) throws SQLException {
        String sql = "insert into Book (Title, ISBN, Author, Price, Category, Description) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, book.getTitle());
        preparedStatement.setInt(2, book.getIsbn());
        preparedStatement.setString(3, book.getAuthor());
        preparedStatement.setDouble(4, book.getPrice());
        preparedStatement.setString(5, book.category);
        preparedStatement.setString(6, book.description);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Updated Successfully");
        }
        else
            System.out.println("Update failed");
    }
    @Override
    public void updateUsers(Book book) throws SQLException {
        String sql = "insert into User (Name, ID, password) values (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, book.name);
        preparedStatement.setInt(2, book.getId());
        preparedStatement.setString(3, book.getPassword());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("User Updated");
        }
        else {
            System.out.println("Update Failed");
        }
    }
    @Override
    public List<Book> getBooks() throws SQLException {
        List<Book> books = new ArrayList<Book>();
        String sql = "select * from Book";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String Title = resultSet.getString(1);
            int ISBN = resultSet.getInt(2);
            String Author = resultSet.getString(3);
            int Price = resultSet.getInt(4);
            String Category = resultSet.getString(5);
            String Description = resultSet.getString(6);
            Book book = new Book(Title, ISBN, Author, Price, Category, Description);
            books.add(book);
        }
        return books;
    }
    @Override
    public void displayTable(Book book) throws SQLException {


            //UserDaoImpl userDao = new UserDaoImpl();
            String sql = "Select * from Book";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("_____________________________________________________________________________________________________________");
                System.out.print("|Title: " + resultSet.getString(1) + "| ISBN: " +
                        resultSet.getInt(2) + "| Author: " + resultSet.getString(3)
                        + "| Price: " + resultSet.getInt(4)
                        + "| Category: " + resultSet.getString(5) + "| Description: " + resultSet.getString(6));
                System.out.println("\n_____________________________________________________________________________________________________________");
            }

    }

}
