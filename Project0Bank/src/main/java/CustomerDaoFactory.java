public class CustomerDaoFactory {
    private static CustomerDao dao1;

    private CustomerDaoFactory() {

    }
    public static CustomerDao getCustomerDao() {
        if (dao1 == null) {
            dao1 = new CustomerDaoImpl();
        }
        return dao1;
    }
}
