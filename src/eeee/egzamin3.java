package eeee;

import java.io.File;
import java.util.ArrayList;

public class egzamin3 {
    public static String[] directoryList(String path, String extension){
        ArrayList<String>arrayList= new ArrayList<>();

        File f = new File(path);
        return f.list((dir,name) -> !name.endsWith(extension.toUpperCase()));
    }
}
