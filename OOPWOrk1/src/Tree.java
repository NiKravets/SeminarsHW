import javax.management.ObjectName;
import javax.management.relation.*;
import java.util.ArrayList;


public class Tree {
    public static void main(String[] args) {
        Person human1 = new Person("Вася Чернов",  40, SexType.MAN);
        Person human2 = new Person("Александр Чернов",  66, SexType.MAN);
        Person human3 = new Person("Любовь Чернова", 63, SexType.WOMAN);
        Person human4 = new Person("Маша Чернова", 15, SexType.WOMAN);
        Person human5 = new Person("Лена Чернова", 35, SexType.WOMAN);
        Person human6 = new Person("Пётр Чернов", 36, SexType.MAN);
        Person human7 = new Person("Степан Чернов", 12, SexType.MAN);
        Person human8 = new Person("Илья Краснов", 65, SexType.MAN);
        Person human9 = new Person("Ольга Краснова", 65, SexType.MAN);
        Person human10 = new Person("Жора Краснов", 45, SexType.MAN);
        Person human11 = new Person("Лера Краснова", 43, SexType.WOMAN);
        Person human12 = new Person("Игорь Краснов", 25, SexType.MAN);
        Person human13 = new Person("Юля Краснова", 18, SexType.WOMAN);
        Person human14 = new Person("Ира Краснова", 20, SexType.WOMAN);
        Person human15 = new Person("Вася Серов", 68, SexType.MAN);
        Person human16 = new Person("Лена Серова", 67, SexType.WOMAN);
        Person human17 = new Person("Дима Серов", 30, SexType.MAN);
        Person human18 = new Person("Лёша Серов", 36, SexType.MAN);
        Person human19 = new Person("Степан Серов", 10, SexType.MAN);
        Person human20 = new Person("Вася Белов", 55, SexType.MAN);
        Person human21 = new Person("Аня Белова", 53, SexType.WOMAN);
        Person human22 = new Person("Олена Серова", 30, SexType.WOMAN);

        GeoTree geoTree = new GeoTree();
        geoTree.appendMarried(human2,human3);
        geoTree.appendMarried(human8,human9);
        geoTree.appendMarried(human15,human16);
        geoTree.appendMarried(human20,human21);
        geoTree.appendParental(human2,human1);
        geoTree.appendParental(human2,human6);
        geoTree.appendParental(human8,human5);
        geoTree.appendParental(human8,human10);
        geoTree.appendParental(human15,human11);
        geoTree.appendParental(human15,human17);
        geoTree.appendParental(human15,human18);
        geoTree.appendParental(human20,human22);
        geoTree.appendParental(human1,human4);
        geoTree.appendParental(human1,human7);
        geoTree.appendParental(human10,human12);
        geoTree.appendParental(human10,human13);
        geoTree.appendParental(human10,human14);
        geoTree.appendParental(human18,human19);

        System.out.println(new Research(geoTree).findRelation(human10,RelationType.PARENT));
        System.out.println(new Research(geoTree).findRelation(human2,RelationType.HUSBAND));
    }

}
