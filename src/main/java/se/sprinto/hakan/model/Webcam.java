package se.sprinto.hakan.model;

public record Webcam(String title, double price) {

    @Override
    public String toString() {
        return "Webcam{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
