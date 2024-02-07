import java.util.Scanner;
import java.util.Random;

public class kortforsok {
  static final Scanner tangentbord = new Scanner(System.in);
  static int playerHand = 0;
  static int playerMoney = 1000;
  static int playerBet = 0;
  static int startscreen = 1;
    //public static int playedHand = 0;
    public static void main(String[] args) throws Exception {
      while (startscreen == 1)
      {
        StartScreen();
      }
        Myrandom();
        Thread.sleep(500);
        Myrandom();
        Thread.sleep(500);
        AnotherCard();
        Thread.sleep(500);
      }

        static void Myrandom(){
          String[] color = {"hearts", "spades","clover","diamonds"};
          String[] value = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
          Random kort = new Random();
          int slump = kort.nextInt(13);
          int randomNum2 = (int)(Math.random()*4);
          String kort1 = value[slump];
          System.out.println(value[slump]+" "+color[randomNum2]);
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
        }

        public static void AnotherCard() throws Exception{
          int playerHand1 = playerHand;
            System.out.println("you have a score of: "+ playerHand1);
            Thread.sleep(500);
            if (playerHand1 > 21){
              System.out.println("You Bust!");
              Thread.sleep(1000);
              System.out.println("Try again next time!");
              Thread.sleep(1000);
            } else {
            System.out.println("Do you want another card?");
            tangentbord.nextLine();
            Thread.sleep(500);
            String val2 = tangentbord.nextLine();
            if (val2.equalsIgnoreCase("yes")){
              Thread.sleep(100);
              System.out.println("Ok here is your next card:");
              Thread.sleep(500);
              Myrandom();
              Thread.sleep(500);
              AnotherCard();
              
            } else {
              playerHand = 0;
              Thread.sleep(500);
              System.out.println("Ok dealers turn!");
              Thread.sleep(1000);
              System.out.println("Dealers cards:");
              Myrandom();
              Myrandom();
              int dealerHand = playerHand;
              System.out.println("Dealer score is "+dealerHand);
              if (dealerHand < 16){
                Myrandom();
                 dealerHand=playerHand+0;
                System.out.println("Dealer score is "+dealerHand);
              } else if (dealerHand > 21){
                System.out.println("Dealer Busts!");
                Thread.sleep(500);
                System.out.println("Player wins!");
                playerMoney = playerMoney+playerBet*2;
                System.out.println("money: "+playerMoney);
              } else {
                if (dealerHand == playerHand1){
                  System.out.println("Dealer and player have same score");
                  Thread.sleep(500);
                  System.out.println("You win beting money");
                  playerMoney=playerMoney+playerBet;
                  System.out.println("money: "+playerMoney);
              } else if (playerHand1 > dealerHand){
                  System.out.println("player wins");
                  playerMoney=playerMoney+playerBet*2;
                  System.out.println("money: "+playerMoney);
                } else {
                  System.out.println("Dealer wins!");
                  System.out.println("money: "+playerMoney);
                }
              }
            }
          }
        }
         

        public static void StartScreen() throws Exception{
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
            System.out.println(" +-------------+      +------------+");
            System.out.println(" I     YES     I  or  I     NO     I");
            System.out.println(" +-------------+      +------------+");
            String val1 = tangentbord.nextLine();
            if (val1.equalsIgnoreCase("yes")){
              Thread.sleep(100);
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
                System.out.println(playerBet);
                Thread.sleep(1000);
                System.out.println("Here are your cards");
                startscreen = 0;
                Thread.sleep(250);
              }
            } else {
                System.out.println("come back later");
                Thread.sleep(1000);
                StartScreen();
            }
        }
        }