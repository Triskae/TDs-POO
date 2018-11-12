import java.awt.*;

public class ChangeColor implements Command{

    Color color;


    public ChangeColor(Color color) {
        this.color = color;
    }



    @Override
    public void dessiner(Graphics graph) {
        graph.setColor(color);
    }
}
