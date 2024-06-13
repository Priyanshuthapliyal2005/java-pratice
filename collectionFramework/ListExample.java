import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        // Using ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("ArrayList: " + list);

        // Using LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(0, 20); // add at index 0
        linkedList.add(1, 30); // add at index 1
        System.out.println("LinkedList: " + linkedList);

        // Using Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(1, 3);
        System.out.println("Vector: " + vector);
        vector.clear();
        System.out.println("Vector after clear: " + vector);

        // Using Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

        // Using HashSet
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(2);
        set.add(2); // duplicate element
        set.add(3);
        set.add(3); // duplicate element
        set.add(3); // duplicate element
        set.add(100);
        System.out.println("HashSet: " + set);

        // Using LinkedHashSet
        LinkedHashSet<Integer> llset = new LinkedHashSet<>();
        llset.add(10);
        llset.add(20);
        llset.add(2);
        llset.add(2); // duplicate element
        System.out.println("LinkedHashSet: " + llset);

        // Using TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(2);
        treeSet.add(2); // duplicate element
        System.out.println("TreeSet: " + treeSet);

        // Using Queue with LinkedList
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.offer(20);
        queue.add(30);
        System.out.println("Queue: " + queue);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println("Queue after remove: " + queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.poll();
            System.out.println("Queue: " + queue);
        }

        // Using PriorityQueue (Min Heap)
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.offer(10);
        pQueue.offer(20);
        pQueue.offer(3);
        System.out.println("PriorityQueue (Min Heap): " + pQueue);
        while (!pQueue.isEmpty()) {
            System.out.println(pQueue.peek());
            pQueue.poll();
            System.out.println("PriorityQueue: " + pQueue);
        }

        // Using PriorityQueue (Max Heap)
        PriorityQueue<Integer> pQueueMax = new PriorityQueue<>(Comparator.reverseOrder());
        pQueueMax.offer(10);
        pQueueMax.offer(20);
        pQueueMax.offer(3);
        System.out.println("PriorityQueue (Max Heap): " + pQueueMax);
        while (!pQueueMax.isEmpty()) {
            System.out.println(pQueueMax.peek());
            pQueueMax.poll();
            System.out.println("PriorityQueue: " + pQueueMax);
        }

        // Using ArrayDeque
        Deque<Integer> adq = new ArrayDeque<>();
        adq.add(10);
        adq.offerFirst(20);
        adq.offerLast(30);
        adq.offer(40);
        adq.offerLast(50);
        System.out.println("ArrayDeque: " + adq);
        System.out.println(adq.peekLast());
        adq.pollLast();
        System.out.println(adq.peek());
        adq.remove();
        System.out.println("ArrayDeque after removals: " + adq);
        while (!adq.isEmpty()) {
            System.out.println(adq.peek());
            adq.poll();
            System.out.println("ArrayDeque: " + adq);
        }

        // Using HashMap
        HashMap<Integer, Integer> hMap = new HashMap<>();
        hMap.put(1, 100);
        hMap.put(2, 200);
        hMap.put(3, 300);
        System.out.println("HashMap: " + hMap);

        // Accessing elements in HashMap
        int value1 = hMap.get(1);
        int value2 = hMap.get(2);
        System.out.println("Value for key 1: " + value1);
        System.out.println("Value for key 2: " + value2);

        // Iterating over HashMap
        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        

        //sort the array
        int arr[]={10,30,50,50,12,1,2};
        System.out.println("Array before sorting: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sorting: "+Arrays.toString(arr));

        
        //binary search in array
        int index=Arrays.binarySearch(arr, 50);
        System.out.println("Index of 50 in array: "+index);

        //collection sort
        ArrayList<String>myList=new ArrayList<String>();
        myList.add("Second");
        myList.add("First");
        myList.add("Third");
        Collections.sort(myList);
        System.out.println(myList);


        //iterator
        Iterator it=myList.iterator();
        while(it.hasNext()){
            System.out.println("List Val="+it.next());
        }
    }
}
