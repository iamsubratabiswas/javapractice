public class Fifth {
    public static void main(String[] args) {
        System.out.println("ITERATION,LOOP\nfor, while, do{} while(codition);,for each" +
                "\n continue=skip remaining statements inside loop\nbreak= terminate loop");
        int i=1;
        while(i<=4)
        {
            System.out.println("while loop");
            i++;
        }

        i=8;
        do {
            System.out.println("do while loop/at least once lounch");
            i++;
        }
        while(i<=4);

        for(int j=1;j<=4;j++)
        {
            System.out.println("for loop");
        }

        for(int k=0;k<10;k++)
        {
            if(k==4)
                continue;
            else if(k==6)
                break;
            else
                System.out.println("continue and break for "+k+"th iteration");
        }

        int[] numbers={3,9,6,8};
        for(int num: numbers)
        {
            System.out.println(num);
        }
    }
}
