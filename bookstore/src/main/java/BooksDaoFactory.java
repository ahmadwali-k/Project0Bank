public class BooksDaoFactory {
    private static BooksDao dao;
    private BooksDaoFactory() {

    }
    public static BooksDao getBookDao() {
        if (dao == null) {
            dao = new BooksDaoImpl();
        }
        return dao;
    }
}
