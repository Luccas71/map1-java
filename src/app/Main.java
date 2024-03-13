package app;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        
        Map<String, String> cookies = new TreeMap<>();
        
        cookies.put("username", "aktrovao");
        cookies.put("email", "aktrovao@dev.com");
        cookies.put("phone", "999778844");

        // remove a chave
        cookies.remove("phone");

        // verifica se a chave existe
        System.out.println("CONTAINS KEY: " + cookies.containsKey("phone"));     

        // retorna o valor da chave
        System.out.println("KEY EMAIL: " + cookies.get("email"));     

        // retorna tamanho do map
        System.out.println("Size: " + cookies.size());



        System.out.println();
        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(cookies.get(key));
        }
    }
}