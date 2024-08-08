package com.XXXX.lcp;

import java.util.*;
import java.util.stream.Collectors;

public class CommonBsae {

    public static ArrayList getTopN(){

        int top3 = 3;
        Long sum = 0L;
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> Top3Map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 5);
        map.put("C", 8);
        map.put("D", 3);
        map.put("E", 12);
        Set<Integer> collect = map.values().stream().sorted().collect(Collectors.toSet());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            for (int i = 0; i < top3; i++) {

                Top3Map.put(entry.getKey(),entry.getValue());
            }
        }

        return (ArrayList) collect;
    }


    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();
        // 假设这是你的Map，已经填充了一些数据
        map.put("one", 5L);
        map.put("two", 3L);
        map.put("three", 8L);
        map.put("four", 1L);
        map.put("five", 7L);

        // 使用Comparator对Map的值进行降序排序
        List<Map.Entry<String, Long>> sortedEntries = new ArrayList<>(map.entrySet());
        Collections.sort(sortedEntries, new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                return o2.getValue().compareTo(o1.getValue()); // 降序
            }
        });

        // 获取排序后Map的前三项
        List<Map.Entry<String, Long>> top3 = sortedEntries.subList(0, 3);
        Map<String, Object> Top3Map = new HashMap<>();
        for (Map.Entry<String, Long> entry : top3) {
            Top3Map.put(entry.getKey(),entry.getValue());
        }
        // 打印结果
        for (Map.Entry<String, Long> entry : top3) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
