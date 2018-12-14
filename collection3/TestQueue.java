public class TestQueue {
    
    public static void code1() {
        Queue<String> queue = new LinkedList<>();
        ((LinkedList<String>) queue).push("A");
        ((LinkedList<String>) queue).addLast("B");
        queue.add("C");
        
        System.out.println("当前队列：");
        for (String item : queue) {
            System.out.println(item);
        }
        
        System.out.println("进行操作：");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());//null
        
        System.out.println("当前队列：");
        for (String item : queue) {
            System.out.println(item);
        }
    }
    
    public static void main(String[] args) {
        
        //队列
        LinkedList<String> dataPool = new LinkedList<>();
        
        //生产者线程 1
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    dataPool.push(String.valueOf(Math.random()));
                }
            }
        }).start();
        
        //消费者线程 1，2
        for (int i = 0; i < 3; i++) {
            
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        System.out.println(dataPool.poll());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
            
        }
        
    }
}