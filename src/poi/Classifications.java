package poi;

import tomtom.Names;

import java.util.ArrayList;

public class Classifications {
    private String code;
    private ArrayList<Names> names;

    public Classifications(String code, ArrayList<Names> names) {
        this.code = code;
        this.names = names;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Names> getNames() {
        return names;
    }

    public void setNames(ArrayList<Names> names) {
        this.names = names;
    }
}
