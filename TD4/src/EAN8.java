public class EAN8 {

    public String charToBinarySetA(char c) {

        switch (Character.toUpperCase(c)) {
            case '0':
                return "0001101";
            case '1':
                return "0011001";
            case '2':
                return "0010011";
            case '3':
                return "0111101";
            case '4':
                return "0100011";
            case '5':
                return "0110001";
            case '6':
                return "0101111";
            case '7':
                return "0111011";
            case '8':
                return "0110111";
            case '9':
                return "0001011";
            default:
                return "";
        }
    }

    public String charToBinarySetC(char c) {

        switch (Character.toUpperCase(c)) {
            case '0':
                return "1110010";
            case '1':
                return "1100110";
            case '2':
                return "1101100";
            case '3':
                return "1000010";
            case '4':
                return "1011100";
            case '5':
                return "1001110";
            case '6':
                return "1010000";
            case '7':
                return "1000100";
            case '8':
                return "1001000";
            case '9':
                return "1110100";
            default:
                return "";
        }
    }
}
