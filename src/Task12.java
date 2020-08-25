import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите текст: ");
        String Line = reader.readLine();
        Line = Line.replaceAll("\\s","");
        System.out.println(Line);
    }
}
