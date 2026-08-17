package LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheLinkedHashMap<K,V> extends LinkedHashMap<K,V> {
    private final int capacity;

    LRUCacheLinkedHashMap(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> e) {
        return size() > capacity;
    }
}
