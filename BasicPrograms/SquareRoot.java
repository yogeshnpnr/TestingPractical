public class SquareRoot {
    public static void main(String[] args) {

       // double sq = Math.sqrt(25);
       // System.out.println("sqare root "+sq);


        int num= 9;
        double temp;
        double sr=num/2;


        do{
        temp= sr;// 4 //3
        sr = (temp+ (num/temp))/2;//  (4+ (9/4))/2= 3
                                  //( 3+(9/3) )/2= 3

        }while((temp-sr)!=0);

        System.out.println("square root of a number     "+ sr);
    }


}
