import java.io.*;
class FileHB
{
	public static void main(String []args)throws IOException
	{
		String i;
		BufferedWriter bfw = new BufferedWriter(new FileWriter("./1stfile.txt",true));
		bfw.write("\n agrahari");
		bfw.close();
		BufferedReader bfr = new BufferedReader(new FileReader("./1stfile.txt"));
		//i=bfr.readLine();
		//while(i!=null)
		//{
		//	System.out.println(i);
		//	i=bfr.readLine();
		//}
		char []s=new char[20];
		bfr.read(s,0,20);//read method for char array and starting index for storing the data and last for upto how many char is readed from the file
		System.out.println(s);
		bfr.close();
	}
}