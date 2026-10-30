package se.sprinto.hakan.model;

public record Mouse(String title, int price) {

    @Override
    public String toString() {
        return "Mouse{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
