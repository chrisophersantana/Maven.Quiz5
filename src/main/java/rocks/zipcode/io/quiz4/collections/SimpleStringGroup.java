package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup {
    List<String> str;

    public SimpleStringGroup() {
        str = new ArrayList<>();

        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return null;
    }

    public void insert(String string) {
        str.add(string);
    }

    public Boolean has(String string) {

        if (str.contains(string)) {
            return true;
        } else {

            return false;
        }
    }

    public String fetch(int indexOfValue) {
        return str.get(indexOfValue);
    }

    public void delete(String string) {
        str.remove(string);
    }

    public void clear() {
        str.clear();
    }
}
