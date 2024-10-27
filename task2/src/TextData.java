public class TextData {
    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;

    public TextData(String fileName, String text) {
        this.fileName = fileName;
        this.text = text;
        analyzeText();
    }

    private void analyzeText() {
        numberOfVowels = 0;
        numberOfConsonants = 0;
        numberOfLetters = 0;
        numberOfSentences = 0;
        longestWord = "";

        String[] words = text.split("\\s+");

        // find longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        char[] textAsChar = text.toCharArray();
        for (char ch : textAsChar) {
            // count letters, vowels and consonants
            if (Character.isLetter(ch)) {
                numberOfLetters++;
                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    numberOfVowels++;
                } else {
                    numberOfConsonants++;
                }
            } else if (ch == '.' || ch == '!' || ch == '?') { // check for end of sentence
                numberOfSentences++;
            }
        }
    }

    public String getFileName() {
        return fileName;
    }

    public String getText() {
        return text;
    }

    public int getNumberOfVowels() {
        return numberOfVowels;
    }

    public int getNumberOfConsonants() {
        return numberOfConsonants;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public int getNumberOfSentences() {
        return numberOfSentences;
    }

    public String getLongestWord() {
        return longestWord;
    }
}
