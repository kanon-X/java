public class IFElse {
    public static void main(String[] args) {
        int x =0;
for(int i = 0; i<10; i++){
    if(i%3==0){
        x= x+50;
    }
    else if(i%5 ==0){
        x = x+20;
    }
    if(i%15 ==0){
    x=x+10;
    }
    }
    System.out.println(x);
    }

}
