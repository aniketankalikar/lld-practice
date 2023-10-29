package com.machinecoding.lambdastreams;

import java.util.List;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1,2,3,4,5);
        Stream<Integer> stream = integers.stream();
        System.out.println("Print stream");
        stream.forEach(val -> System.out.println(val));

        integers = List.of(1,2,3,4,5);
        stream = integers.stream();
        Stream<Integer> evenNos  = stream.filter(number -> number%2==0);
        System.out.println("Print Even Numbers");
        evenNos.forEach(val-> System.out.println(val));

        integers = List.of(3,4,5);
        Stream<Integer> streamObj = integers.stream();
        Stream<Integer> squaredMap = streamObj.map(number -> (number*number));
        System.out.println("Squares of Numbers");
        squaredMap.forEach(val -> System.out.println(val));
    }
}
