package at.mow.test;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.tests.AnimationTest;

public class MainGame extends BasicGame {

    private int x,y;
    private int width,height;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 100;
        this.width = 50;
        this.height = 70;

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.x++;
        this.height++;
        this.width++;

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, this.width, this.height);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("RandomGame"));
            container.setDisplayMode(1600,1200,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
