/**
 * @author Ian Gumilang
 */
public class ChallengeScore
{
    public static void main(String[] args)
    {
        String playerName = "ian";

        int position = calculateHighScorePosition(1500);

        displayHighScorePosition(playerName, position);

        position = calculateHighScorePosition(900);

        displayHighScorePosition(playerName, position);

        position = calculateHighScorePosition(400);

        displayHighScorePosition(playerName, position);

        position = calculateHighScorePosition(50);

        displayHighScorePosition(playerName, position);
    }

    public static void displayHighScorePosition(String playerName, int position)
    {
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        int highScorePosition = 4;

        if(playerScore > 1000)
        {
            highScorePosition = 1;
        }
        else if(playerScore < 1000 && playerScore > 500)
        {
            highScorePosition = 2;
        }
        else if(playerScore < 500 && playerScore > 100)
        {
            highScorePosition = 3;
        }

        return highScorePosition;
    }
}
