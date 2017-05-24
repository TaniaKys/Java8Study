package com.starr.java8.javascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSExample {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");

        String script = "var welcome = 'Hello'; "
                + "welcome += ', Tania'; "
                + "welcome;";

        try {
            String result = (String) engine.eval(script);
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
