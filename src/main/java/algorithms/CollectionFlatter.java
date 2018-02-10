package algorithms;

import java.util.ArrayList;
import java.util.List;

public class CollectionFlatter {

    public List getFlattenedCollection(List collection) {
        List accumulator = new ArrayList();
        unpackToTempStorage(accumulator, collection);

        return accumulator;
    }

    private void unpackToTempStorage(List storage, Object o) {
        Iterable iterable = (Iterable) o;

        for (Object item : iterable) {
            if (item instanceof Iterable) {
                unpackToTempStorage(storage, item);
            } else {
                storage.add(item);
            }
        }
    }
}
