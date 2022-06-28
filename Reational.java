package day1;

public class Reational {
	public static void main(String[]args){
		int a=5,b=5;
		boolean c=a<b;
		boolean d=a>b; 
		boolean e=a==b;
		boolean f=a!=b;
		System.out.print("int ans="+c+","+d+","+e+","+f);
		
		float g= 5.5f,h =7.5f;
		boolean i=g<h;
		boolean j=g>h;
		boolean k=g==h;
		boolean l=g!=h;
		System.out.print(", float ans="+i+","+j+","+k+","+l);
		
		long m= 987612345l, n= 123459876l;
		boolean o=m<n;
		boolean p=m>n;
		boolean q=m==n;
		boolean r=m!=n;
		System.out.print(", long ans="+o+","+p+","+q+","+r);
	}	

}
