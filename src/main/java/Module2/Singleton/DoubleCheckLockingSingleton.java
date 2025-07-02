package Module2.Singleton;

public class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton() {}

    public static DoubleCheckLockingSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                // Double-check locking
                if(instance == null) {
                    // This block is only executed once
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }

}

class Client3 {
    public static void main(String[] args) {
        DoubleCheckLockingSingleton s1 = DoubleCheckLockingSingleton.getInstance();
        DoubleCheckLockingSingleton s2 = DoubleCheckLockingSingleton.getInstance();

        System.out.println(s1 == s2);  // true
    }
}