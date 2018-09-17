//Importing this libary so we're able to generate random numbers.
import java.util.Random;

public class Snake {

  private int xPos = 0;
  private int yPos = 0;
  Random rand = new Random();

  public Snake()
  {
     this.xPos = 10;
     this.yPos = 10;
  }

  public Snake(int xPos, int yPos)
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

  public void move(int rabbitX, int rabbitY)
  {
    if (rabbitX > this.xPos)
    {
      this.xPos = this.xPos + 1;
    } else if (rabbitX == this.xPos)
    {
      this.xPos = this.xPos;
    } else
    {
      this.xPos = this.xPos - 1;
    }


    if (rabbitY > this.yPos)
    {
      this.yPos = this.yPos + 1;
    } else if (rabbitY == this.yPos)
    {
      this.yPos = this.yPos;
    }else
    {
      this.yPos = this.yPos - 1;
    }
  }

  public void printPosition(){
     System.out.println("I am the Snake, i am now standing on square " + xPos + ", " + yPos + ".");
  }
}
