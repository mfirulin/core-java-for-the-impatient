import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {

    private static class Entry<K, V> {
        private K key;
        private V value;
    
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    
        public K getKey() {
            return key;
        }
    
        public V getValue() {
            return value;
        }
    
        public void setValue(V value) {
            this.value = value;
        }
        
        public String toString() {
            return "[" + key + ":" + value + "]";
        }
    }

    private List<Entry<K, V>> entries = new ArrayList<>();

    public void add(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value);
        entries.add(entry);
    }

    public V get(K key) {
        int index = find(key);
        if (index >= 0) {
            return entries.get(index).getValue();
        }
        return null;
    }

    public void set(K key, V value) {
        int index = find(key);
        if (index >= 0) {
            Entry<K, V> entry = entries.get(index);
            entry.setValue(value);
        }
    }

    public void delete(K key) {
        int index = find(key);
        if (index >= 0) {
            entries.remove(index);
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (Entry<K, V> entry : entries) {
            builder.append(entry.toString());
            builder.append(",");
        }
        if (!entries.isEmpty()) {
            builder.deleteCharAt(builder.length() - 1);
        }
        builder.append("]");
        return builder.toString();
    }

    private int find(K key) {
        for (int i = 0; i < entries.size(); i++) {
            Entry<K, V> entry = entries.get(i);
            if (entry.getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }
}