public class Options {
    static void welcome() {
        System.out.println(
            "1 Log in\n"+
            "2 Register\n"+
            "3 Exit"
        );
        DaoFactory.getScanner().nextLine();
    }
}
