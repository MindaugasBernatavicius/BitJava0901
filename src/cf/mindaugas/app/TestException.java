package cf.mindaugas.app;

public class TestException extends RuntimeException {
    public static void main(String[] args) {
        try {
            throw new TestException();
        } catch (TestException t) {
            System.out.println("Got the Test Exception");
            throw new TestException();
        } finally {
            System.out.println("Inside finally black");
        }
    }
}
