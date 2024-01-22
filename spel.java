import java.util.Random;
import java.util.Scanner;

public class spel {
    public static void main(String[] args) throws Exception {
        try (Scanner tangentbord = new Scanner(System.in)) {
            System.out.println(" +------------------------------+");
            System.out.println(" I    Welcome to blackjack      I");
            System.out.println(" +------------------------------+");
            Thread.sleep(1000);
            System.out.println(" +------------------------------+");
            System.out.println(" I         Start game?          I");
            System.out.println(" +------------------------------+");
            Thread.sleep(1000);
            System.out.println(" +------------------------------+");
            System.out.println(" I     YES           NO         I");
            System.out.println(" +------------------------------+");
            String val1 = tangentbord.nextLine();
            if(val1.equalsIgnoreCase("yes")){
                System.out.println("ok lets start");
            } else {
                System.out.println("come back later");
                
            }

            String[] color = {"hearts", "spades","clover","diamonds"};
            String[] value = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
            Random kort = new Random();
            int slump = kort.nextInt(14);
            Random kort_1 = new Random();
            int slump2 = kort_1.nextInt(14);
            int randomNum = (int)(Math.random()*5);
            int randomNum2 = (int)(Math.random()*5);
            String kort1 = value[slump];
            String kort2 = value[slump2];
            System.out.println(value[slump]+" "+color[randomNum]);
            System.out.println(value[slump2]+" "+color[randomNum2]);
            int playerHand = 0;
            switch (kort1){
                case "2":
                playerHand+=2;
                break;
                case "3":
                playerHand+=3;
                break;
                case "4":
                playerHand+=4;
                break;
                case "5":
                playerHand+=5;
                break;
                case "6":
                playerHand+=6;
                break;
                case "7":
                playerHand+=7;
                break;
                case "8":
                playerHand+=8;
                break;
                case "9":
                playerHand+=9;
                break;
                case "10":
                playerHand+=10;
                break;
                case "J":
                playerHand+=10;
                break;
                case "Q":
                playerHand+=10;
                break;
                case "K":
                playerHand+=10;
                break;
                case "A":
                playerHand+=11;
                break;
            }
            switch (kort2){
                case "2":
                playerHand+=2;
                break;
                case "3":
                playerHand+=3;
                break;
                case "4":
                playerHand+=4;
                break;
                case "5":
                playerHand+=5;
                break;
                case "6":
                playerHand+=6;
                break;
                case "7":
                playerHand+=7;
                break;
                case "8":
                playerHand+=8;
                break;
                case "9":
                playerHand+=9;
                break;
                case "10":
                playerHand+=10;
                break;
                case "J":
                playerHand+=10;
                break;
                case "Q":
                playerHand+=10;
                break;
                case "K":
                playerHand+=10;
                break;
                case "A":
                playerHand+=11;
                break;
            }
            System.out.println(playerHand);
            Thread.sleep(1000);
            System.out.println("Want another card?");
            Thread.sleep(200);
            System.out.println("Yes or No");
            String val2 = tangentbord.nextLine();
            if(val2.equalsIgnoreCase("yes")){
                Random kort3 = new Random();
                int slump3 = kort3.nextInt(14);
                int randomNum3 = (int)(Math.random()*4);
                String kort4 = value[slump3];
                System.out.println(value[slump3]+" "+color[randomNum3]);
            switch (kort4){
                case "2":
                playerHand+=2;
                break;
                case "3":
                playerHand+=3;
                break;
                case "4":
                playerHand+=4;
                break;
                case "5":
                playerHand+=5;
                break;
                case "6":
                playerHand+=6;
                break;
                case "7":
                playerHand+=7;
                break;
                case "8":
                playerHand+=8;
                break;
                case "9":
                playerHand+=9;
                break;
                case "10":
                playerHand+=10;
                break;
                case "J":
                playerHand+=10;
                break;
                case "Q":
                playerHand+=10;
                break;
                case "K":
                playerHand+=10;
                break;
                case "A":
                playerHand+=11;
                break;
            }
            Thread.sleep(1000);
            System.out.println(playerHand);
            if (playerHand>21){
                System.out.println("you went over, u loose");
            } else if (playerHand<=21){
                System.out.println("want another card?");
            }
                
            } else {
                System.out.println("ok dealers turn");
            }
        }
    }
}

