import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Relations> tree = new ArrayList<>();

    public void appendParental(Person parent, Person children) {
        tree.add(new Relations(parent, children, RelationType.PARENT));
        tree.add(new Relations(children, parent, RelationType.CHILD));
    }

    public void appendMarried(Person husband, Person wife){
        tree.add(new Relations(husband, wife, RelationType.HUSBAND));
        tree.add(new Relations(wife, husband, RelationType.WIFE));

    }

    /*�� �������� ��� �������� ��� �� ����� � wife, ��� ��� ����� appendParental ��������� � husband */
    public ArrayList<Relations> getTree() {
        return tree;
    }
}
