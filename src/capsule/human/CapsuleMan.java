package capsule.human;

// CapsuleManクラスを定義
public class CapsuleMan {

	// privateで隠蔽化
	private String name;
    private int age;

    public CapsuleMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

 // ageのgetter
    public int getAge() {
        return age;
    }

    // ageのsetter
    public void setAge(int age) {
        this.age = age;
    }

 // nameのgetter
    public String getName() {
        return name;
    }
}
