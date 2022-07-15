public class TestExceptions {
    public static void main(String[] args) {

        String test = "no";

        try {
            System.out.println("Начало try");
            doRisky(test);
            System.out.println("Конец try");
        }
        catch (SecurityException se) {
            System.out.println("Жуткое исключение");
        }
        finally {
            System.out.println("finaly");
        }
        System.out.println("Конец main");

    }

    static void doRisky(String test) throws SecurityException {
        System.out.println("Начало опасного метода");

        if ("yes".equals(test)) {

            throw new SecurityException();
        }
        System.out.println("Конец опасного метода");
        return;
    }
}
