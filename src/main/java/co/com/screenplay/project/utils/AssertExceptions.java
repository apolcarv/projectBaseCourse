package co.com.screenplay.project.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class AssertExceptions extends Exception {

    public AssertExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertExceptions(String message) {
        super(message);
    }

    public static String getErrorStackTrace(Exception e) {
        StringWriter errors = new StringWriter();
        e.printStackTrace(new PrintWriter(errors));
        return errors.toString();
    }
}