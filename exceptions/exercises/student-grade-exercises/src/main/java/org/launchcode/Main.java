package org.launchcode;

import java.util.HashMap;
import java.util.logging.Logger;

public class Main {
    static Logger Logg = Logger.getLogger("MAIN");
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", null);

        // Test out your CheckFileExtension() function!
        System.out.println(CheckFileExtension(null));
        System.out.println(CheckFileExtension(""));
        System.out.println(CheckFileExtension("  "));
        System.out.println(CheckFileExtension("code.java"));
        System.out.println(CheckFileExtension("codename"));

    }

    public static double Divide(int x, int y) throws ArithmeticException
    {
        try {
            if ( y == 0 ) {
                throw new ArithmeticException("Possible Points set to zero");
            }
            return (double) x /y;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName == null || fileName.isEmpty() || fileName.isBlank()) {
            try {
                throw new Exception("No file provided");
            } catch (Exception e) {
                System.out.println(e);
                return -1;
            }
        }
        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}