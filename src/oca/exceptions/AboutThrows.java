package oca.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AboutThrows {

    public void doStuff() throws FileNotFoundException {
        FileReader fileReader = new FileReader("./out.txt");
    }

    public void doStuffAgain(int counter) throws Exception {
//        try {
//            // new FileReader("./out.txt");
//        } catch(IOException ex) {
//            throw new RuntimeException(ex);
//        }

        if (counter < 10) {
            throw new RuntimeException();
        } else if (counter > 10) {
            throw new Exception("Booo!");
        } else {
            throw new Error("Whoop whoop!");
        }


    }
    public static void main(String[] args) {
        try {
            AboutThrows aboutThrows = new AboutThrows();
            aboutThrows.doStuffAgain(19);
            System.out.println("no exception...");
        } catch (RuntimeException ex) {
            System.out.println("Exception happened");
        } catch (Exception ex) {
            System.out.println("Exception happened");
        }
        catch(Throwable ex) {
            System.out.println("Throwable happened.");
        }
        finally {
            System.out.println("After doStuff");
        }
        System.out.println("done!");
    }

}
