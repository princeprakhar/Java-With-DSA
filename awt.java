import java.awt.*;
class FirstFrame extends Frame
{
	FirstFrame()
	{
		Frame f=new Frame();
		Button b=new Button("Click Me");
		b.setBounds(30,80,100,30);
		f.add(b);
		f.setSize(300,300);
//		f.setTitle("Profile: ");
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		FirstFrame F = new FirstFrame();
	}
}