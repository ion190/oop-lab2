import java.io.IOException;
// java Main faker.txt fakefile.txt

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the file path as a command-line argument.");
            return;
        }

        for (String filePath : args) {
            try {
                String fileContent = FileReader.readFileIntoString(filePath);
                System.out.println("Processing file: " + filePath);

                TextData textData = new TextData(filePath, fileContent);

                System.out.println("File Name: " + textData.getFileName());
                System.out.println("Text: " + textData.getText());
                System.out.println();
                System.out.println("Number of Vowels: " + textData.getNumberOfVowels());
                System.out.println("Number of Consonants: " + textData.getNumberOfConsonants());
                System.out.println("Number of Letters: " + textData.getNumberOfLetters());
                System.out.println("Number of Sentences: " + textData.getNumberOfSentences());
                System.out.println("Longest Word: " + textData.getLongestWord());

            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }
        }
    }
}