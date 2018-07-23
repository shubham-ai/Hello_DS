import java.util.*;
import java.io.*;


public class HelloWorld {
	public static ArrayList<String> merge(String[] words, String[] more){
		ArrayList<String> sentence = new ArrayList<String>();
		for(String w : words) sentence.add(w);
		for(String w : more) sentence.add(w);
		return sentence;
	}

	public static String joinWords (String[] words){
		StringBuilder sentence = new StringBuilder();
		for(String w : words) sentence.append(w);
			return sentence.toString();
	}
	public static Boolean unique(String words ) {
		int wordL = words.length();
			for (int i = 0 ; i < wordL ; i++) {
				for(int j = (i+1); j < wordL; j++){
					if(words.charAt(i)==words.charAt(j)){

						System.out.println(words.charAt(i));
						return false;
					}
				}
			}
		return true;
	}
	public static Boolean permutation(String words,String others){
		if(words.length()==others.length() && words.length()>0){
			char word[] = words.toCharArray();
			char other[] = others.toCharArray();
			// if(Arrays.sort(word) !=null &&  Arrays.sort(word)==Arrays.sort(other)){
			// 	return true;
			// }
		 // System.out.println(joinWords(Arrays.sort(word)));

		}
		return false;

	}

    public static void main(String[] args) {
        String[] words = {"asda"};
        String[] more = {"osm", "qwe", "qwe"};
        String myWord=(joinWords(words)).toString();
        // System.out.println(joinWords(words));
        // System.out.println(joinWords(words));
        System.out.println(unique(myWord));
    }
}