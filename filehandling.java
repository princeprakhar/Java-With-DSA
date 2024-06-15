import java.io.*;
class FileH
{
	public static void main(String []args)throws IOException
	{	
		FileOutputStream fout=new FileOutputStream("./1stfile.txt");
		String content="My name is prakhar deep";
		char j;
		int k;
		for(int i=0;i<content.length();i++)
		{
			j=content.charAt(i);
			fout.write(j);
		}
		fout.close();
		FileInputStream fin = new FileInputStream("./1stfile.txt");
		do
		{
			k=fin.read();
			if(k>=0)
			{
				System.out.print((char)k);
			}
		}while(k>=0);
		fin.close();	
	}
}