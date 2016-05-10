import java.awt.*;

public class WhiteCell extends Cell
{

    public WhiteCell(int x, int y, int health,int index)
    {
        super(x, y, health, index);
    }

    @Override
    public void produceValues() {

    }

    @Override
    public void draw(Canvas canvas, int position) {
        Graphics g = canvas.getGraphics();
        g.setColor(new Color(0, 0, 0));
        g.fillOval(getX(), getY(), 50, 50);

    }

    public  void decrementHealth(int decreaseBy)
    {
        setHealth(getHealth() - decreaseBy);

    }
    public  void increaseHealth(int increaseBy)
    {
        setHealth(getHealth() + increaseBy);

    }

    public boolean canEnemeyHurt(int enemyX, int enemyY , int ableRadius){
        double hyp = Math.sqrt(Math.pow(Math.abs(getX()-enemyX),2)
                +Math.pow(Math.abs(getY()-enemyY),2));
        if(ableRadius>hyp){
            return false;
        }
        return true;
    }

}