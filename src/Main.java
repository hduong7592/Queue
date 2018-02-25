import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
        Queueable<Integer> queue = new LinkQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue);
        System.out.println("Dequeue: "+queue.dequeue());
        //System.out.println("Dequeue: "+queue.dequeue());
        System.out.println(queue);

        */

        Queueable<String> Q = new LinkQueue();
        Scanner scn = new Scanner(System.in);
        String ans = "";
        while(!ans.equals("DONE")){
            System.out.println("Enter a Process ID, time [p,t]");
            ans = scn.nextLine();
            if(!ans.equals("DONE"))
                Q.enqueue(ans);
        }

        System.out.println(Q);
        /*
        boolean done = false;
        while(!done){
            String curr ="";
            try{
                curr= Q.dequeue();
            } catch(Exception e){
                System.out.println(e.getMessage());
                done=true;
            }
            if(!done){
                System.out.println(curr+" processing");
                String[] parts = curr.split(",");
                String name = parts[0];
                int t = Integer.parseInt(parts[1]);
                t--;
                if(t>0){
                    Q.enqueue(name+","+t);
                }
            }
        }
        */
    }
}
