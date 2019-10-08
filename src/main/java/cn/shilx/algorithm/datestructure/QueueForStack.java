package cn.shilx.algorithm.datestructure;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueForStack<T> {

    private Queue<T> dataQueue;

    private Queue<T> assistQueue;

    public QueueForStack(){

        this.dataQueue = new ArrayDeque<>();

        this.assistQueue = new ArrayDeque<>();
    }

    public QueueForStack(int numElements){

        this.dataQueue = new ArrayDeque<>(numElements);

        this.assistQueue = new ArrayDeque<>(numElements);
    }

    public void add(T t){
//        this.dataQueue =
    }

    public T pop(){
        return null;
    }

    public T peek(){
        return null;
    }

}
