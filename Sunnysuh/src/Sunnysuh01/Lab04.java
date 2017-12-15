package Sunnysuh01;

public class Lab04 {
	public static void main(String[] args) {

		// #16

	int n = 1;
	int k = 2;
	int r = n;
	if (k > n)
		r = k;
	    System.out.println("%d %d %d, n, k, r");

    int q; 
	if (n > k)
		q = k;
	else q = k + n;
		System.out.println("%d %d %d, n, k, q");
	   
	
	r = 3;
	k = 2;
	if(r < n + k)
	  r = 2 * n;
	    System.out.println("%d %d %d\n, k, q");
	    
	
	// #17

	int x = 1;
	int y = 2;
	// if(x && y == 0){ // y=1;}if(1<=x<=10)System.out.println(x);}

	
	// #18

	int number  = 30;
	if (number % 2 == 0) {
	   System.out.println(number + " is even.");
	else{System.out.println(number+" is odd.");
	
	int number1  = 35;
	if (number1 % 2 == 0) {
	   System.out.println(number + " is even.");
	else{System.out.println(number +" is odd.");
	
	
	// #19

	x = 3;
	y = 2;
	z = 4;
	if (x > 2) {
		if(y > 2 ) {
		System.out.println("z is" + z);
	else
	    System.out.println("x is"+ x);

	// #20

	int a = 3;
	if(a++ == 3)
		System.out.println("3");
	else
		System.out.println("4");
	

	int a = 3;
	if(++a == 3)
		System.out.println("3");
	else
		System.out.println("4");
	
	int a = 3;
	a = a++;
	if(a == 3)
		System.out.println("3");
    else
		System.out.println("4");

		
	}
	}
