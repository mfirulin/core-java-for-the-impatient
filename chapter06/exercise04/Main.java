public class Main {

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

        Integer value = table.get("Str1");
        System.out.println(value);

        for (int i = 0; i < 5; i++) {
            table.delete("Str" + i);
        }
        System.out.println(table);
    }
}
