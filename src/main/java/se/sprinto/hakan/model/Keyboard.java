package se.sprinto.hakan.model;

public record Keyboard(String title, double price) {

    @Override
    public String toString() {
        return "Keyboard{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}

