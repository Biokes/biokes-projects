package assignmentsAndTasks.src.assignmentsAndTasks.assignmentsAndTasks;

public class GirlFriend {
    private final BoyFriend gai;
    public GirlFriend(BoyFriend gai){
        this.gai = gai;
    }
public String spendMoney(){
        return gai.spend();
}

}
