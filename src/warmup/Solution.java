package warmup;

public class Solution {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Subclass obj2 = new Subclass();

        obj1.parentPrint();
        obj2.subClassPrint();
        obj2.parentPrint();
    }
}
