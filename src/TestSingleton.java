/**
 * Created by Lawrence Lee on 2016/10/20.
 *
 */

public class TestSingleton {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton_copy = EagerSingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton_copy = LazySingleton.getInstance();
        System.out.println(eagerSingleton == eagerSingleton_copy);
        System.out.println(lazySingleton == lazySingleton_copy);
    }
}
