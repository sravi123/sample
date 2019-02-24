package constructors;

public class Button {
	//creating variables
	int a; int b; String c;
	//creating constructor
	
	Button(int height, int width, String bname)
	{
		a=height; b=width; c=bname;
	}
	//creating methods
	void buttonCreate()
	{
		System.out.println("Button "+ c +" Created");
	}
	public void clickable()
	{
		System.out.println("Button "+ c +" clickable");
	}
	public void doubleClickable()
	{
		System.out.println("Button "+ c +" Doubleclickable");
	}
	public static void main(String[] args) {
		Button ok=new Button(60,70,"ok");
				ok.buttonCreate();
		ok.clickable();
		Button cancel=new Button(60,70,"cancel");
		cancel.buttonCreate();
	}

}
