/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jotase.examples;

import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.JauntException;
import com.jaunt.UserAgent;

/**
 *
 * @author javierjose
 */
public class Test {

    static UserAgent userAgent = new UserAgent();

    public static void main(String[] args) {
        elance(1);
    }

    public static void elance(int i) {
        try {

            userAgent.visit("https://www.elance.com/r/jobs/cat-it-programming/p-"+i);
            Elements elements = userAgent.doc.findFirst("<div id=\"jobSearchResults\">").findEach("<div>");
            for (Element element : elements) {
                System.out.println("Values : " + element.getElement(2).getText());
            }
            //elance(i++);
        } catch (JauntException e) {
            System.out.println(e);
        }
    }
}
