package co.com.screenplay.project.utils;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

import static co.com.screenplay.project.ui.CategoryUI.getLocatorListProducts;
import static co.com.screenplay.project.utils.Constants.ONE;
import static co.com.screenplay.project.utils.WebActions.click;

public class SelectorElements {

    private SelectorElements(){}

    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());

    private static int getProductsRandom() {
        return faker.number().numberBetween(ONE, getLocatorListProducts().size());
    }

    public static void selectRandomProducts() {
        click(getLocatorListProducts().get(getProductsRandom()));
    }
}
