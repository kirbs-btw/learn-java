class OuterClass{
	int x = 7;
	
	class InnerClass{
		int y = 12;
	}
}

public class InnerClass{
	public static void main(String[] args){
		OuterClass myObj = new OuterClass();
		OuterClass.InnerClass myInnerObj = myObj.new InnerClass();
		System.out.println(myInnerObj.y + myObj.x);
		
	}
	
	
}