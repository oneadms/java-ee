package com.example.javaee.lambda.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaUtils {


    public Collector distinct(Function function) {
        return Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(function))), ArrayList::new);
    }

}
