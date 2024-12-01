import java.util.*;
class Product 
{
private long Id,PurchasePrice,SalePrice,ProfiteMargin;
private  String DelerName,Name;


	public void setDelerName(String  DelerName)
	{
		this.DelerName=DelerName;
	}
	
	public String getDelerName()
	{
		return DelerName;
	}



	public void setName(String  Name)
	{
		this.Name=Name;
	}
	
	public String getName()
	{
		return Name;
	}
	public void setId(long Id)
	{
		this.Id=Id;
	}
	
	public long getId()
	{
		return Id;
	}
	
	
	public void setPurchasePrice(long PurchasePrice)
	{
		this.PurchasePrice=PurchasePrice;
	}
	
	public long getPurchasePrice()
	{
		return PurchasePrice;
	}
	
	public void setSalePrice(long SalePrice)
	{
		this.SalePrice=SalePrice;
	}
	
	public long getSalePrice()
	{
		return SalePrice;
	}
	
	
	public void setProfiteMargin(long ProfiteMargin)
	{
		this.ProfiteMargin=ProfiteMargin;
	}
	
	public long getProfiteMargin()
	{
		return ProfiteMargin;
	}
	
}

class Shop
{
Product p[];

Scanner xyz=new Scanner(System.in);
void  ProductDetails(Product p[])
	{
		System.out.println("enter the login name employ /owner");
		 String Login=xyz.nextLine();
		
		if(Login.equals("employ"))
		{
			System.out.println("_________________________________________________________________________________________________________");
			System.out.println("\t\t\tProduct Name\t\t\t Sale Price");
			
			for(int i=0;i<p.length;i++)
			{
				
				System.out.println("\t\t\t"+p[i].getName()+"\t\t\t"+p[i].getSalePrice());
			}
		}
		else if(Login.equals("owner"))
		{
		
		System.out.println("_________________________________________________________________________________________________________");
		System.out.println("\t\tId\t\tPurchasePrice\t\tSalePrice\t\tProfiteMargin \t\tDelerName\t\t\t Name");
		
		
			for(int i=0;i<p.length;i++)
			{
				
				System.out.println("\t\t"+p[i].getId()+"\t\t\t"+p[i].getPurchasePrice()+"\t\t\t"+p[i].getSalePrice()+"\t\t"+p[i].getProfiteMargin()+"\t\t\t"+p[i].getDelerName()+"\t\t\t\t"+p[i].getName());
			}
	
					
		}
		else{
			System.out.println("Invalid input ");
		}
	}
	
}

public class ShopManagement
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner (System.in);
		
		System.out.println("enter the number of product ");
		int size=xyz.nextInt();
		
		Product p[]=new Product[size];
		for(int i=0;i<p.length;i++)
		{
		System.out.println("_________________________________________________________________________________________________________");
			System.out.println("enter the product Id ");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("enter the product Name ");
			String name=xyz.nextLine();
			
			System.out.println("enter the product PurchasePrice ");
			int P_price=xyz.nextInt();
			
			System.out.println("enter the product SalePrice");
			int S_price=xyz.nextInt();
xyz.nextLine();
		System.out.println("enter the deler name ");
				String D_Name=xyz.nextLine();
				
				System.out.println("enter the product ProfiteMargin");
				int P_margin=xyz.nextInt();
				
				
			p[i]=new Product();
			p[i].setDelerName(D_Name);
			p[i].setId(id);
			p[i].setName(name);
			p[i].setProfiteMargin(P_margin);
			p[i].setPurchasePrice(P_price);
			p[i].setSalePrice(S_price);
			
		}
		Shop s = new Shop();
		
		
		//s.ShowProductDetails(p);
		s.ProductDetails(p);
		
	}
}