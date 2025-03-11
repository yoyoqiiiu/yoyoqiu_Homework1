import java.awt.*;

public class Character {
    //declare variables
    public int xpos;
    public int ypos;
    public int dx; //dx is the speed in the x direction
    public int dy; //dy is the speed in the y direction
    public int width;
    public int height;
    boolean isAlive;
    public Rectangle rec;
    public Image pic;

    //constructor
    public Character(int pXpos, int pYpos, int pDx, int pDy){
    xpos = pXpos;
    ypos = pYpos;
    dx = pDx;
    dy = pDy;
    width = 60;
    height = 80;
    isAlive = true;
    rec = new Rectangle(xpos, ypos, width, height);
    }

    //printInfo
    //do this now
public void printInfo(){
    System.out.println("X position: " + xpos);
    System.out.println("Y position: " + ypos);
    System.out.println("X speed: " + dx);
    System.out.println("Y speed: " + dy);
    System.out.println("Width: " + width);
    System.out.println("Height: " + height);
    System.out.println("Is your Hero alive? " + isAlive);

}
//public void RoundMove(){
//    if (xpos>820 || xpos < 0){//right side && left side
//        dx=(-1)*dx;
//    }if (ypos>400 || ypos < 0){
//        dy=(-1)*dy;
//    }
//
//    for (int x = 1; x < 820; x = x + 15){
//        xpos = xpos + x*dx;
//    }
//    for (int y = 1; y < 400; y = y + 4){
//        ypos = ypos + y*dx;
//    }
//}

public void BounceMove(){
        if (xpos>750 || xpos < 0){//right side && left side
            dx=(-1)*dx;
        }if (ypos>400 || ypos < 0){
            dy=(-1)*dy;
        }

        xpos = xpos + 1*dx;
        ypos = ypos + 1*dy;
    rec = new Rectangle(xpos, ypos, width, height);
}
    public void BounceMove2(){
        if (xpos>750 || xpos < 0){//right side && left side
            dx=(-1)*dx;
        }if (ypos>400 || ypos < 0){
            dy=(-1)*dy;
        }

        xpos = xpos + 2*dx;
        ypos = ypos + 2*dy;
        rec = new Rectangle(xpos, ypos, width, height);
    }

public void WrapMove(){
        if (xpos>1000){
            xpos = -150;
        } if (ypos<-200){
            ypos = 750;
        } if (xpos<-150){
            xpos = 1000;
        } if (ypos>750){
            ypos=-100;
        }
        xpos = xpos + 3*dx;
        ypos = ypos + 3*dy;
    rec = new Rectangle(xpos, ypos, width, height);
}
}
