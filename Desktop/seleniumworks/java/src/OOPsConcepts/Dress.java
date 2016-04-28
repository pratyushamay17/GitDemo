package OOPsConcepts;

import java.util.Scanner;

public class Dress {
	String dname;
	String gender;
	String material;
	
	Dress(String d,String g){
		this.dname=d;
		this.gender=g;
		this.material="cotton";
	}
	public Dress method(){
		return this;
	}
	public Dress  method2(){
		Dress x = new Dress("aaa", "m");
		return x;
		//return new Dress("aaa","m");
	}
	
	public Dress[] method3(int x){
		Dress[] a= new Dress[x];
		
		for(int i=0;i<x;i++)
		{
			a[i] = new Dress("123", "345");
		}
		return a;
	}
	
	public Dress[][] method5(int x,int y){
		Dress[][] d=new Dress[x][y];
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				
				d[i][j]=new Dress("2"+i+j,"3"+i+j);
			}
		}			
		return d;
	}
	
	public Dress[][][] method6(int x1,int y1,int z1){
		Dress[][][] d1=new Dress[x1][y1][z1];
		for(int i=0;i<x1;i++){
			for(int j=0;j<y1;j++){
				for(int k=0;k<z1;k++){
					d1[i][j][k]=new Dress("3","4");
				}
			}
		}
		return d1;
	}
	
	
	public int[] method4(int x){
		int[] a= new int[x];
		
		for(int i=0;i<x;i++)
		{
			a[i] = i;
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dress obj=new Dress("jeans","f");
		//System.out.println(obj.method());
		//Dress obj2=obj;
		//System.out.println(obj2.method());
		//obj2=new Dress("shirt","m");
		//System.out.println(obj2.method());
		
		Dress[][] d = obj.method5(4, 5);
		for(int i=0;i<d.length;i++){
			for(int j=0;j<d[i].length;j++){
				System.out.println("d["+i+"]["+j+"]  "+d[i][j].dname + " "+d[i][j].gender);
			}
		}
		
	}

}
