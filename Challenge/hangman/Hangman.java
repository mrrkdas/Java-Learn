public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        // Our word
        String word = randomWord(words);

        int wrongGuesses = 0;

        while (wrongGuesses < 6) {
            showHangman(wrongGuesses);
            System.out.println("\n\n");
            displayWord(word);

            



        }

        System.out.println("RIP!");







    }




    /* Function that chooses random word
    Name: randomWord
     * @param words
     * @return string
     * Generates random number between length of array and 0
     */

    // TASK ONE

    public static String randomWord(String[] words) {
        int randomNumber = (int) (Math.random() *( words.length -1));
        return words[randomNumber];
    }

    /* 
     * 
     * Name: showHangman
     * This function will show the right hangman depending on the number of letters wrongly guessed
     * @param wrongGuesses (int)
     */

    //TASK TWO
    public static void showHangman(int wrongGuesses) {
        System.out.print(gallows[wrongGuesses]);
    }

    /*
     * Name displayWord
     * @param word
     * shows word in -
     */

    public static void displayWord(String word) {
        char[] charWordArray = word.toCharArray();
        char[] underscoreDisplay = new char[charWordArray.length];

        for (int i = 0; i < underscoreDisplay.length; i++) {
            underscoreDisplay[i] = '-';
        }

        System.out.println("Word: " + underscoreDisplay.toString());
    }


    



}





