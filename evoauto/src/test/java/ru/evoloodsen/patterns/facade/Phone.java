package ru.evoloodsen.patterns.facade;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2025
 */

public class Phone {

    private final Keyboard keyboard;
    private final Screen screen;
    private final SoundCard soundCard;

    public Phone() {
        this.keyboard = new Keyboard();
        this.screen = new Screen();
        this.soundCard = new SoundCard();
    }

    public void sendSms() {
        keyboard.pressKey();
        screen.renderSymbols();
        soundCard.noice();
    }
}
