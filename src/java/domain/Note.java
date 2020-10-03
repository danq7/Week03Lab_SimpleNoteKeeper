package domain;

import java.io.Serializable;

public class Note implements Serializable {

    private String line1;
    private String line2;

    public Note() {
        line1 = "";
        line2 = "";
    }

    public Note(String lineOne, String lineTwo) {
        this.line1 = lineOne;
        this.line2 = lineTwo;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @Override
    public String toString() {
        return "Note{" + "line1=" + line1 + ", line2=" + line2 + '}';
    }

}
