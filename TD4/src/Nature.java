import javax.swing.*;
import java.awt.*;

public enum Nature {
    BARRE(Color.BLACK),
    ESPACE(Color.WHITE);

    Color color;

    Nature(Color color) {
        this.color = color;
    }

    void setCouleur(Graphics g) {
        g.setColor(color);
    }
}
