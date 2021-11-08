public class EmployeeDaoFactory {
    private static EmployeeDao dao3;

    private EmployeeDaoFactory() {
    }

    public  static EmployeeDao getEmployeeDao(){
        if(dao3 == null){
            dao3 = new EmployeeDaoImpl();
        }
        return dao3;
    }
}
