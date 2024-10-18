/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabActivity;

import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        LinkedList<String> person = new LinkedList<>();

        person.add("yanyan");
        person.addFirst("gwapo ko");
        person.addLast("always");
        person.add(1, "basta lagi");

        System.out.println("Linked List Original: " + person);
        System.out.println(person.size());

        if (person.contains("gwapo ko")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        boolean containslion = person.contains("gwapo ko");
        System.out.println(containslion);

    }

}
