package tasksDZ.task1;

import java.util.ArrayList;
import java.util.List;

public interface IClassForInitializer {
    public static List<String> initializer() {
        List<String> names = new ArrayList<>();
        names.add("Rick Sanchez");
        names.add("Jerry Smith");
        names.add("Birdperson");
        names.add("Morty Smith");
        names.add("Mr. Poopybutthole");
        names.add("Unity");
        names.add("Rick Sanchez");
        names.add("Beth Smith");
        names.add("Morty Smith");
        names.add("Rick Sanchez");
        names.add("Mr. Meeseeks");
        names.add("Rick Sanchez");
        names.add("Tammy Guetermann");
        return names;
    }
}
