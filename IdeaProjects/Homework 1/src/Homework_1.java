public class Homework_1 {
    public static void main(String[] args){
        int n = 55;
        int counter=0;/*the value that keeps track of how many times number runs through the loop*/
        for(int i=0; n!=1;i ++ ){
            if (n%2==0){
                int w=n/2;        //can be n=n/2
                System.out.println(w);
                int count= counter +1;
                counter=count;
                n=w;
            }
            else {
                int x=3*n;
                int y=x+1;
                int coUnt= counter +1;
                counter=coUnt;
                System.out.println(y);
                n=y;
            }
        }
        System.out.println(n);
        System.out.println("The number of times ran through"+" "+counter);
    }
}

