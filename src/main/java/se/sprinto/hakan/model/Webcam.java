package se.sprinto.hakan.model;

public record Webcam(String title, int megapixels) {

    @Override
    public String toString() {
        return "Webcam{" +
                "title='" + title + '\'' +
                ", price=" + megapixels +
                '}';
    }
}
