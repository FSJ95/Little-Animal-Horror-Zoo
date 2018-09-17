//Importing this libary so we're able to generate random numbers.
import java.util.Random;

public class Rabbit {

  private int xPos = 0;
  private int yPos = 0;
  Random rand = new Random();

  public Rabbit()
  {
     this.xPos = 1;
     this.yPos = 1;
  }

  public Rabbit(int xPos, int yPos)
  {
    this.xPos = xPos;
    this.yPos = yPos;
  }

  public void setXPos(int xPos)
  {
     this.xPos = xPos;
  }

  public void setYPos(int yPos)
  {
     this.yPos = yPos;
  }

  public int getXPos()
  {
     return this.xPos;
  }

  public int getYPos()
  {
     return this.yPos;
  }

  public void move()
  {
    if (xPos == 1)
    {
      setXPos(2);
    } else if (xPos == 10)
    {
      setXPos(9);
    } else
    {
      setXPos( xPos + (rand.nextInt(3) + (-1)));
    }


    if (yPos == 1)
    {
      setYPos(2);
    } else if (yPos == 10)
    {
      setYPos(9);
    } else
    {
      setYPos( yPos + (rand.nextInt(3) + (-1)));
    }
  }

  public void printPosition()
  {
     System.out.println("I am the Rabbit, i am now standing on square " + xPos + ", " + yPos + ".");
  }

  public void printSentence()
  {
     System.out.println("Noooo, Please don't eat me!");
  }


}
