/**
 * Created by Lawrence Lee on 2016/10/20.
 *
 */
public final class LazySingleton {
    private static LazySingleton uniqueInstance;
    private LazySingleton() {
    }
    public static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }
        return uniqueInstance;
    }
}
