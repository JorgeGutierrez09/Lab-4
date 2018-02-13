
    import java.util.Scanner;

    public class Main {
        public static void main(String args[]) {
            Scanner scanr = new Scanner(System.in);
            String hexaDeciInput;
            double characterValue;
            int counter = 0;
            char hexiNumber;
            int power;
            int stringLength;
            long totalVar = 0;

            System.out.print("Enter a hexadecimal number: ");
            hexaDeciInput = scanr.nextLine();


            if (hexaDeciInput.charAt(1) == 'x') {
                hexaDeciInput = hexaDeciInput.replace("0x", "");
            }
            stringLength = hexaDeciInput.length();
            //System.out.println(stringLength);


            while (counter < stringLength) {
                hexiNumber = hexaDeciInput.charAt(counter);
                //System.out.println(hexiNumber);
                switch (hexiNumber) {
                    case ('0'):
                        characterValue = 0;
                        break;
                    case ('1'):
                        characterValue = 1;
                        break;
                    case ('2'):
                        characterValue = 2;
                        break;
                    case ('3'):
                        characterValue = 3;
                        break;
                    case ('4'):
                        characterValue = 4;
                        break;
                    case ('5'):
                        characterValue = 5;
                        break;
                    case ('6'):
                        characterValue = 6;
                        break;
                    case ('7'):
                        characterValue = 7;
                        break;
                    case ('8'):
                        characterValue = 8;
                        break;
                    case ('9'):
                        characterValue = 9;
                        break;
                    case ('a'):
                        characterValue = 10;
                        break;
                    case ('A'):
                        characterValue = 10;
                        break;
                    case ('b'):
                        characterValue = 11;
                        break;
                    case ('B'):
                        characterValue = 11;
                        break;
                    case ('c'):
                        characterValue = 12;
                        break;
                    case ('C'):
                        characterValue = 12;
                        break;
                    case ('d'):
                        characterValue = 13;
                        break;
                    case ('D'):
                        characterValue = 13;
                        break;
                    case ('E'):
                        characterValue = 14;
                        break;
                    case ('e'):
                        characterValue = 14;
                        break;
                    case ('F'):
                        characterValue = 15;
                        break;
                    case ('f'):
                        characterValue = 15;
                        break;
                    default:
                        characterValue = 0;
                }
                power = (stringLength - counter - 1);

                characterValue = characterValue * Math.pow(16, power);
                //System.out.println(characterValue);
                totalVar = totalVar + (long) characterValue;
                counter++;

            }
            System.out.println("Your number is " + totalVar + " in decimal\n");
        }
    }

