package com.example.companydemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Function;

public class FuncTests {

    private static final Logger log = LoggerFactory.getLogger(FuncTests.class);

    @Test
    public void runTest1() {
        Function<String, String> tFunc = (i) -> i.substring(0,1).toUpperCase() + i.substring(1);
        List<String> testList = Arrays.asList("tExas", "coloRado", "wAshinGtOn");
        List<String> processed = testList.stream().map(tFunc).sorted().toList();
        List<String> expectedList = Arrays.asList("Colorado", "Texas", "Washington");
        Assertions.assertEquals(processed, expectedList);
    }

    @Test
    public void runThreadTest1() throws InterruptedException, ExecutionException {
        List<Callable<String>> cList = List.of(() -> {
            TimeUnit.MILLISECONDS.sleep(1000);
            return String.valueOf(System.currentTimeMillis());
        });

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<String>> res = executorService.invokeAll(cList);
        for (Future<String> f : res) log.info(f.get());
        executorService.shutdown();
    }
}
