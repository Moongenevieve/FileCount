import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int countWords(String fileName){
        int wordCount =0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String document =  reader.readLine();

            while (document!=null){
                String [] words = document.trim().split(" ");
                wordCount += words.length;
                document = reader.readLine();

            }
            reader.close();

            //   System.out.println("Total number of words: "+ wordCount);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
         String path = "Testing.txt";
         int result = countWords(path);
        System.out.println("The total number of words in this file is "+result);

    }
}