import java.util.Scanner;
import java.util.Random;

public class kortforsok {
  static final Scanner tangentbord = new Scanner(System.in);
  static int playerHand = 0;
  static int playerMoney = 1000;
  static int playerBet = 0;
    public static void main(String[] args) throws Exception {
        Start();

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

        public static void PlayerTurn() throws Exception {
          Thread.sleep(500);
          System.out.println("You Have "+playerMoney+" $$");
          Thread.sleep(500);
          System.out.println("How Mutch Do You Want To Bet?");
          Thread.sleep(500);
          while(true){
            try{
              playerBet = tangentbord.nextInt();
              break;
            }catch(Exception e){
              tangentbord.nextLine();
              System.out.println("Input a number");
              Thread.sleep(500);
              System.out.println("You have "+playerMoney+" $");
              
            }
          }
          Thread.sleep(500);
          if(playerBet <= playerMoney){
          System.out.println("Do you want to bet "+playerBet+" $$?");
          tangentbord.nextLine();
          String BettingVal = tangentbord.nextLine();
          if(BettingVal.equalsIgnoreCase("yes")){
            Thread.sleep(500);
            System.out.println("Ok Lets Start!");
            playerMoney = playerMoney-playerBet;
            playerHand=0;
            Myrandom();
            Myrandom();
            AnotherCard();
          } else {
            Thread.sleep(500);
            System.out.println("Ok");
            PlayerTurn();
          }
        } else {
          System.out.println("You dont have enough money");
          PlayerTurn();
        }

        }

        public static void Start() throws Exception {
          System.out.println("          _____                                                                                   _____ \r\n" + //
                             "         ( ___ )---------------------------------------------------------------------------------( ___ )\r\n" + //
                             "          |   |                                                                                   |   | \r\n" + //
                             "          |   |  __     __     ______     __         ______     ______     __    __     ______    |   | \r\n" + //
                             "          |   | /\\ \\  _ \\ \\   /\\  ___\\   /\\ \\       /\\  ___\\   /\\  __ \\   /\\ \"-./  \\   /\\  ___\\   |   | \r\n" + //
                             "          |   | \\ \\ \\/ \".\\ \\  \\ \\  __\\   \\ \\ \\____  \\ \\ \\____  \\ \\ \\/\\ \\  \\ \\ \\-./\\ \\  \\ \\  __\\   |   | \r\n" + //
                             "          |   |  \\ \\__/\".~\\_\\  \\ \\_____\\  \\ \\_____\\  \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\ \\_\\  \\ \\_____\\ |   | \r\n" + //
                             "          |   |   \\/_/   \\/_/   \\/_____/   \\/_____/   \\/_____/   \\/_____/   \\/_/  \\/_/   \\/_____/ |   | \r\n" + //
                             "          |   |                                                                                   |   | \r\n" + //
                             "          |   |                                 ______   ______                                   |   | \r\n" + //
                             "          |   |                                /\\__  _\\ /\\  __ \\                                  |   | \r\n" + //
                             "          |   |                                \\/_/\\ \\/ \\ \\ \\/\\ \\                                 |   | \r\n" + //
                             "          |   |                                   \\ \\_\\  \\ \\_____\\                                |   | \r\n" + //
                             "          |   |                                    \\/_/   \\/_____/                                |   | \r\n" + //
                             "          |___|                                                                                   |___| \r\n" + //
                             "         (_____)---------------------------------------------------------------------------------(_____)");
          Thread.sleep(1750);
          System.out.println("  _____                                                                                                  _____ \r\n" + //
                             " ( ___ )------------------------------------------------------------------------------------------------( ___ )\r\n" + //
                             "  |   |                                                                                                  |   | \r\n" + //
                             "  |   |  ______     __         ______     ______     __  __       __     ______     ______     __  __    |   | \r\n" + //
                             "  |   | /\\  == \\   /\\ \\       /\\  __ \\   /\\  ___\\   /\\ \\/ /      /\\ \\   /\\  __ \\   /\\  ___\\   /\\ \\/ /    |   | \r\n" + //
                             "  |   | \\ \\  __<   \\ \\ \\____  \\ \\  __ \\  \\ \\ \\____  \\ \\  _\"-.   _\\_\\ \\  \\ \\  __ \\  \\ \\ \\____  \\ \\  _\"-.  |   | \r\n" + //
                             "  |   |  \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\  \\ \\_\\ \\_\\ /\\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\  \\ \\_\\ \\_\\ |   | \r\n" + //
                             "  |   |   \\/_____/   \\/_____/   \\/_/\\/_/   \\/_____/   \\/_/\\/_/ \\/_____/   \\/_/\\/_/   \\/_____/   \\/_/\\/_/ |   | \r\n" + //
                             "  |___|                                                                                                  |___| \r\n" + //
                             " (_____)------------------------------------------------------------------------------------------------(_____)");
                             Thread.sleep(1750);
                             System.out.println("                          _____                                                    _____ \r\n" + //
                                 "                         ( ___ )--------------------------------------------------( ___ )\r\n" + //
                                 "                          |   |                                                    |   | \r\n" + //
                                 "                          |   |  ______     ______   ______     ______     ______  |   | \r\n" + //
                                 "                          |   | /\\  ___\\   /\\__  _\\ /\\  __ \\   /\\  == \\   /\\__  _\\ |   | \r\n" + //
                                 "                          |   | \\ \\___  \\  \\/_/\\ \\/ \\ \\  __ \\  \\ \\  __<   \\/_/\\ \\/ |   | \r\n" + //
                                 "                          |   |  \\/\\_____\\    \\ \\_\\  \\ \\_\\ \\_\\  \\ \\_\\ \\_\\    \\ \\_\\ |   | \r\n" + //
                                 "                          |   |   \\/_____/     \\/_/   \\/_/\\/_/   \\/_/ /_/     \\/_/ |   | \r\n" + //
                                 "                          |___|                                                    |___| \r\n" + //
                                 "                         (_____)--------------------------------------------------(_____)");
                                 Thread.sleep(1000);
                                 System.out.println(" _____                                  _____                               _____                        _____ \r\n" + //
                                     "( ___ )--------------------------------( ___ )                             ( ___ )----------------------( ___ )\r\n" + //
                                     " |   |                                  |   |                               |   |                        |   | \r\n" + //
                                     " |   |  __  __     ______     ______    |   |                               |   |  __   __     ______    |   | \r\n" + //
                                     " |   | /\\ \\_\\ \\   /\\  ___\\   /\\  ___\\   |   |                               |   | /\\ \"-.\\ \\   /\\  __ \\   |   | \r\n" + //
                                     " |   | \\ \\____ \\  \\ \\  __\\   \\ \\___  \\  |   |              OR               |   | \\ \\ \\-.  \\  \\ \\ \\/\\ \\  |   | \r\n" + //
                                     " |   |  \\/\\_____\\  \\ \\_____\\  \\/\\_____\\ |   |                               |   |  \\ \\_\\\\\"\\_\\  \\ \\_____\\ |   | \r\n" + //
                                     " |   |   \\/_____/   \\/_____/   \\/_____/ |   |                               |   |   \\/_/ \\/_/   \\/_____/ |   | \r\n" + //
                                     " |___|                                  |___|                               |___|                        |___| \r\n" + //
                                     "(_____)--------------------------------(_____)                             (_____)----------------------(_____)");
       
                                    Thread.sleep(500);
                                    String starta = tangentbord.nextLine();
                                    if (starta.equalsIgnoreCase("yes") || starta.equalsIgnoreCase("y")){
                                      Thread.sleep(500);
                                      System.out.println("Ok");
                                      PlayerTurn();
                                    } else {
                                      Thread.sleep(1000);
                                      System.out.println("Okay come back when you want to play!");
                                      Thread.sleep(500);
                                      Start();
                                    }
                         }


         public static void PlayAgain() throws Exception{
          Thread.sleep(500);
          System.out.println("Do you want to play again?");
          String startaigen = tangentbord.nextLine();
            if (startaigen.equalsIgnoreCase("yes")){
                Thread.sleep(500);
                System.out.println("Ok");
                Thread.sleep(500);
                PlayerTurn();
                } else {
                Thread.sleep(1000);
                System.out.println("Okay come back when you want to play!");
                Thread.sleep(500);
                Leaderboard();
                }
          }

        public static void AnotherCard() throws Exception{
          int playerHand1 = playerHand;
          if (playerHand1 < 22){
            System.out.println("you have a score of: "+ playerHand1);
            Thread.sleep(500);
            System.out.println("Do you want another card?");
            Thread.sleep(500);
            String val2 = tangentbord.nextLine();
            if (val2.equalsIgnoreCase("yes")){
              Thread.sleep(100);
              System.out.println("Ok here is your next card:");
              Thread.sleep(500);
              Myrandom();
              playerHand1=playerHand;
              Thread.sleep(500);
              AnotherCard();
            
            } else {
              playerHand = 0;
              Thread.sleep(500);
              System.out.println("Ok dealers turn!");
              Thread.sleep(1000);
              System.out.println("Dealers cards:");
              Myrandom();
              Thread.sleep(500);
              Myrandom();
              int dealerHand = playerHand;
              if (dealerHand<22){
              for (dealerHand = playerHand; dealerHand <16;){
                Thread.sleep(1000);
                Myrandom();
                dealerHand=playerHand;
              }
              System.out.println("Dealer score is "+dealerHand);
              
               if (dealerHand > 21){
                System.out.println("Dealer Busts!");
                Thread.sleep(500);
                System.out.println("Player wins!");
                playerMoney = playerMoney+playerBet*2;
                System.out.println("money: "+playerMoney);
                PlayAgain();
              } else if (dealerHand == playerHand1){
                  System.out.println("Dealer and player have same score");
                  Thread.sleep(500);
                  System.out.println("You win beting money");
                  playerMoney=playerMoney+playerBet;
                  System.out.println("money: "+playerMoney);
                  PlayAgain();
              } else if (playerHand1 > dealerHand){
                  System.out.println("player wins");
                  playerMoney=playerMoney+playerBet*2;
                  System.out.println("money: "+playerMoney);
                  PlayAgain();
                } else {
                  System.out.println("Dealer wins!");
                  System.out.println("money: "+playerMoney);
                  PlayAgain();
                }
              } 
            }
              } else {
                Thread.sleep(1000);
                System.out.println("Player Busts");
                PlayAgain();
              }
        } 
// leader board som är till när man inte vill spela med
        public static void Leaderboard() throws Exception{
          Thread.sleep(500);
          System.out.println("Good Job!");
          Thread.sleep(500);
          System.out.println("You managed to get "+playerMoney+" $");
          Thread.sleep(500);
          System.out.println("Please Enter Username");
          String Username = tangentbord.nextLine();
          Thread.sleep(500);
          System.out.println("Good Work "+Username+", You Managed To Get "+playerMoney+" $$");
          Thread.sleep(1000);
          System.out.println("If You Want To Cash Out, Please Grade A");

        }
}
//hoppas det här funkar nu