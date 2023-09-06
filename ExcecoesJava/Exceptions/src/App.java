import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;

public class App {
    public static void main(String[] args) {
        try {
            Number valor = NumberFormat.getInstance().parse("a1.75");

            System.out.println(valor);
        } catch (ParseException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        
    }
}
