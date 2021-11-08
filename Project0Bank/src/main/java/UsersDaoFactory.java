public class UsersDaoFactory {
    private static UsersDao dao;

    private UsersDaoFactory() {

    }
    public static UsersDao getUserDao() {
        if (dao == null) {
            dao = new UserDaoImpl();
        }
        return dao;
    }
}