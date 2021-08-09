# myprojetcs
I am learning java and currently making some new projects)_give me suggestions so that I can enhance my skills.
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);//an object is created to take input from an user
		System.out.print("Enter the number:");
		int n =sc.nextInt();//the typed number will be stored here
		int m = n%2;//number will de divided by 2
		if (m!=0) {
			System.out.println("the number is odd");//if remainder is not equal to 0,it will be odd 
		}else {
			System.out.println("the number is even");//if remainder is equal to 0,number will be even
		}

	}

}
