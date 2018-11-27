package fr.unice.bar;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ComparateurEntier implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2){
            return 1;
        }if(o1<o2){
            return -1;
        }
        if(o1==o2){
            return 0;
        }
        return Integer.parseInt(null);
    }
}
