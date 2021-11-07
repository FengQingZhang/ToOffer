package stackqueue.dogcatqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 实现一种猫狗队列
 * 用户可以调用add方法将dog和cat类加入队列
 * pollAll 将所有实例安顺序弹出
 * pollCat 将cat实例弹出
 * pollGod 将Dog弹出
 * isEmpty
 * isDogEmpty
 * isCatEmpty
 */
public class MyQueue {
    private Queue<PetEnterQueue> dogQueue;
    private Queue<PetEnterQueue> catQueue;
    private long count;

    private MyQueue(){
        this.dogQueue = new LinkedList<>();
        this.catQueue = new LinkedList<>();
        this.count = 0;
    }

    public void add(Pet pet){
        if (pet.getType().equals("cat")){
            this.catQueue.add(new PetEnterQueue(pet,this.count++));
        }else {
            this.dogQueue.add(new PetEnterQueue(pet,this.count++));
        }
    }

    public Pet pollAll() {
         if (!this.catQueue.isEmpty()&&!this.dogQueue.isEmpty()){
             if (catQueue.peek().getCount()<dogQueue.peek().getCount()){
                 return catQueue.poll().getPet();
             }else {
                 return dogQueue.poll().getPet();
             }
         }else if (!this.catQueue.isEmpty()){
             return catQueue.poll().getPet();
         }else if (!this.dogQueue.isEmpty()){
             return dogQueue.poll().getPet();
         }else {
             throw new RuntimeException("your queue is empty");
         }
    }

    public Pet pollCat(){
        if (!this.catQueue.isEmpty()){
            return catQueue.poll().getPet();
        }else {
            throw new RuntimeException("your queue is empty");
        }
    }
    public Boolean isEmpty(){
        if (this.catQueue.isEmpty()&&this.dogQueue.isEmpty()){
            return true;
        }else
            return false;
    }
}
