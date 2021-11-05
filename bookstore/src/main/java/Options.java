public class Options {
    static void welcome() {
        boolean loggedIn = false;
        do {
            System.out.println(
                "1 Log in\n"+
                "2 Register\n"+
                "3 Exit"
            );
            
            int num1;
            try {
                num1 = DaoFactory.getScanner().nextInt();
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Cannot accept strings");
                continue;
            }            
            switch (num1) {
                case 1: logIn();
                    break;
                case 2: register();
                    break;
                case 3: return; // TODO: change if needed
                    // break;
                default:
                    break;
            }

        } while (!loggedIn);

    }
    
    static void logIn() {
        
    }
    
    static void register() {
        
    }
    
}
