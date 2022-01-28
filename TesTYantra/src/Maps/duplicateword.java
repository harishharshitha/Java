package Maps;
public class duplicateword {
	public static void main(String[] args) {
		String a="india";
		a=a.toUpperCase();
		char[] c = a.toCharArray();

String ne="";
		for(int i=0;i<a.length();i++) {

			int count=1;
			if(c[i]!=0) {


				for(int j=i+1;j<a.length();j++)
				{
					if(c[i]==c[j]) 
					{
						count++;
						c[j]=0;
					}
				}
				
				ne=ne+c[i];
			}
		}
	

System.out.println(ne);
	}
}
