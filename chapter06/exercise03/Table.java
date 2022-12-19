import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {
    private List<Entry<K, V>> entries = new ArrayList<>();

    public void add(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value);
        entries.add(entry);
    }

    public Entry<K, V> get(K key) {
        int index = find(key);
        if (index >= 0) {
            return entries.get(index);
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

    public static void main(String[] args) {
        Table<String, Integer> table = new Table<>();

        for (int i = 0; i < 5; i++) {
            table.add("Str" + i, i);
        }
        System.out.println(table);

        for (int i = 0; i < 5; i++) {
            table.set("Str" + i, i + 1);
        }
        System.out.println(table);

        for (int i = 0; i < 5; i++) {
            table.delete("Str" + i);
        }
        System.out.println(table);
    }
}