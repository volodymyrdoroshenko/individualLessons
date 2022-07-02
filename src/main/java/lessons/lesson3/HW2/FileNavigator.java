package lessons.lesson3.HW2;

import java.util.*;

public class FileNavigator {
    private HashMap<String, ArrayList<FileData>> storage;

    public FileNavigator() {
        this.storage = new HashMap<>();
    }

    public void add(FileData file) {
        ArrayList<FileData> list = storage.get(file.getPath());
        if (list == null) {
            list = new ArrayList<>();
            list.add(file);
            storage.put(file.getPath(), list);
        } else {
            if (!list.contains(file)) list.add(file);
        }
    }

    public ArrayList<FileData> find(String path) {
        return new ArrayList<>(storage.get(path));
    }

    public ArrayList<FileData> filterBySize(int size) {
        ArrayList<FileData> list = new ArrayList<>();
        for (String path : storage.keySet()) {
            for (FileData file : storage.get(path)) {
                if (file.getSize() <= size) {
                    list.add(file);
                }
            }
        }
        return list;
    }

    public void remove(String path) {
        storage.remove(path);
    }

    public ArrayList<FileData> sortBySize() {
        ArrayList<FileData> list = new ArrayList<>();
        for (String path : storage.keySet()) {
            list.addAll(storage.get(path));
        }
        Comparator<FileData> sizeComparator = new FileSizeComparator();
        list.sort(sizeComparator);
        return list;
    }

    public static void print(FileNavigator fileNavigator) {
        for (String path : fileNavigator.storage.keySet()) {
            System.out.println("Path: " + path);
            System.out.println("Files: ");
            for (FileData file : fileNavigator.storage.get(path)) {
                System.out.println(file.getName());
            }
            System.out.println("============================");
        }
    }
}
