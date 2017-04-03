package module9.offline.filter;


/**
 * Created by citsym on 30.03.17.
 */
@FunctionalInterface
public interface Filter<T> {

    boolean apply(T type);

}
