package ui;
import java.util.ArrayList;
import java.util.List;
import logiikka.Noppa;
import java.util.Collection;
/**
 *
 * @author antti
 */
public class PiirraNopat {
    
    private String alkunopat;
    
    public PiirraNopat() {
        this.alkunopat = "┌───────┐ ┌───────┐ ┌───────┐ ┌───────┐ ┌───────┐\n" + 
                         "│       │ │       │ │       │ │       │ │       │\n" +
                         "│   Y   │ │   A   │ │   T   │ │   Z   │ │   Y   │\n" + 
                         "│       │ │       │ │       │ │       │ │       │\n" +
                         "└───────┘ └───────┘ └───────┘ └───────┘ └───────┘\n";
    }
   
    public String alkuNopat() {
        return alkunopat;
    }

    public String tulostaNopat(Collection<Noppa> nop) {
        StringBuilder sb = new StringBuilder();
        sb.append("┌───────┐ ┌───────┐ ┌───────┐ ┌───────┐ ┌───────┐");
        sb.append("\n");
        for (Noppa n : nop) {
            int nLuku = n.getLuku();
            if (nLuku == 6 || nLuku == 5 || nLuku == 4) {
                sb.append("│ ●   ● │ ");
            } else if (nLuku == 3 || nLuku == 2) {
                sb.append("│ ●     │ ");
            } else {
                sb.append("│       │ ");
            }
        }
        sb.append("\n");
        for (Noppa n : nop) {
            int nLuku = n.getLuku();
            if (nLuku == 6) {
                sb.append("│ ●   ● │ ");
            } else if (nLuku == 1 || nLuku == 3 || nLuku == 5) {
                sb.append("│   ●   │ ");
            } else {
                sb.append("│       │ ");
            }
        }
        sb.append("\n");
        for (Noppa n : nop) {
            int nLuku = n.getLuku();
            if (nLuku == 6 || nLuku == 5 || nLuku == 4) {
                sb.append("│ ●   ● │ ");
            } else if (nLuku == 3 || nLuku == 2) {
                sb.append("│     ● │ ");
            } else {
                sb.append("│       │ ");
            }
        }
        sb.append("\n");
        sb.append("└───────┘ └───────┘ └───────┘ └───────┘ └───────┘");
        sb.append("\n");
        return sb.toString();
    }
}