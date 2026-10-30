package se.sprinto.hakan.model;

public record Headset(String title, int price) {

    @Override
    public String toString() {
        return "Headset{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
