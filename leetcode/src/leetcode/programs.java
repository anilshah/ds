package leetcode;

public class programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,30,950,25,8,1,100,90,200,2,80};
		//int arr[] = {};
		getMaxProfit(arr);
	}

	
	static void getMaxProfit(int arr[]){
	
		if(arr!=null && arr.length>0){
			int tempSell=0, tempBuy=0, tempProfit=0, finalSell=0, finalBuy=0, finalProfit=0;
			for(int i=0; i<arr.length;i++){
				
				
				if(i==0){
					tempBuy = arr[i];
					continue;
				}
				if(arr[i]<tempBuy){
					tempBuy = arr[i];
					tempSell=0; tempProfit=0;
				
				}else{
					
					if(tempProfit==0){
						
						tempSell = arr[i];
						tempProfit = tempSell - tempBuy;
					}
					if(tempProfit<(arr[i]-tempBuy)){
						tempSell = arr[i];
						tempProfit = tempSell - tempBuy;
						
						
					}
					if(tempProfit>finalProfit){
						
						finalBuy = tempBuy;
						finalSell = tempSell;
						finalProfit = tempProfit;
					}
				}
				
			}
			System.out.println("finalBuy="+finalBuy+"=finalSell="+finalSell+"=finalProfit="+finalProfit);
		}
		else
		{
			System.out.println("no elements");
		}
		
	}
}
