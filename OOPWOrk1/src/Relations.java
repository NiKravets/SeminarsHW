public class Relations {
    Person member1;
    Person member2;
    RelationType relation;

    public Relations(Person member1, Person member2, RelationType relation) {
        this.member1 = member1;
        this.member2 = member2;
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "Relations{" +
                "member1=" + member1 +
                ", member2=" + member2 +
                ", relation=" + relation +
                '}';
    }
}
