package by.tc.task01.parser;

import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.List;

public class FindCorrectLineAction {
    private String path;
    private CheckStringAction checkStringAction;
    private PrepareForSearch prepareForSearch;

    public FindCorrectLineAction(String path) {
        this.path = path;
        checkStringAction = new CheckStringAction();
        prepareForSearch = new PrepareForSearch();
    }

    public <E> String findCorrectLine(Criteria<E> criteria) throws IOException {
        File file = new File(path);
        BufferedReader bufferedReader = null;
        List list = prepareForSearch.formateMap(criteria);
        String line;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));

            while ((line = bufferedReader.readLine()) != null) {
                if (checkStringAction.isStringCorrect(line, list)) {
                    return reform(line);
                } else {
                    continue;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }


        return null;
    }

    private String reform(String line) {
        return line.replaceAll(",", "").replaceAll(" :", "").replaceAll(";", "").replaceAll("=", " ");
    }
}