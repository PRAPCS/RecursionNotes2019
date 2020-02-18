class Main {
  public static void main(String[] args) {
    System.out.println(factorial(4));
    System.out.println(fib(8));
  }

  public static int factorial (int n){
   if(n==1)  //Base Case we need to get to here for the recursion to stop
   return 1;

   else
     return n * factorial(n-1); //Recursive call getting us closer to the base case
  }

  public static int fib(int m){
    if(m<3)
    return 1;

    else
    return fib(m-1)+fib(m-2);
  }

}