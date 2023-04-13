package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {

    public void test01(){
        List<Integer> ar=new ArrayList();
        ar.add(1);
        ar.add(12);
        ar.add(3);
        ar.stream().filter(a -> a.equals(1)).collect(Collectors.toList());
        System.out.println(ar);
    }

}
