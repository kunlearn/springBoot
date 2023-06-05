package com.XXXX.lcp;

import org.junit.jupiter.api.Test;
import org.mvel2.MVEL;
import org.mvel2.compiler.ExecutableAccessor;

import java.util.HashMap;
import java.util.Map;

public class MvelTest {

    @Test
    public void test1(){
        // 计算
        Map<String, Integer> argsMap = new HashMap<>();
        argsMap.put("x", 5);
        argsMap.put("y", 10);

        Integer result = (Integer) MVEL.eval("x * y", argsMap);
        System.out.println("intResult=" + result);

    }

    @Test
    public void test2(){
        Map<String, Integer> argsMap = new HashMap<>();
        argsMap.put("x", 5);
        argsMap.put("y", 10);

        ExecutableAccessor compiledExp = (ExecutableAccessor)MVEL.compileExpression("x * y");
        Integer resultFromCompiledExp = (Integer)MVEL.executeExpression(compiledExp, argsMap);
        System.out.println("intResult=" + resultFromCompiledExp);

    }

}
