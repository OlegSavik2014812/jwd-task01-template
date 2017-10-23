package by.tc.task01.parser;

import java.util.List;

class CheckStringAction {
    boolean isStringCorrect(String line, List<String> list) {
        boolean isRight;
        isRight = isParamsOfStringCorrect(line, list);
        return isRight;
    }

    private boolean isParamsOfStringCorrect(String line, List<String> list) {
        for (String s : list) {
            if (line.contains(s)) {
                continue;
            } else return false;
        }
        return true;
    }
}
