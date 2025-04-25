package ru.evoloodsen.patterns.factory;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2025
 */

public class Circle implements Shape {
    @Override
    public void render() {
        System.out.println("render Circle");
    }
}
