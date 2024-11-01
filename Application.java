public class Application {
    private static Application instance;
    private int queue;
    private boolean desk1;
    private boolean desk2;
    private boolean desk3;

    private Application(){

    }

    public static synchronized Application getInstance(){
        if(instance == null)
            instance = new Application();
        return instance;
    }

    public synchronized boolean desk1(){
        return desk1;
    }
    public synchronized boolean desk2(){
        return desk2;
    }
    public synchronized boolean desk3(){
        return desk3;
    }

    public synchronized void  joinQueue(int queue){
        if(!desk1){
            desk1 = true;
            this.queue = queue;
            System.out.println(queue + " is at desk 1");
        }else if(!desk2){
            desk2 = true;
            this.queue = queue;
            System.out.println(queue + " is at desk 2");
        }else if(!desk3){
            desk3 = true;
            this.queue = queue;
            System.out.println(queue + " is at desk 3");
        }else{
            System.out.println("There are no free desks!");
        }
    }
    public synchronized void exitDesk(int desk) {
        if (desk == 1 && desk1) {
            desk1 = false;
            System.out.println("Desk 1 is now fre!e");
        } else if (desk == 2 && desk2) {
            desk2 = false;
            System.out.println("Desk 2 is now free!");
        } else if (desk == 3 && desk3) {
            desk3 = false;
            System.out.println("Desk 3 is now free!");
        } else {
            System.out.println("This desk is not occupied or this desk doesn't exist");
        }
    }
}
