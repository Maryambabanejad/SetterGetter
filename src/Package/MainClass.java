package Package;
public class MainClass {
    public static void main(String[] args) {
         int res = Sum(2,10,8);
        System.out.println(res);
        System.out.println(Sum(200,400,800));
    }
    public static int Sum(int x, int y, int z) {
        int temp = x + y + z;
        return temp;
    }
        public static void Mul ( int num1 *int num2){
            int temp = num1*num2;
            System.out.println(temp);
        }
    }

