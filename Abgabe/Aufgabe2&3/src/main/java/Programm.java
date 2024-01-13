import java.util.List;

public class Programm {

    private List<Befehl> list;

    public Programm(List<Befehl> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Befehl b:list) {
            builder.append(b.toString());
        }
        return builder.toString();
    }

    public void accept(ProgVisitor visitor) {
        for (Befehl b:list) {
            visitor.visitBefehl(b);
        }
    }
}
