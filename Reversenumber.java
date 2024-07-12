{
class Reversenumber
{
public static void main(string args[])
{
int n=integer.parseInt(args[])
int rev=0;
int r;
while(n>0)
{
r=n%10;
rev=(rev*10)+r;
n=n/10;
}
System.out.println(Reverse number:"+rev);
}
}

