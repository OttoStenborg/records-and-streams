package se.sprinto.hakan.model;

public record Mouse(String title, int dpi) {

    @Override
    public String toString() {
        return "Mouse{" +
                "title='" + title + '\'' +
                ", int dpi=" + dpi +
                '}';
    }
}
