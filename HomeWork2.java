package homework;

import java.util.Scanner;

public class HomeWork2 {

	//��ʱ��������ת����ʵ�� 
	static void NFangZhen(int n) 
	{  
		int size=n;  
		int flag=0;     //����ת�������־  
		int[][]a = new int[10][10];  //���ö�ά����  
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
					do           //����A    
						{     
						a[i][j]=num;     
						i++;     
						num++;     
						flag++;    
						}while(flag<size-1);   
					flag=0;    
					do           //����B    
						{    
						a[i][j]=num;     
						j++;     
						num++;     
						flag++;    
						}while(flag<size-1);    
					flag=0;    
					do           //����C    
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
    flag=0;        //��Ȧѭ��    
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
		
		System.out.println("������4-10��������");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			NFangZhen(scanner.nextInt());
		}
	}
}

