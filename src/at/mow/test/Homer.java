package WinterGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.awt.*;

public class Homer implements Actor{


    @Override
    public void update(GameContainer gameContainer, int delta) {

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawString("I am Homer", 50,50);

    }


}
