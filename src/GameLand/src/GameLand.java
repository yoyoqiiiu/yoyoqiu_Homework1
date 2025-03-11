//Basic Game Application
// Basic Object, Image, Movement
// Threaded

//*******************************************************************************
//Import Section
//Add Java libraries needed for the game
//import java.awt.Canvas;

//Graphics L
//Basic Game Application
// Basic Object, Image, Movement
// Threaded

//*******************************************************************************
//Import Section
//Add Java libraries needed for the game
//import java.awt.Canvas;

//Graphics Libraries
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.*;
import javax.print.attribute.standard.PrinterMakeAndModel;
import javax.swing.JFrame;
import javax.swing.JPanel;


//*******************************************************************************

public class GameLand implements Runnable {

    //Variable Definition Section
    //Declare the variables used in the program
    //You can set their initial values too
    public Character SushiChan; //step 1: declare
    public Image SushiPic;

    public Character Hamby;
    public Image HambyPic;

    public Character Ramen;
    public  Image RamenPic;

    public Character PacMan;
    public Image PacManPic;

    public Image DonutChanPic;
    public Image backBackgroundPic;

    public Character[] Pinky;
    public Image PinkyPic;

    public double randNum;
    public boolean CharaIsIntersectingPac = false;


    //Sets the width and height of the program window
    final int WIDTH = 1000;
    final int HEIGHT = 700;

    //Declare the variables needed for the graphics
    public JFrame frame;
    public Canvas canvas;
    public JPanel panel;

    public BufferStrategy bufferStrategy;

    // Main method definition
    // This is the code that runs first and automatically
    public static void main(String[] args) {
        GameLand ex = new GameLand();   //creates a new instance of the game
        new Thread(ex).start();                 //creates a threads & starts up the code in the run( ) method
    }


    // This section is the setup portion of the program
    // Initialize your variables and construct your program objects here.
    public GameLand() { // BasicGameApp constructor

        setUpGraphics();

        //variable and objects
        //create (construct) the objects needed for the game
        SushiChan = new Character(100, 100, 1, 1); //step 2: construct
        SushiChan.printInfo();//step 3: use e.g. move or print
        Hamby = new Character(200, 300, 1, 1);
        Hamby.printInfo();
        Ramen = new Character(400, 300, 1, -1);
        Ramen.printInfo();

        PacMan = new Character(700, 30, 1, -1);
        PacMan.printInfo();


        Pinky=new Character[10];
        for (int i=0; i< Pinky.length ; i++){
            int randomX = (int) (Math.random()*800);
            int randomY = (int) (Math.random()*500);
            Pinky[i] = new Character(randomX, randomY, 2, 2);
            Pinky[i].printInfo();
        }



        //creating and constructing images
        SushiPic = Toolkit.getDefaultToolkit().getImage("SushiChan.png");
        PacManPic = Toolkit.getDefaultToolkit().getImage("PacMan.png");
        HambyPic = Toolkit.getDefaultToolkit().getImage("HambyPic.png");
        RamenPic = Toolkit.getDefaultToolkit().getImage("Ramen.png");
        DonutChanPic = Toolkit.getDefaultToolkit().getImage("DonutChan.png");
        backBackgroundPic = Toolkit.getDefaultToolkit().getImage("milky way.jpg");
        PinkyPic = Toolkit.getDefaultToolkit().getImage("PinkyPic.png");
    } // end BasicGameApp constructor


//*******************************************************************************
//User Method Section
//
// put your code to do things here.

    // main thread
    // this is the code that plays the game after you set things up
    public void run() {
        //for the moment we will loop things forever.
        while (true) {
            moveThings();  //move all the game objects
            render();  // paint the graphics
            pause(10); // sleep for 10 ms
        }
    }

