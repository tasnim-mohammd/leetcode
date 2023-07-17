class Solution {
    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do{
            slow = find(slow);
            fast = find(find(fast));
        }while(slow != fast);

      if(slow==1)
          return true;
      return false;

    }

    private int find( int number)
    {
        int num = 0;
        while( number > 0){
            int rem = number % 10;
            num += rem*rem;
            number /=10;
        }
        return num;
    }
}
