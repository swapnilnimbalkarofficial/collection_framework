class VectorExample{
    public static void main(String[] args) {
        java.util.List<String> vector = new java.util.Vector<>();
        vector.add("Dog");
        vector.add("Cat");
        vector.add("Bird");
        vector.add("Cat"); // Duplicates are allowed

        vector.remove("Cat"); // Removes the first occurrence of "Cat"

        for (String animal : vector) {
            System.out.println(animal);
        }
    }
}