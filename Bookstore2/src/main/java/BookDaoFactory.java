
public class BookDaoFactory {
    private static BookDao dao;

    private BookDaoFactory() {

    }
    public static BookDao getBookDao() {
        if (dao == null) {
            dao = new BookDaoImpl();
        }
        return dao;
    }
}
