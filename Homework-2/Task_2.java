import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
    public static String readFile(String path) throws IOException {
        StringBuilder stringBuilder1 = new StringBuilder();
        FileInputStream fileStream = new FileInputStream(new File(path));
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(fileStream));

        String line;
        while ((line = bufferReader.readLine()) != null) {
            stringBuilder1.append(line + System.lineSeparator());
        }
        return stringBuilder1.toString();
    }

    public static void main(String[] args) throws IOException {
        String filePath = "log_app2.txt";

        String content = "";
        try {
            content = readFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder stringBuilder2 = new StringBuilder();
        for (char i : content.toCharArray()) {
            if (i != '\"') {
                stringBuilder2.append(i);
            }
        }
        System.out.print(stringBuilder2);
        System.out.println();
        String str_sb2 = stringBuilder2.toString();
        str_sb2 = str_sb2.replaceAll("[:,\r]", " ");
        String str_sb3 = str_sb2.replaceAll("фамилия", "Студент");
        String str_sb4 = str_sb3.replaceAll("оценка", "получил");
        String str_sb5 = str_sb4.replaceAll("предмет", "по предмету");

        System.out.print(str_sb5);

    }
}
