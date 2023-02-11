package homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String title;
    private String genre;
    private int price;
    private double size;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Product(String title, String genre, int price, double size) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Product game1 = new Product("God of War", "action-adventure", 290, 54.3);
        Product game2 = new Product("God of War: Ragnarok", "action-adventure", 310, 59.7);
        Product game3 = new Product("Hogwarts Legacy", "action role-playing", 300, 47.2);
        Product game4 = new Product("Tomb rider", "action-adventure", 240, 39.5);

        List<Product> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);

        List<Product> gameSize = games.stream().filter(game -> game.getSize() < 60.5).collect(Collectors.toList());
        List<Product> gameGenre = games.stream().filter(game -> game.getGenre() == "action-adventure").collect(Collectors.toList());
        List<Product> gamePrice = games.stream().filter(game -> game.getPrice() >= 300).collect(Collectors.toList());

        System.out.println(gameSize);
        System.out.println(gameGenre);
        System.out.println(gamePrice);
    }
}
