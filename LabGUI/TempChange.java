public class TempChange{
    public static int  CToF(int temp){
	return (int)((temp - 32)*5/9);
    }
    public static int FToC(int temp){
	return (int)((9*temp/5) + 32);
    }
    public static void main(String[]args){
	System.out.println(CToF(-40));
	System.out.println(FToC(-40));
    }
}