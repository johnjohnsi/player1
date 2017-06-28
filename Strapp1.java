package ass1;

import java.util.Scanner;

public class Strapp1 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		String[] split=str.split(" ");
		String temp="";
		for(int i=0;i<split.length;i++){
			String splitword=split[i];
			String temp1="";
			String temp2="";
			if(i%2==0){
			for(int j=splitword.length()-1;j>=0;j--){
				temp1+=splitword.charAt(j);
			}
			}
			else{
				temp2+=splitword;
			}
			temp+=temp1+temp2+" ";
		}
		System.out.println(temp);
		s.close();
	}

}
