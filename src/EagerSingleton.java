/**
 * Created by Lawrence Lee on 2016/10/20.
 *
 */
public final class EagerSingleton {
    private static EagerSingleton uniqueInstance = new EagerSingleton();
    private EagerSingleton() {
    }
    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }
}
