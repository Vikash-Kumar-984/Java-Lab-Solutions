import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*<applet code= "BouncingBall.class" height=900 width=900>
</applet>*/

class Balls
{
        int x,y,radius,dx,dy;
        Color BallColor;

        public Balls(int x,int y,int radius,int dx,int dy,Color bColor)
        {
                this.x=x;
                this.y=y;
                this.radius=radius;
                this.dx=dx;
                this.dy=dy;
                BallColor=bColor;
        }
}
 
public class BouncingBall extends Applet implements Runnable

{
        Balls redBall;
 
        public void init()
        {
                redBall=new Balls(250,80,50,2,4,Color.red);
                Thread t=new Thread(this);
                t.start();
        }

        public void paint(Graphics g)
        {
                g.setColor(redBall.BallColor);
                setBackground(Color.pink);
                //g.setcolor(redBall.BallColor);
                g.fillOval(redBall.x, redBall.y,
                redBall.radius,redBall.radius);
                g.drawLine(150,400,50,500);
                g.drawLine(150,400,450,400);
                g.drawLine(50,500,350,500);
                g.drawLine(450,400,350,500);
                g.drawRect(50,500,20,100);
                g.drawRect(330,500,20,100);
                g.drawLine(450,400,450,500);
                g.drawLine(430,500,450,500);
                g.drawLine(430,500,430,420);
        }
 
        public void run()
        {

        while(true)
        {

                try
                {
                        displacementOperation(redBall);
                        Thread.sleep(20);
                        repaint();
                }
 

        catch(Exception e){}
        }
        }

        public void displacementOperation(Balls balls)
        {
                if(balls.y >= 400 || balls.y <= 0)
        {
                balls.dy=-balls.dy;
        }
        balls.y=balls.y+balls.dy;
        }
}



