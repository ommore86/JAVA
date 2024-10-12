import java.util.Random;
import java.util.Scanner;

class GamePlay
{

    void gameReset(int overs, int wicketsPlayer1, int runsPlayer1,int wicketsPlayer2,int runsPlayer2)
    {
        this.overs = overs;
        this.wicketsPlayer1 = wicketsPlayer1;
        this.runsPlayer1 = runsPlayer1;
        this.wicketsPlayer2 = wicketsPlayer2;
        this.runsPlayer2= runsPlayer2;
    }

    int overs;
    int wicketsPlayer1;
    int runsPlayer1;
    int wicketsPlayer2;
    int runsPlayer2;

    void gamePlay()
    {
        int balls1 = overs*6, balls2 = overs*6, runs;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();


        do
        {
            System.out.println("\nPlayer 1 Batting, Player 2 Bowling\n"
                    +"Get Ready, Press '5' to HIT STROKE\n"
                    +"Press '9' to check SCORE\n");
            switch(input.nextInt())
            {
                case 5:
                {
                    balls1--;
                    runs = rand.nextInt(8);
                    if(runs==7)
                    {System.out.println("Oops, OUT");
                        wicketsPlayer1--;}
                    else if (runs==4)
                    { System.out.println(runs+" runs\nStraight 4 RUNS, HURRAY BOUNDARY!!!\n");
                        runsPlayer1=runsPlayer1+runs;
                    }

                    else if(runs == 6)
                    { System.out.println(runs+" runs\nIt's a SIX!!!, HURRAY!!!\n");
                        runsPlayer1=runsPlayer1+runs;
                    }
                    else
                    { System.out.println(runs+" runs");
                        runsPlayer1=runsPlayer1+runs;
                    }
                    break;
                }
                case 9 :
                {
                    System.out.println("\nPlayer 1: SCORE \n");
                    scoreBoard(runsPlayer1,3-wicketsPlayer1,12-balls1);
                    break;
                }
                default:  System.out.println("HIT the VALID Key!!!");
            }

        }
        while((wicketsPlayer1>0 && balls1>0));

        System.out.println("\nPlayer 1: SCORE \n");
        scoreBoard(runsPlayer1,3-wicketsPlayer1,12-balls1);
        System.out.println("\nPlayer 2 Batting, get Ready!!!\n");



        do
        {
            System.out.println("\nPlayer 2 Batting, Player 1 Bowling\n"
                    +"Get Ready, Press '5' to HIT STROKE\n"
                    +"Press '9' to check SCORE\n"
                    +"Press '7' to check TARGET to chase\n");
            switch(input.nextInt())
            {
                case 5:
                {
                    balls2--;
                    runs = rand.nextInt(8);
                    if(runs==7)
                    {System.out.println("Oops, OUT");
                        wicketsPlayer2--;}
                    else if (runs==4)
                    { System.out.println(runs+" runs\nStraight 4 RUNS, HURRAY BOUNDARY!!!\n");
                        runsPlayer2=runsPlayer2+runs;
                    }

                    else if(runs == 6)
                    { System.out.println(runs+" runs\nIt's a SIX!!!, HURRAY!!!\n");
                        runsPlayer2=runsPlayer2+runs;
                    }
                    else
                    { System.out.println(runs+" runs");
                        runsPlayer2=runsPlayer2+runs;
                    }
                    break;
                }
                case 9 :
                {
                    System.out.println("\nPlayer 2: SCORE \n");
                    scoreBoard(runsPlayer2, wicketsPlayer2,balls2);
                }
                case 7: {
                    System.out.println("\nScore: "+runsPlayer2+"-"+(3-wicketsPlayer2)+"\nNeed "+(1+(runsPlayer1-runsPlayer2))+" runs in "+(balls2)+ " balls to WIN\n");
                    break;}

                default:  System.out.println("HIT the VALID Key!!!");
            }

        }
        while((wicketsPlayer2>0 && balls2>0 && runsPlayer1>runsPlayer2));

        System.out.println("\nPlayer 2: SCORE \n");
        scoreBoard(runsPlayer2, wicketsPlayer2, balls2);

        winStatus();
    }

    void scoreBoard(int runs, int wickets, int overs)
    {
        System.out.println("Score is:\n"
                +"Runs: "+runs+"\n"
                +"Wickets: "+wickets+"\n"
                +"Overs: "+(overs/6)+"."+(overs%6)+"\n");
    }

    void winStatus()
    {
        if (runsPlayer1 > runsPlayer2 )
        {
            System.out.println("\nPlayer 1 wins by "+ (runsPlayer1 - runsPlayer2)+" runs\n" );
        }
        else if (runsPlayer2 > runsPlayer1 )
        {
            System.out.println("\nPlayer 2 wins by "+ (runsPlayer2 - runsPlayer1)+" runs\n" );
        }
        else if (runsPlayer1 == runsPlayer2 )
        {
            System.out.println("\n It's a DRAW\n" );
        }
    }

    void gameRules()
    {
        System.out.println("Player 1 is going to BAT first\n"
                +"Match will be of "+overs+" overs\n"
                +"Each team will have "+ wicketsPlayer1+" wickets to play\n"
                +"Follow the instructions further along while playing game\n"
                + "CHEERS!!!\n");
    }
}

class CricketGameV2 {

    public static void main(String[] args) {

        int userInput;

        Scanner input = new Scanner(System.in);
        GamePlay game = new GamePlay();

        do
        {
            System.out.println("Let's play CRICKET!!! \npress '2' for Instructions, '1' to PLAY and '0' to QUIT\n");

            userInput = input.nextInt();
            switch(userInput)
            {
                case 0: break;

                case 1:
                {
                    game.gameReset(10,10,0,10,0);
                    game.gamePlay();
                    break;}
                case 2:
                {
                    game.gameReset(10,10,0,10,0);
                    game.gameRules();
                    break;
                }
                default:  System.out.println("HIT the VALID Key!!!");
            }
        }
        while(userInput != 0);
        System.out.println("EXIT Successfully");
    }
}