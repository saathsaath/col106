public class program{
    public static void main(String[] args){
        
    }
    public boolean test(int year){
        boolean a = false;
       
        if(  year%400==0    ||   (year%4==0 && year%100!=0)    ){
            a = true;
        }
        return a;
    }

}