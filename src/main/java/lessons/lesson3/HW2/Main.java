package lessons.lesson3.HW2;

public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        FileData file1 = new FileData("java.class", 456_789, "src/main/lesson1");
        FileData file2 = new FileData("kotlin.class", 32_789, "src/main/lesson2");
        FileData file3 = new FileData("python.class", 8_956_789, "src/main/lesson3");
        FileData file4 = new FileData("pascal.class", 1_956_789, "src/main/lesson3");
        fileNavigator.add(file1);
        fileNavigator.add(file2);
        fileNavigator.add(file3);
        fileNavigator.add(file4);

        FileNavigator.print(fileNavigator);
        fileNavigator.find("src/main/lesson3");
        fileNavigator.filterBySize(2_000_000);
        fileNavigator.remove("src/main/lesson3");
        fileNavigator.sortBySize();
    }
}
