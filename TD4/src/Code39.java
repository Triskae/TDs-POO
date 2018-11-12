import java.applet.Applet;
import java.awt.*;

public class Code39 extends Applet {


    private Graphics g;

    public void paint(Graphics g) {
        this.g = g;
        stringToBarCode("*JAVA 2012*");
        String tab [] = new String[0];
        int i = tab.length;
    }

    public void stringToBarCode(String string) {

        char[] stringArray = string.toCharArray();
        StringBuilder returnString = new StringBuilder();

        //new IterateurSymbole(charToBinary('*'), g);

        for (char currentChar : stringArray) {
            returnString.append(charToBinary(currentChar));
            new IterateurSymbole(charToBinary(currentChar), g);
        }

        //new IterateurSymbole(charToBinary('*'), g);
    }

    public String charToBinary(char c) {

        switch (Character.toUpperCase(c)) {
            case 'A':
                return "100001001";
            case 'B':
                return "001001001";
            case 'C':
                return "101001000";
            case 'D':
                return "000011001";
            case 'E':
                return "100011000";
            case 'F':
                return "001011000";
            case 'G':
                return "000001101";
            case 'H':
                return "100001100";
            case 'I':
                return "001001100";
            case 'J':
                return "000011100";
            case 'K':
                return "100000011";
            case 'L':
                return "001000011";
            case 'M':
                return "101000010";
            case 'N':
                return "000010011";
            case 'O':
                return "100010010";
            case 'P':
                return "001010010";
            case 'Q':
                return "000000111";
            case 'R':
                return "100000110";
            case 'S':
                return "001000110";
            case 'T':
                return "000010110";
            case 'U':
                return "110000001";
            case 'V':
                return "011000001";
            case 'W':
                return "111000000";
            case 'X':
                return "010010001";
            case 'Y':
                return "110010000";
            case 'Z':
                return "011010000";
            case '1':
                return "100100001";
            case '2':
                return "001100001";
            case '3':
                return "101100000";
            case '4':
                return "000110001";
            case '5':
                return "100110000";
            case '6':
                return "001110000";
            case '7':
                return "000100101";
            case '8':
                return "100100100";
            case '9':
                return "001100100";
            case '0':
                return "000110100";
            case ' ':
                return "011000100";
            case '-':
                return "010000101";
            case '$':
                return "010101000";
            case '%':
                return "000101010";
            case '.':
                return "110000100";
            case '/':
                return "010100010";
            case '+':
                return "010001010";
            case '*':
                return "010010100";
            default:
                return "";
        }
    }
}
