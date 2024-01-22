import java.util.Scanner;
import java.util.Random;

public class kortforsok {
    public static void main(String[] args) {
        Myrandom();
        Myrandom();
        System.out.println("dealer has");
        Myrandom();
        Myrandom();
        //System.out.println(Myrandom(0));
      }
        static int Myrandom(){
          String[] color = {"hearts", "spades","clover","diamonds"};
          String[] value = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
          Random kort = new Random();
          int slump = kort.nextInt(13);
          int randomNum2 = (int)(Math.random()*4);
          String kort1 = value[slump];
          System.out.println(value[slump]+" "+color[randomNum2]);
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
              case "10","J","Q","K":
                playerHand+=10;
                break;
              case "A":
                playerHand+=11;
              break;
              default :
              break;
          }
          //System.out.println(playerHand);
          return playerHand;
        }
    
}
