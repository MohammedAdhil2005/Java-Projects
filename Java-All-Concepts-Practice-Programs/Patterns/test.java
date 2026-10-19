class test 
{
	public static void p1(int n){
		System.out.print("\n----------------------------------------\n");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || j==1 || i==n || j==n || j==i || j==n-i+1){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void p2(int n){
		System.out.print("\n----------------------------------------\n");
		int star=1;
		int space=n-1;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				
				if(i==n/2+1 || j==n/2+1){
					if(i==j){
					System.out.print("@ ");
					}
					else{
					System.out.print("* ");
				}
				
				
				}
				
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	public static void p3(int n){
		System.out.print("\n----------------------------------------\n");
		int star=1;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void p4(int n){
		
		System.out.print("\n----------------------------------------\n");
		int star=n;
		int space=0;
		
		for(int i=1;i<=n;i++){
			
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++){
			System.out.print("*");
			}
			
			System.out.println();
		    star--;
			space++;
		}
	}
	
	public static void p5(int n){
		System.out.print("\n----------------------------------------\n");
		int star=1;
		int space=n-1;
		
		for(int i=1;i<=n;i++){
			
			for(int k=1;k<=space;k++){
				System.out.print("  ");
			}
			
			for(int j=1;j<=star;j++){
			System.out.print("* ");
			}
			
			System.out.println();
		    star+=2;
			space--;
		}
	}
	
	public static void p6(int n){
		System.out.print("\n----------------------------------------\n");
		int star=1;
		int space=n-1;
		
		for(int i=1;i<=n;i++){
			
			for(int k=1;k<=space;k++){
				System.out.print("  ");
			}
			
			for(int j=1;j<=star;j++){
			System.out.print("* ");
			}
			
			System.out.println();
		    star++;
			space--;
		}
	}
	
	public static void p7(int n){
		System.out.print("\n----------------------------------------\n");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || j==1 || i==n || j==n){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	
	public static void p8(int n){
		System.out.print("\n----------------------------------------\n");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || j==1 || i==n || j==n || j==i){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void p9(int n){
		System.out.print("\n----------------------------------------\n");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || j==1 || i==n || j==n || j==n-i+1){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	
	public static void p10(int n){
		System.out.print("\n----------------------------------------\n");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==n-i+1 || j==i){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void p11(int n){
		System.out.print("\n----------------------------------------\n");
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				
			if(j==1||j==i ||i==n){
			System.out.print("*");
			}
			
			else{
				System.out.print(" ");
			}
			
			}
			System.out.println();
		}
	}
	
	public static void  p12(int n){
		System.out.print("\n----------------------------------------\n");
		int star=1;
		int space=n-1;
		
		for(int i=1;i<=n;i++){
			
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				if(j==1 || j==star || i==n){
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
			star+=2;
			space--;
		}
	}
	
	public static void  p13(int n){
		System.out.print("\n----------------------------------------\n");
		int star=n;
		int space =0;
		
		for(int i=1;i<=n;i++){
			
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");				
			}
			System.out.println("");
			star--;
			space++;			
		}
		
		star=2;
		space=n-2;
		
		for(int i=1;i<=n-1;i++){
			
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++){
				System.out.print("*");				
			}
			System.out.println("");
			star++;
			space--;			
		}
		
	}
		
	public static void p14(int n){
		System.out.print("\n----------------------------------------\n");
		int star=1;
		int space=n-1;
		
		for(int i=1;i<=n;i++){
			
			for(int k=1;k<=space;k++){
				System.out.print("  ");
			}
			
			for(int j=1;j<=star;j++){
			System.out.print("* ");
			}
			
			System.out.println();
		    star+=2;
			space--;
		}
		
		star=2*n-3;
		space=1;
		
		for(int i=1;i<=n-1;i++){
			
			for(int k=1;k<=space;k++){
				System.out.print("  ");
			}
			
			for(int j=1;j<=star;j++){
			System.out.print("* ");
			}
			
			System.out.println();
		    star-=2;
			space++;
		}
		
	}
	
	
	public static void p15(int n){
		System.out.print("\n----------------------------------------\n");
		int star=1;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=star;j++){
				System.out.print(j);
			}
			System.out.println();
			star++;
		}
		
	}
	public static void main(String[] args) 
	{
		int n=5;
		p1(n);
		p2(n);
		p3(n);
		p4(n);
		p5(n);
		p6(n);
		p7(n);
		p8(n);
		p9(n);
		p10(n);
		p11(n);
		p12(n);
		p13(n);
		p14(n);
		p15(n);
	}
}
