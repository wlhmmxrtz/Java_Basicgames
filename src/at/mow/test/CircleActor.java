package WinterGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor{
    private double x,y;

    public CircleActor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gameContainer, int delta){
        this.y += 0.3;
        if(this.y > 600){
            this.y = -10;
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval((float)this.x,(int)this.y,20,20);
    }


}
