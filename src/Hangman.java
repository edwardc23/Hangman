import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    static int missed=0;
    static String[] words= new String[]{"dismal",
            "cannae",
            "diaper",
            "asosan",
            "astron",
            "mostly",
            "cowled",
            "chroma",
            "nakuru",
            "sepsis",
            "censor",
            "gotten",
            "guided",
            "trygon",
            "denise",
            "script",
            "edward",
            "fishes",
            "animus",
            "florin"};
    static String word="";
    static Scanner in = new Scanner(System.in);
    static char [] letters;
    static char [] filled ;
    static String missedLetter;
    static char [] mL;
    static String ans="yes";
    static boolean isDone = false;
    static int iter=0;
    public static void main(String[] args)
    {
        Random rand = new Random();


        while(ans.equals("yes"))
        {
            int randNum= rand.nextInt(20);
            mL=new char[26];
            word= words[randNum];
            letters =new char[word.length()];
            filled =new char[word.length()];
            filled=blankArray(filled);

            System.out.println("HANGMAN");
            missedLetter="";
            for(int x=0;x<word.length();x++)
            {
                letters[x]=word.charAt(x);
            }

            while(missed<7)
            {
                int y=0;
                for(char x:letters)
                {
                    if(x!=filled[y])
                    {
                        break;
                    }
                    else
                    {
                        y++;
                    }
                    if(y==word.length())
                    {
                        String win="Yes! The secret word is \"%s\"! You have won!";
                        System.out.println(String.format(win,word));
                        isDone=true;
                        break;
                    }

                }
                if(isDone==false){
                    System.out.println(createBoard(missed));
                    play(word);}
                else
                    {
                    break;
                }



            }
            System.out.println("Do you want to play again? (yes or no)");
            ans= in.next();
            if(ans.equals("yes"))
            {
                isDone=false;
            }
        }

    }
    public static void play(String word){
        String miss="Missed letters:";
        System.out.println(miss+" "+missedLetter);
        print(filled);
        System.out.println("Guess a letter");

        String l = in.next();
        int y=0;
        int length= word.length()-1;

        char guess= l.charAt(0);
        for(char x:filled){
            if(mL!=null){
                for(char t:mL){
                    if(guess==x||guess==t)
                        {
                            System.out.println("You have already guessed that letter. Choose again.");
                            String w=in.next();
                            guess=w.charAt(0);
                            break;
                        }
                }
                }
        }
        for(char x:letters)
        {

            if(x!=guess)
            {
                if(y==length)
                {
                   missedLetter= missedLetter+guess;
                    mL[iter]=guess;

                   missed++;

                }
                y++;
            }
            else
                { Integer [] index=new Integer[word.length()];
            Integer k=0;
            int place=0;
                for (char z:letters)
                {
                    if(z==guess)
                    {
                        index[place]=k;
                        place++;
                    }
                    k++;
                }
                fill(index,letters);
                break;
            }
        }


    }
    public static void print (char [] arr)
    {
        for(char x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println("");
    }
    public static char[] blankArray(char[] fillThis)
    {
        int x=0;
        while(x<=fillThis.length-1)
        {
            fillThis[x]='_';
            x++;
        }

        return fillThis;
    }
    public static void fill(Integer[] x,char[] y)
    {
        for(Integer c:x)
        {
            if(c!=null) {
                filled[c.intValue()] = y[c.intValue()];
            }
        }

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
                board3= " +---+\n" +
                        "\n" +
                        "O   |\n" +
                        "\n" +
                        "|   |\n" +
                        "\n" +
                        "|   |\n" +
                        "\n" +
                        "    ===";
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
