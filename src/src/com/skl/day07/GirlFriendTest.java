package src.com.skl.day07;

/**
 * @program: case_skills_practice
 * @ClassName: GirlFriend
 * @author: skl
 * @create: 2024-06-19 15:10
 */
public class GirlFriendTest {
    public static void main(String[] args) {
//        GirlFriend gf1 = new GirlFriend();

    }
}
class GirlFriend{
    private GirlFriend(){
    }
    //2、
    private static GirlFriend instance=null;

    public static GirlFriend getInstance() {
        if(instance==null){
            instance = new GirlFriend();
        }
        return instance;
    }

    public void setInstance(GirlFriend instance) {
        this.instance = instance;
    }
}