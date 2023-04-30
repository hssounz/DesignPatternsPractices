package org.example.Strategy_DesignPattern;

import org.example.Strategy_DesignPattern.hit.IHit;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /**
     * Strategy Pattern allows us to use different strategies for example for the hit of our perso.
     *
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Perso perso1 = new Perso();
        Scanner scanner = new Scanner(System.in);
        /**
         * Cache Memory for strategies, to prevent instantiating same objects
         */
        Map<String, IHit> strategiesCache = new HashMap<>();

        while (true) {
            System.out.println("Give a hit with a : ");
            String str = scanner.nextLine();

            if (strategiesCache.containsKey(str)) {
                perso1.setHittingStrategy(strategiesCache.get(str));
            } else {
                IHit hittingStrategy = (IHit) Class
                        .forName("org.example.Strategy_DesignPattern.hit.Hit"+str)
                        .getConstructor()
                        .newInstance();
                strategiesCache.put(str, hittingStrategy);
                perso1.setHittingStrategy(hittingStrategy);
            }
            perso1.giveHit();
        }
    }
}
