import java.util.*;

public class DictionaryCommandLine {
    
    final int noSpace = 4;
    final int targetSpace = 25;
    
    //this function displays all the words

    public void showAllWords(Dictionary dictionary) {
        // Print header
        System.out.print("No");
        for (int i = 1; i <= noSpace - 2; i++) {
            System.out.print(" ");
        }
        System.out.print("|  English");
        for (int i = 1; i <= targetSpace - 9; i++) {
            System.out.print(" ");
        }
        System.out.println("|  Vietnamese");
        // Print content
        for (int i = 1; i <= dictionary.wordList.size(); i++) {
            String no = i + "";
            String target = dictionary.wordList.get(i - 1);
            String explain = dictionary.word.get(target).word_explain;

            System.out.print(no);
            for (int j = 1; j <= noSpace - no.length(); j++) {
                System.out.print(" ");
            }
            System.out.print("|" + target);
            for (int j = 1; j <= targetSpace - target.length(); j++) {
                System.out.print(" ");
            }
            System.out.println("|" + explain);
        }
    }

    public void insertFromCommandline(Dictionary dictionary) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the amount of word: ");
        int wordAmount = scan.nextInt();
        System.out.println();
        scan.nextLine();

        for (int i = 1; i <= wordAmount; i++) {
            System.out.print("Input " + i + " target : ");
            String target = scan.nextLine();
            System.out.print("Input " + i + " explain: ");
            String explain = scan.nextLine();
            dictionary.addWord(target, explain);
        }
        scan.close();
    }

    public void dictionaryBasic(Dictionary dictionary) {
        insertFromCommandline(dictionary);
        showAllWords(dictionary);
    }

}
