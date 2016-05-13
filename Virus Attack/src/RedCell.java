
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class RedCell extends Cell
{

    public RedCell(int x, int y, int health, int index)
    {
        super(x, y, health, index);
    }

    public  void decrementHealth(int decreaseBy)
    {
        setHealth(getHealth() - decreaseBy);

    }
    public  void increaseHealth(int increaseBy)
    {
        setHealth(getHealth() + increaseBy);

    }

    @Override
    public void produceValues()
    {
        // TODO Auto-generated method stub

    }
    public void draw( Canvas canvas, int position )
    {
        Graphics g = canvas.getGraphics();
        g.setColor( new Color( 255, 0, 0 ) );
        g.fillOval( getX(), getY(), 50, 50 );
    }

    @Override
    public boolean canEnemyHurt( int enemyX, int enemyY, int ableRadius )
    {
        // TODO Auto-generated method stub
        return false;
    }
    public void updateViruses( VirusGroup group )
    {
        // TODO Auto-generated method stub
        for ( int i = 0; i < group.size(); i++ )
        {
            if (getDistance( group.getVirus( i ) ) <= group.getVirus(i).getAttackRadius())
            {
                setHealth( getHealth() - 1 );
                if (!getViruses().contains(group.getVirus( i )))
                {
                    addVirus(group.getVirus( i ));
                }

            }
        }

    }

}