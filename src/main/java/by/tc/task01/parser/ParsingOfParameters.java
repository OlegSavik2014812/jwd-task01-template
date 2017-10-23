package by.tc.task01.parser;

import java.util.ArrayList;
import java.util.List;

public final class ParsingOfParameters {
    public static List<String> getParams(String lineForCreation) {
        String[] massOfArgs = lineForCreation.split(" ");
        List<String> listWithArgs = new ArrayList<>();
        int i = 2;
        do {
            listWithArgs.add(massOfArgs[i]);
            i = i + 2;
        } while (i < massOfArgs.length);
        return listWithArgs;
    }
}
