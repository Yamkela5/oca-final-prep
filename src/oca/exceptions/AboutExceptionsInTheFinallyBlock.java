package oca.exceptions;

import java.io.IOException;

public class AboutExceptionsInTheFinallyBlock {

    public static void main(String[] args) throws Exception, IOException {

        try {
         throw new IOException("first");
        } catch(Exception ex) {
            System.out.println(ex);
        }
        finally {
                System.out.println("one...");
                try {
                    throw new Exception("two");
                } catch(Exception e) {
                    System.out.println("final battle!");
                }
            }


            }
        }

