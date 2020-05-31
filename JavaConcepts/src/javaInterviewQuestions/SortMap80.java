import java.util.*;

public class SortMap80 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> mUnSorted = new LinkedHashMap<>();
        mUnSorted.put("Harry","Hedwig");
        mUnSorted.put("Ron","Pig");
        mUnSorted.put("Hermione","Crookshanks");
        mUnSorted.put("Ginny","Arnold");
        mUnSorted.put("Neville","Trevor");

        LinkedHashMap<String,String> mSorted = new LinkedHashMap();
        mUnSorted.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> mSorted.put(x.getKey(), x.getValue()));
        System.out.println(mSorted);

        LinkedHashMap<String,String> reverseSorted = new LinkedHashMap<>();

        mUnSorted.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x->reverseSorted.put(x.getKey(),x.getValue()));
        System.out.println(reverseSorted);
    }
}
