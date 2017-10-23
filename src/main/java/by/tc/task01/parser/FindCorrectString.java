package by.tc.task01.parser;

import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.List;

public class FindCorrectString {
    private String path;
    private CheckString checkString;
    private PrepareForSearch prepareForSearch;

    public FindCorrectString(String path) {
        this.path = path;
        checkString = new CheckString();
        prepareForSearch = new PrepareForSearch();
    }

    public <E> String findCorrectString(Criteria<E> criteria) throws IOException {
        File file = new File(path);
        BufferedReader bufferedReader = null;
        List list = prepareForSearch.formateMap(criteria);
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                if (checkString.isStringCorrect(line, list)) {
                    return reform(line);
                } else {
                    continue;
                }
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Bad File "+path);
        } finally {
            bufferedReader.close();
        }
        return null;
    }

    private String reform(String line) {
        return line.replaceAll(",", "")
                .replaceAll(" :", "")
                .replaceAll(";", "")
                .replaceAll("=", " ");
    }
}
