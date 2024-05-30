public class patterns {
    public static void triangle(int rows, char ch){
        for(int i=1; i<rows; i++){
            for(int j=0;j<i;j++){
                System.out.println(ch +"");
            }
            System.out.println();
        }

    }
    public static void  iinvertedtraingle(int rows, char ch){
        for(int i =rows; i>=1;--i){
            for(int j=1; j<=rows-i;++j);{
               for(int j=1; j<=2*i-1; ++j){
                System.out.println(ch + "");
               }
            }
        }
    }
    public static void main(String args[]){
        triangle(5,'*');
    }
    
}
