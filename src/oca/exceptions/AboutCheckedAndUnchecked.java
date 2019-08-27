package oca.exceptions;

class MyCheckedException extends Exception {

}

class MyUncheckedException extends RuntimeException {

}


public class AboutCheckedAndUnchecked {

    public static void doThrow(int i) throws MyCheckedException {
        if (i < 10) {
            throw new MyCheckedException();
        } else if (i > 9 && i< 20) {
            throw new MyUncheckedException();
        }
    }

    public static void main(String[] args) {
       try {
           doThrow(27);
           System.out.println("done..."); // if no exception is thrown
       } catch (MyCheckedException ex) {
           System.out.println("my checked exception");
       }  catch (MyUncheckedException ex) {
           System.out.println("my runtime exception");
       }
    }
}
