package com.kodilla.spotbugs;

public class BadCodeExample {
    private String type;

    public static double getPi() {
        return Math.PI;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadCodeExample badCodeExample = (BadCodeExample) o;

        return this.type != null ? this.type.equals(badCodeExample.type) : badCodeExample.type == null;
    }

    public int hashCode() {
        assert false : "hashCode not designed";
        return 42;
    }
}
