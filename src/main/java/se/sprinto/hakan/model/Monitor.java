package se.sprinto.hakan.model;

public record Monitor(String title, double price) {

    @Override
    public String toString() {
        return "Monitor{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
