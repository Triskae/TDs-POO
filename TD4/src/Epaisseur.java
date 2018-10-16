import java.awt.*;

public enum  Epaisseur {
    LARGE(4),
    ETROIT(2);

    int width;


    Epaisseur(int i) {
        this.width = i;
    }

    public void drawSymbole(Graphics g, int x, int y) {
        g.drawRect(x, y, width, 100);
        g.fillRect(x, y, width, 100);
    }
}
