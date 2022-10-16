

class Main {
    public static void main (String[] args) {

        int n = Integer.MAX_VALUE;
        int n2 = 234;
        System.out.println("Reversed Number is "+ reverse(n));
        System.out.println("Reversed Number is "+ reverse(n2));
    }

    static int reverse(int n){

        int result = 0;


        while(n!=0){

           int lastDigit = n%10;
            int newResult = result*10 + lastDigit;
            if((newResult-lastDigit)/10 != result ){
                return -1;
            }
            n /=10;
            result = newResult;
        }
        return result;
    }
}
