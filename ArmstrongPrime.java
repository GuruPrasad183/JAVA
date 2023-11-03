class Armstrong
{
	public static void main(String[] args)
	{
		int num=153,rem=0,count=0,sum=0,temp=num,countr=0,start=1;
		for(;num>0;num/=10)
		{
			rem=num%10;
			count++;
		}
		num=temp;
		for(;num>0;num/=10)
		{
			rem=num%10;
			sum=sum+(int)Math.pow(rem,count);
		}
		num=temp;
		if(sum==num)
		{
			for(;start<=num;start++)
			{
				if(num%start==0)
				{
					countr++;
				}
			}
			if(countr==2)
			{
				System.out.println("Armstrong and also prime");
			}
			else
			{
				System.out.println("only Armstrong");
			}
		}
		else
		{
			System.out.println("Not armstrong");
		}
	}
}
