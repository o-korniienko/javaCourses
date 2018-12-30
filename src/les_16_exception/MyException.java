package les_16_exception;

import java.io.PrintStream;

public class MyException extends Exception {
    public void printStackTrace(PrintStream s){
        System.err.println("Це моя помилка");
    }
    public String getMessage(){
        return "Відпрацював getMessage";
    }
}
