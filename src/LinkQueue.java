public class LinkQueue<T> implements Queueable<T> {

    ItemNode<T> frontNode;
    ItemNode<T> backNode;

    public LinkQueue(){
        frontNode=backNode=null;
    }

    public void enqueue(T data){
        ItemNode<T> newNode = new ItemNode(data);

        if(isEmpty()){
            frontNode = backNode = newNode;
        }else {
            backNode.setNextNode(newNode);
            backNode = newNode;
        }
    }

    public T dequeue(){
       if(!isEmpty()){
           T data = frontNode.getData();
           frontNode = frontNode.getNextNode();
           return data;
       }
       else{
           return null;
       }
    }


    public boolean isEmpty(){
        return frontNode == null;
    }

    @Override
    public String toString() {
        ItemNode current = frontNode;
        String result = "";
        while(current !=null){
            result+= current.getData()+" ";
            current = current.getNextNode();
        }

        return result;
    }
}
