package googlecom.codetrek;

/**
 * Created by SWATI on 04-06-2017.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by hema on 03-Jun-17.
 */

public class SimpleWords {


    private ArrayList<String> words;
    Random random = new Random();

    public SimpleWords(InputStream wordList) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(wordList));//here wordList is the list of all words
        words = new ArrayList<>();
        String line = null;
        while ((line = in.readLine()) != null) {
            String word = line.trim();
            if (word.length() >= 3)
                words.add(line.trim());
        }
    }

    public boolean isWord(String word,int index ) { // function to check whether the word entered by the user is correct or not
        String isword= words.get(index);
        if (word.equalsIgnoreCase(isword))
            return true;
        else
            return false;
    }
}

