package homework;

import java.util.Scanner;

public class HomeWork2 {

	//逆时针数字旋转方阵实现 
	static void NFangZhen(int n) 
	{  
		int size=n;  
		int flag=0;     //设置转换方向标志  
		int[][]a = new int[10][10];  //设置二维数组  
		int i=0,j=0,num=1;  
		while(true)  
		{   
			if(size==0)    
				break;   
			else if(size==1)   
			{    
				a[i][j]=num;    
				break;   
				}   else   
					{    
					do           //区域A    
						{     
						a[i][j]=num;     
						i++;     
						num++;     
						flag++;    
						}while(flag<size-1);   
					flag=0;    
					do           //区域B    
						{    
						a[i][j]=num;     
						j++;     
						num++;     
						flag++;    
						}while(flag<size-1);    
					flag=0;    
					do           //区域C    
						{     
						a[i][j]=num;     
						i--;     
						num++;     
						flag++;    
						}while(flag<size-1);   
					flag=0;
					do
					{
						a[i][j]=num;
						j--;
						num++;
						flag++;
					}while(flag<size-1);    
    flag=0;        //内圈循环    
    i++;    
    j++;    
    size=size-2;    
    }  
}  
for(i=0;i<n;i++)  
{   
	for(j=0;j<n;j++)   
	{         
		System.out.print(a[i][j]+" ");
		if (String.valueOf(a[i][j]).length()==1) {
			System.out.print(" ");
		}
		}   
	System.out.println(); 
} 
System.out.println();
}
	
	public static void main(String[] args) {
		
		System.out.println("请输入4-10的整数：");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			NFangZhen(scanner.nextInt());
		}
	}
}

