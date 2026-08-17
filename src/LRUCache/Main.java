package LRUCache;

public class Main {
    public static void main(String[] args) {
        LRUCacheLinkedHashMap<Integer, String> lru = new LRUCacheLinkedHashMap<>(3);
        lru.put(1,"A");
        lru.put(2,"B");
        lru.put(3,"C");
        lru.get(1);
        lru.put(4, "D");
        System.out.println(lru);


        // My practice LRU cache
        LRUCache<String, Integer> lruCache = new LRUCache<String, Integer>(3);
        lruCache.put("A", 1);
        lruCache.put("B", 2);
        lruCache.put("C", 3);
        lruCache.get("A");
        lruCache.put("D",4);
        System.out.println(lruCache);
    }
}
