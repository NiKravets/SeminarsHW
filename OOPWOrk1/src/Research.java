import java.util.ArrayList;


public class Research {

    ArrayList<Relations> tree;
    public Research(GeoTree geoTree){

        tree = geoTree.getTree();
    }

    public ArrayList<Person> findRelation(Person person, RelationType type){
        ArrayList<Person> result = new ArrayList<>();
        for (Relations relation : tree) {
            if(relation.member1.getFullName().equals(person.getFullName()) && relation.relation == type ){
                result.add(relation.member2);
            }
        }
        return result;
    }



}

