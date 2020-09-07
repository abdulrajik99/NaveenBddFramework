package javaQuestionPractise;

public class PrimeOrNot {
	public static boolean checkprimenumber(int num)
	{
		boolean isPrime=true;
		for(int j=2;j<=num/2;j++)
		{
			if(num%j==0){
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {

//		int n=2;
//		int count=0;
//		for(int i=1;i<=n;i++)
//		{
//			if(n%i==0){
//				count++;
//			}
//		}
//		if(count==2){
//			System.out.println(n+" is a prime");
//		}
//		else
//		{
//			System.out.println(n+" is not  a prime");
//		}
		
//		naveen method
		int n=34;
//		System.out.println(checkprimenumber(n));
		boolean flag=false;
		for(int i=2;i<=n/2;i++){
			if(checkprimenumber(i))
			{
				if(checkprimenumber(n-i)){
					System.out.println(n+" = "+i+" + "+ (n-i));
					flag=true;
				}
			}
		}
		if(!flag){
			System.out.println(n+"cannot be expressed as sum");
		}
		
	}

}
