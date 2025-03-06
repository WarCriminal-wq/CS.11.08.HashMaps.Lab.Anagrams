import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.util.Collections.*;
import java.io.*;

public class AnagramSolver {

    private AnagramSolver() {};

    /**
     * Input: name of text file (containing English words).
     * Output: a hashmap of lists of words that are anagrams.
     * @param filename
     * @return
     */
//helper methods are so diddy
    public static String sort(String original) {
        char[] temp = original.toCharArray();
        Arrays.sort(temp);
        String gey = new String(temp);
        return gey;
    }

    public static HashMap<String, ArrayList<String>> anagrams(String filename) throws FileNotFoundException {
        HashMap<String, ArrayList<String>> diddy = new HashMap<String, ArrayList<String>>();
        Scanner drake = new Scanner(new File(filename));
        while( drake.hasNextLine()){
            String current = drake.nextLine().trim();
            String sorted = sort(current);

            ArrayList<String> epstein;
            epstein = diddy.get(sorted);
            if(epstein == null){
                epstein = new ArrayList<>();

            }
            epstein.add(current);
            diddy.put(sorted, epstein);


        }
        drake.close();
        return diddy;
    }

    /**
     * Input: hashmap of lists of words that are anagrams.
     * Output: largest list of words in hashmap that are anagrams.
     * @param anagrams
     * @return
     */
    public static ArrayList<String> mostFrequentAnagram(HashMap<String, ArrayList<String>> anagrams) {
        ArrayList<String> wilson_He = new ArrayList<>();
        for (ArrayList<String> anagramList : anagrams.values()){
            if (anagramList.size() > wilson_He.size()){
                wilson_He = anagramList;
            }
        }
        return wilson_He;
    }

    /**
     * Input: hashmap of lists of words that are anagrams.
     * Output: prints all key value pairs in the hashmap.
     * @param anagrams
     */
    public static void printKeyValuePairs(HashMap<String, ArrayList<String>> anagrams) {
        System.out.println("nice try diddy");
    }

}
