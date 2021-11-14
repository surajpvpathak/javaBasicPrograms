package Collection;

import java.util.PriorityQueue;
import java.util.Stack;

public class stackAndQueue {

    public static void main (String[] args){

        //In stack , the top entry will be removed for pop operation , its FILO , Fist In Last Out technique
        Stack <String> stackExample = new Stack<String>();
        PriorityQueue <String> priorityQueueExample = new PriorityQueue<String>();
        stackPush(stackExample);
        stackPop(stackExample);

        // in Queue , the firest entry will be removed for poll operation , its FIFO , First In First Out technique
    queueOfferToAddInQueue(priorityQueueExample);
    queuePollOpratoinToRemoveEntry(priorityQueueExample);
    }

    private static void stackPush(Stack<String> s1){

        System.out.println("Print the empty stack :  " + s1);
        s1.push("firstPushStackEntry");
        s1.push("secondPushStackEntry");
        s1.push("thirdPushStackEntry");
        System.out.println("Print the  stack after push operation :  " + s1+ " TOP");
    }

    private static void stackPop(Stack<String> s1){

        System.out.println("Print the  stack before Pop operation :  " + s1 + " TOP");
        s1.pop();
        System.out.println("Print the  stack after 1st Pop operation :  " + s1 + " TOP");
        s1.pop();
        System.out.println("Print the  stack after 2nd Pop operation :  " + s1+ " TOP");
    }

    private static void queueOfferToAddInQueue(PriorityQueue<String> pq){
        System.out.println("Print the empty queue :  " + pq);
        pq.offer("FirstEntryInQueue");
        pq.offer("SecondEntryInQueue");
        pq.offer("ThirdEntryInQueue");
        System.out.println("Print the  Queue after Offer operation :  " + pq+ " TOP");
    }

    private static void queuePollOpratoinToRemoveEntry(PriorityQueue<String> pq){

        System.out.println("Print the  queue before poll operation :  " + pq + " TOP");

        System.out.println("Get the highest priority Item from queue: ");;
        System.out.printf("%s " , pq.peek());
        System.out.println();;

        pq.poll();
        System.out.println("Print the  queue after 1st poll operation :  " + pq + " TOP");

        System.out.println("Get the highest priority Item from queue: ");;
        System.out.printf("%s " , pq.peek());
        System.out.println();

        pq.poll();
        System.out.println("Print the  queue after 2nd poll operation :  " + pq+ " TOP");

        System.out.println("Get the highest priority Item from queue: ");;
        System.out.printf("%s " , pq.peek());
        System.out.println();;
    }

}

