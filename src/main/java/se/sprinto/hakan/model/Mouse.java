package se.sprinto.hakan.model;

public record Mouse(String title, double price) {

    @Override
    public String toString() {
        return "Mouse{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
