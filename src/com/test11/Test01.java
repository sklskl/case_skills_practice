package com.test11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: case_skills_practice
 * @ClassName: Test01
 * @author: skl
 * @create: 2024-03-11 11:00
 */
public class Test01 {
    public static void main(String[] args) {
        //增加 put
        //删除 clear remove
        //修改
        //查看 entryset get keyset size values
        //判断 containskey containsvalue contains
        Map<Integer,String> map = new HashMap();
        map.put(0001,"aaa");
        map.put(0002,"bbb");
        map.put(0003,"ccc");
        map.put(0004,"ddd");
        map.put(0004,"ddd");
        System.out.println(map.size());
        System.out.println(map );
        Set<Integer> set = map.keySet();
        for ( Integer s:set){
            System.out.println(s);
        }
        System.out.println("--------------");
        Collection<String> values = map.values();
        for(String v:values){
            System.out.println(v);
        }
        System.out.println("--------------");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
