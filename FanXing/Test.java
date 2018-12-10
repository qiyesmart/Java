public class Test {
    
    
    public static char findThreeChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        // A-Z a-z
        // 实时计算
        int[] count = new int[255];
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                count[c]++;
                if (count[c] == 3) {
                    return c;
                }
            }
        }
        throw new RuntimeException("Not found");
    }
    
    public static void main(String[] args) {
    
        System.out.println(findThreeChar(" Have you ever gone shopping and"));
        System.out.println(findThreeChar(" H a v e you ever gone shopping and"));
    }
}

class Person {
    
    public void fun() {
        this.print();
    }
    
    private void print() {
        System.out.println("1.***");
    }
    
}

class Student extends Person {
    
    public void print() {
        System.out.println("2.###");
    }
}