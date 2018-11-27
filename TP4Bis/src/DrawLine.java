import java.awt.*;

public class DrawLine implements Command{
    private double x1, x2, y1, y2;

    public DrawLine(double x1, double y1, double x2, double y2, Graphics graph) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        dessiner(graph);
    }

    @Override
    public void dessiner(Graphics graph) {
        graph.setColor(Color.BLACK);
        graph.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
    }
}
