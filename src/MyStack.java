/**
 * Created by volfovskaya on 08.11.16.
 */

import java.util.*;

public class MyStack {
    public static void main(String args[]) {
        Stack<Integer> my = new Stack<>();


        my.push(1);
        my.push(2);
        my.push(3);

        System.out.println("Количество элеметов: " + my.size());
        System.out.println("Емкость контейнера: " + my.capacity());

        System.out.println("Элемент на вершине стека: " + my.peek());
        my.push(4);
        my.push(5);

        System.out.println("Количество элеметов: " + my.size());
        my.pop();

        System.out.println("Элемент на вершине стека: " + my.peek());
        System.out.println("Количество элеметов: " + my.size());

        for (int i = 5; i <= 10; i++) {
            my.push(i);

            if (i == 7) {
                System.out.println("Элемент на верхушке стека: " + my.peek());
            }
        }

        System.out.println("Количество элеметов: " + my.size());

    }
}
