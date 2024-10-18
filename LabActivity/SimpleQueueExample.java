/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabActivity;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("dalirig");
        queue.add("zone 4");
        queue.add("manolo");

        String firstElement = queue.poll();
        String secondElement = queue.poll();

        System.out.println("Remaining elements in the queue: " + queue);

        queue.add("Date");
        queue.add("sabon");

        String thirdElement = queue.poll();

        System.out.println("Remaining elements in the queue: " + queue);
    }
}