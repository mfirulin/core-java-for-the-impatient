import java.util.ArrayList;

public class Network {
    public class Member {
        private String name;
        private ArrayList<Member> friends;
        
        public Member(String name) {
            this.name = name;
            friends = new ArrayList<>();
        }
        
        public void leave() {
            members.remove(this);
        }
    }
    
    private ArrayList<Member> members = new ArrayList<>();
    
    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }
    
    public void printMembers() {
        for (Member m : members)
            System.out.print(m.name + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Network myFace = new Network();
        Network.Member fred = myFace.enroll("Fred");
        Network.Member helen = myFace.enroll("Helen");
        myFace.printMembers();
        fred.leave();
        myFace.printMembers();
    }
}
