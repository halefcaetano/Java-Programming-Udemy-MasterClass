package dev.lpa;
public class Main {
    public static void main(String[] args) {
        var majorUSRivers = new River[]{
                new River("Mississippi", "47.2160, -952348", "29.1566, -89.2495", "35.1556, -90.0659")
        };
        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.renderLayer();
    }
}
