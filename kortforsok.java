import java.util.Scanner;
import java.util.Random;

public class kortforsok {
  static final Scanner tangentbord = new Scanner(System.in);
  static final int playerHand = 0;
  static final int playedHand1 = playerHand+0;
    //public static int playedHand = 0;
    public static void main(String[] args) throws Exception {
        StartScreen();
        Myrandom(playerHand);
        Thread.sleep(500);
        Myrandom(playerHand);
        Thread.sleep(500);
        AnotherCard();
        /* 
        if (playerHand >21){
          System.out.println("you bust!");
          System.out.println("Dealer wins");
        } else if (playedHand == 21){
          System.out.println("You hit 21!")
          System.out.println("You win 1.5x")
          playerMoney = playerMoney + playerBet*1.5;
        } else if (playerhand < 21){
          System.out.println("Do you want another card?")

        }
        */
        Thread.sleep(500);
        //System.out.println("Do you want another card?");
        //System.out.println(playerHand);
        //System.out.println("dealer has");

        //System.out.println(Myrandom(0));
      }
        static void Myrandom(int playerHand){
          String[] color = {"hearts", "spades","clover","diamonds"};
          String[] value = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
          Random kort = new Random();
          int slump = kort.nextInt(13);
          int randomNum2 = (int)(Math.random()*4);
          String kort1 = value[slump];
          System.out.println(value[slump]+" "+color[randomNum2]);
          //int playerHand = 0;
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
        }
        public static void AnotherCard() throws Exception{
            System.out.println("you have a score of: "+ playerHand);
            Thread.sleep(500);
            System.out.println("Do you want another card?");
            tangentbord.nextLine();
            Thread.sleep(500);
            String val2 = tangentbord.nextLine();
            //String val3 = "yes";
            if (val2.equalsIgnoreCase("yes")){
              Thread.sleep(100);
              System.out.println("Ok here is your next card:");
              Thread.sleep(500);
              Myrandom(playerHand);
              Thread.sleep(500);
              AnotherCard();
              
            } else {
              Thread.sleep(500);
              System.out.println("Ok dealers turn!");
              Thread.sleep(1000);
              System.out.println("Dealers cards:");
              Myrandom(playerHand);
              Myrandom(playerHand);
              
            }
          }
          //}
  
          /*
          if (playerHand >21){
            System.out.println("you bust!");
            System.out.println("Dealer wins");
          } else if (playedHand == 21){
            System.out.println("You hit 21!")
            System.out.println("You win 1.5x")
            playerMoney = playerMoney + playerBet*1.5;
          } else if (playerhand < 21){
            System.out.println("Do you want another card?")
  
          }
          */
          

        public static void StartScreen() throws Exception{
          //try (Scanner tangentbord = new Scanner(System.in)) {
            System.out.println(" +----------------------------------+");
            System.out.println(" I                                  I");
            System.out.println(" I       Welcome to blackjack       I");
            System.out.println(" I                                  I");
            System.out.println(" +----------------------------------+");
            Thread.sleep(1000);
            System.out.println("   +---------------------------+");
            System.out.println("   I        Start game?        I");
            System.out.println("   +---------------------------+");
            Thread.sleep(1000);
            System.out.println(" +-------------+    +-------------+");
            System.out.println(" I     YES     I    I     N O     I");
            System.out.println(" +-------------+    +-------------+");
            String val1 = tangentbord.nextLine();
            if (val1.equalsIgnoreCase("yes")){
              Thread.sleep(100);
              int playerMoney = 1000;
              System.out.println("You have "+playerMoney+" money");
              Thread.sleep(250);
              System.out.println("How mutch do you want to bet?");
              int playerBet = tangentbord.nextInt();
              if (playerBet > playerMoney){
                Thread.sleep(500);
                System.out.println("You dont have enough money!");
                Thread.sleep(250);
                System.out.println("Bet again");
              } else if (playerBet <= playerMoney){
                playerMoney = playerMoney-playerBet;
                System.out.println("ok lets start");
                Thread.sleep(1000);
                System.out.println("Here are your cards");
                Thread.sleep(250);
              }
            } else {
                System.out.println("come back later");
                Thread.sleep(1000);
                StartScreen();
            }
        }
        }
      //}

      
      