    public void moveThings(){
        //call the move() code for each object
        if (SushiChan.isAlive == true){SushiChan.BounceMove();}
        if (Hamby.isAlive == true){Hamby.BounceMove();}
        if (Ramen.isAlive==true){Ramen.BounceMove();}

        for (int i=0; i< Pinky.length ; i++){
        if (Pinky[i].isAlive==true){Pinky[i].BounceMove2();}
        PacMan.BounceMove();}

        checkIntersections();
    }
    public void checkIntersections() {
        //rec has a method called intersects
        //intersects takes in an input of another rec
//        if (SushiChan.rec.intersects(PacMan.rec)) {
//            SushiChan.dy = -SushiChan.dy;
//            SushiChan.dx = -SushiChan.dx;
//            PacMan.dx = -PacMan.dx;
//            PacMan.dy = -PacMan.dy;
//            randNum = (double) (Math.random());
//            if (randNum < 0.3) {
//                System.out.println("OUCHHH!!!");
//            } else if (randNum >= 0.3 && randNum < 0.6) {
//                System.out.println("WATCH WHERE YOU'RE GOING!!!");
//            } else if (randNum >= 0.6) {
//                System.out.println("YOU'RE ON MY WAY!");
//            }
//        }
        for (int i=0; i< Pinky.length ; i++){
        if (Pinky[i].rec.intersects(PacMan.rec) && CharaIsIntersectingPac==false && SushiChan.isAlive==false){
            CharaIsIntersectingPac=true;
            System.out.println("YAY! FOOD!");
            PacMan.height= PacMan.height - 10;
            PacMan.width = PacMan.width - 10;
            SushiChan.isAlive = true;
            SushiChan.xpos= (int) (Math.random()*700);
            SushiChan.ypos= (int) (Math.random()*400);
            Pinky[i].isAlive=false;
        } if (Pinky[i].rec.intersects(PacMan.rec) && CharaIsIntersectingPac==false && Hamby.isAlive==false){
                CharaIsIntersectingPac=true;
                System.out.println("YAY! FOOD!");
                PacMan.height= PacMan.height - 10;
                PacMan.width = PacMan.width - 10;
                Hamby.isAlive = true;
                Hamby.xpos= (int) (Math.random()*700);
                Hamby.ypos= (int) (Math.random()*400);
                Pinky[i].isAlive=false;
            } if (Pinky[i].rec.intersects(PacMan.rec) && CharaIsIntersectingPac==false && Ramen.isAlive==false){
                CharaIsIntersectingPac=true;
                System.out.println("YAY! FOOD!");
                PacMan.height= PacMan.height - 10;
                PacMan.width = PacMan.width - 10;
                Ramen.isAlive = true;
                Ramen.xpos= (int) (Math.random()*700);
                Ramen.ypos= (int) (Math.random()*400);
                Pinky[i].isAlive=false;
            }
        }

        if (SushiChan.rec.intersects(PacMan.rec) && CharaIsIntersectingPac==false&& SushiChan.isAlive){
            CharaIsIntersectingPac=true;
            System.out.println("YUM!");
            PacMan.height = PacMan.height + 10;
            PacMan.width = PacMan.width + 10;
            SushiChan.isAlive = false;
            SushiChan.xpos=-1000;
            PacMan.dx = -PacMan.dx;
            PacMan.dy = -PacMan.dy;
            for (int i=0; i< Pinky.length ; i++){
                Pinky[i].isAlive=true;
            }

//            System.out.println(SushiChan.xpos);
        } if (SushiChan.rec.intersects(PacMan.rec)==false){
            CharaIsIntersectingPac=false;
        }
        if (Hamby.rec.intersects(PacMan.rec) && CharaIsIntersectingPac==false&& Hamby.isAlive){
            CharaIsIntersectingPac=true;
            System.out.println("YUM!");
            PacMan.height = PacMan.height + 10;
            PacMan.width = PacMan.width + 10;
            PacMan.dx = -PacMan.dx;
            PacMan.dy = -PacMan.dy;
            Hamby.isAlive = false;
            Hamby.xpos=-1000;
            for (int i=0; i< Pinky.length ; i++){
                Pinky[i].isAlive=true;
            }
//            System.out.println(SushiChan.xpos);
        } if (Hamby.rec.intersects(PacMan.rec)==false){
            CharaIsIntersectingPac=false;
        }
        if (Ramen.rec.intersects(PacMan.rec) && CharaIsIntersectingPac==false&& Ramen.isAlive){
            CharaIsIntersectingPac=true;
            System.out.println("YUM!");
            PacMan.height = Ramen.height + 10;
            PacMan.width = Ramen.width + 10;
            PacMan.dx = -PacMan.dx;
            PacMan.dy = -PacMan.dy;
            Ramen.isAlive = false;
            Ramen.xpos=-1000;
            for (int i=0; i< Pinky.length ; i++){
                Pinky[i].isAlive=true;
            }
//            System.out.println(SushiChan.xpos);
        } if (Ramen.rec.intersects(PacMan.rec)==false){
            CharaIsIntersectingPac=false;
        }
    }

    //Paints things on the screen using bufferStrategy
    private void render() {
        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, WIDTH, HEIGHT); //these two lines stay here at the top

        //draw the images
        g.drawImage(backBackgroundPic, 0, 0, WIDTH, HEIGHT, null);
//        g.drawImage(DonutChanPic, 0, 0, WIDTH, HEIGHT, null);
        if (SushiChan.isAlive == true){g.drawImage(SushiPic, SushiChan.xpos, SushiChan.ypos, SushiChan.width+50,SushiChan.height, null);}
        if (PacMan.isAlive == true){g.drawImage(PacManPic, PacMan.xpos, PacMan.ypos, PacMan.width+50, PacMan.height, null);}
        if (Hamby.isAlive == true){g.drawImage(HambyPic, Hamby.xpos, Hamby.ypos, Hamby.width+50, Hamby.height, null);}
        if (Ramen.isAlive == true){g.drawImage(RamenPic, Ramen.xpos, Ramen.ypos, Ramen.width, Ramen.height-20, null);}
        for (int i=0; i< Pinky.length ; i++){
        if (Pinky[i].isAlive){g.drawImage(PinkyPic, Pinky[i].xpos, Pinky[i].ypos, Pinky[i].width, Pinky[i].height, null);}}
        //the two lines of code below need to stay here at the bottom
        g.dispose();
        bufferStrategy.show();
    }

    //Pauses or sleeps the computer for the amount specified in milliseconds
    public void pause(int time ) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }

    //Graphics setup method
    private void setUpGraphics() {
        frame = new JFrame("Application Template");   //Create the program window or frame.  Names it.

        panel = (JPanel) frame.getContentPane();  //sets up a JPanel which is what goes in the frame
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));  //sizes the JPanel
        panel.setLayout(null);   //set the layout

        // creates a canvas which is a blank rectangular area of the screen onto which the application can draw
        // and trap input events (Mouse and Keyboard events)
        canvas = new Canvas();
        canvas.setBounds(0, 0, WIDTH, HEIGHT);
        canvas.setIgnoreRepaint(true);

        panel.add(canvas);  // adds the canvas to the panel.

        // frame operations
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //makes the frame close and exit nicely
        frame.pack();  //adjusts the frame and its contents so the sizes are at their default or larger
        frame.setResizable(false);   //makes it so the frame cannot be resized
        frame.setVisible(true);      //IMPORTANT!!!  if the frame is not set to visible it will not appear on the screen!

        // sets up things so the screen displays images nicely.
        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
        System.out.println("DONE graphic setup");
    }

}

