import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    static int missed=0;
    static String word="";
    static Scanner in = new Scanner(System.in);
    static char [] letters;
    static char [] filled;



    public static void main(String[] args)
    {
        System.out.println("What word should player 2 guess?");
        word= in.next().toLowerCase();
       letters =new char[word.length()];
       filled = new char[word.length()];
       System.out.println("HANGMAN");

        for(int x=0;x<word.length();x++)
        {
            letters[x]=word.charAt(x);
        }

        while(missed<=7)
        {
            System.out.println(createBoard(missed));
            play(word);
        }

    }
    public static String play(String word){
        System.out.println("Missed");
        System.out.println("Guess a letter");
String l = in.next();
int y=0;
int length= word.length()-1;
        char guess= l.charAt(0);
        for(char x:letters)
        {

            if(x!=guess)
            {
                if(y==length)
                {
                   missed++;
                }
                y++;
            }
            else
            {
                fill(y,letters);
                continue;
            }
        }

        return null;
    }
    public static void fill(int x,char[] y)
    {
        filled[x]=y[x];
        System.out.println(Arrays.toString(filled));

    }
    public static String createBoard(int missed)
    {
        String no="";
        String board="";
        String board1="";
        String board2="";
        String board3="";
        String board4="";
        String board5="";
        String board6="";
        String board7="";

        switch(missed){
        case 0:
         board=
                "  +---+\n" +
                "\n" +
                "      |\n" +
                "\n" +
                "      |\n" +
                "\n" +
                "      |\n" +
                "\n" +
                "     ===";

        return board;

        case 1:
             board1=
                    "  +---+\n" +
                    "\n" +
                    "  O   |\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "     ===";

            return board1;
        case 2:
            board2=" +---+\n" +
                    "\n" +
                    "O   |\n" +
                    "\n" +
                    "|   |\n" +
                    "\n" +
                    "    |\n" +
                    "\n" +
                    "    ===";

            return board2;
            case 3:
                board= "H A N G M A N\n" +
                        "\n" +
                        "  +---+\n" +
                        "\n" +
                        "      |\n" +
                        "\n" +
                        "      |\n" +
                        "\n" +
                        "      |\n" +
                        "\n" +
                        "     ===";
                return board3;

            case 4:
                board4=
                        "  +---+\n" +
                        "\n" +
                        "  O    |\n" +
                        "\n" +
                        "\\ |    |\n" +
                        "\n" +
                        "  |    |\n" +
                        "\n" +
                        "     ===";

                return board4;
            case 5:
                board5= "  +---+\n" +
                        "\n" +
                        "  O    |\n" +
                        "\n" +
                        "\\ | /  |\n" +
                        "\n" +
                        "  |    |\n" +
                        "\n" +
                        "     ===";

                return board5;
            case 6:
                board6= "  +---+\n" +
                        "\n" +
                        "  O    |\n" +
                        "\n" +
                        "\\ | /  |\n" +
                        "\n" +
                        " /|    |\n" +
                        "\n" +
                        "     ===";

                return board6;
            case 7:
                board7= "  +---+\n" +
                        "\n" +
                        "  O    |\n" +
                        "\n" +
                        "\\ | /  |\n" +
                        "\n" +
                        " /|\\   |\n" +
                        "\n" +
                        "     ===";

                return board7;
        }


    return no;
    }

}
