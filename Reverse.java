class Reverse
{
public static void main(string args[])
{
int n=Integer.parseInt(args[0]);
int rev=0;
int r;
while(n>0)
{
r=n%10;
rev=(rev*10)+r;
n=n/10;
}
System.out.println("Reverse number:"+rev);
}
}

