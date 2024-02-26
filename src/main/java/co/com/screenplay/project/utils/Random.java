package co.com.screenplay.project.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

import static co.com.screenplay.project.utils.Constants.*;

public class Random {

    private Random(){}

    private static final Faker faker = Faker.instance(new Locale("es", "CO"), new java.util.Random());

    public static int randomNumberTwoAndFour() {
        return faker.number().numberBetween(TWO, FOUR);
    }

}