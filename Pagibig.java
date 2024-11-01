public class Pagibig {
    public static void main(String[] args){
        Application app = Application.getInstance();

        app.joinQueue(123);
        app.joinQueue(124);
        app.joinQueue(125);

        app.joinQueue(126);//126 would result in no desk available
        app.exitDesk(1);//Free space for the next queue

        app.joinQueue(126);
        app.exitDesk(2);
        app.joinQueue(128);

        app.exitDesk(4);//would exit and invalid number
        //Pastores, Jabez Villan C.
        //3BSCS-1
    }
}
