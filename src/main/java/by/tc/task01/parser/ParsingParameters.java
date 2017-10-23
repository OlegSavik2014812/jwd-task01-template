package by.tc.task01.parser;

import java.util.ArrayList;
import java.util.List;

public final class ParsingParameters {
    public static List<String> getParams(String s) {
        String[] strings = s.split(" ");
        List<String> list = new ArrayList<>();
        int i = 2;
        do {
            list.add(strings[i]);
            i = i + 2;
        } while (i < strings.length);
        return list;
    }
}
