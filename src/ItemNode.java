public class ItemNode<T> {
    private ItemNode nextNode;
    private T data;

    public ItemNode(T data){
        this.data = data;
    }

    public void setNextNode(ItemNode nextNode) {
        this.nextNode = nextNode;
    }

    public ItemNode getNextNode() {
        return nextNode;
    }

    public T getData(){
        return data;
    }
}
