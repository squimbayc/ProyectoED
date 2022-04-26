public class Cola {
  private static final int N = 5;
  private int front, rear,count;
  private int[] qarray;

  public Cola(){
    this(N);
  }
  public Cola(int n){
    front = 0;
    rear = 0;
    count = 0;
    qarray = new int[n];
  }
  public void enque(int item){
    if(full()){
      throw new RuntimeException("Queue is full: item not enqueued");
      }
      qarray [rear] = item;
      rear = (rear + 1) % N;
      count++;
    
  }
  public int deque(){
    
    if(empty()){
      throw new RuntimeException("Queue is empty: item not dequeued");
    }
    int item = qarray[front];
    front = (front + 1) % N;
    count--;
    return item;
  }

  public boolean empty(){
    return count <= 0;
  }
  public boolean full(){
    return count >= N;
  }
    
}
