class Demo {
    public static void main(String[] args) {

        String name = "Sri Valli";

        String[] words = name.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}