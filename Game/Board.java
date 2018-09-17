//Importing this libary so we're able to generate random numbers.
import java.util.Random;

public class Board {

  //Method to generate a random number between 1 and 10.
  public static int randomNumber()
   {
     //Intialize the random class.
     Random rand = new Random();

     // Generate the random number. 10 is the max and 1 is the min.
     int n = rand.nextInt(10) + 1;

     // Returns the random number to the caller.
     return n;
   }

  public static void main(String[] args){

    //Variable used for remembering who is next.
    int turn = 0;

    //Intialize snake and rabbit with the random generated numbers.
    //They both start at random positions on the "board".
    Snake snake = new Snake(randomNumber(), randomNumber());
    Rabbit rabbit = new Rabbit(randomNumber(), randomNumber());

    //Prints the position of the rabbit and the snake.
    rabbit.printPosition();
    snake.printPosition();

    //The while-loop stop the game when the rabbit and the snake have the same x and y position.
    //A while-loop will run over and over until set condition is no longer true.
    while ((rabbit.getYPos() != snake.getYPos()) || (rabbit.getXPos() != snake.getXPos())){

      //Random code found on the internet..
      //Makes the game more enjoyable to watch, using a little delay between the turns.
      //This can be removed to make the game instant.
      try
      {
        Thread.sleep(500);
      }
      catch(InterruptedException ex)
      {
        Thread.currentThread().interrupt();
      }

      //If turn == 0, the rabbit moves. If turn == 1, the snake moves.
      if (turn == 0)
      {

        //Move the rabbit and print the position.
        rabbit.move();
        rabbit.printPosition();

        //If the snake is next to the rabbit, this if-statement will run.
        if ((((rabbit.getYPos() - 1) == snake.getYPos()) || ((rabbit.getYPos() + 1) == snake.getYPos()) || ((rabbit.getYPos()) == snake.getYPos())) && (((rabbit.getXPos() - 1) == snake.getXPos()) || ((rabbit.getXPos() + 1) == snake.getXPos()) || ((rabbit.getXPos()) == snake.getXPos())))
        {
          rabbit.printSentence();
        }

        //Give next move to the snake.
        turn = 1;

      } else
      {
        //Moves the snake. Also sends information about the rabbit's position.
        //This information is used to calculate where to go in the snake class.
        snake.move(rabbit.getXPos(), rabbit.getYPos());
        snake.printPosition();

        //Give next move to the rabbit.
        turn = 0;
      }
    }
    snake.printSentence();
  }
}
