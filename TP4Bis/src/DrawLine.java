import java.awt.*;

public class DrawLine implements Command{
    private int x1, x2, y1, y2;

    public DrawLine(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void dessiner(Graphics graph) {
        graph.drawLine(x1, y1, x2, y2);
    }
}
