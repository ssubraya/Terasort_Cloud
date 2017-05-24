import java.util.ArrayList;


public class Order {
	public static ArrayList<Object> list_of_elements=new ArrayList<Object>();

	
	private static void Order(Object src[], Object tgt[], int l, int h){
		int length = h - l;
		int k=107000000;
		if (length < 7) {
			for (int i = l; i < h; i++){
				for (int j = i; j > l
						&& ((Comparable) tgt[j - 1]).compareTo(tgt[j]) > 0; j--){
			Object t = tgt[j];
			tgt[j] = tgt[j-1];
			tgt[j-1] = t;
				}
			}
			//list_of_elements.add(tgt.toString().toString());
			return ;
		} 
		int mid = (l + h) / 2;
		Order(tgt, src, l, mid);
		Order(tgt, src, mid, h);
		// If left subarray less than right subarray, copy src to dest.
		if (((Comparable) src[mid - 1]).compareTo(src[mid]) <= 0) {
			System.arraycopy(src, l, tgt, l, length);
			//list_of_elements.add(src.toString());
			return ;
		}
		for (int i = l, p = l, q = mid; i < h; i++){
			if (q >= h
					|| (p < mid && ((Comparable) src[p]).compareTo(src[q]) <= 0))
				{tgt[i] = src[p++];
				
				}
			else{
				tgt[i] = src[q++];
		
			}
			if(h==k && mid==k/2 && list_of_elements.size()<k)
			list_of_elements.add(tgt[i].toString());
			if(list_of_elements.size()==107000000){
				return;
			}
			}
			}
	
	public static void sort(Object[] a) {
		Object aux[] = (Object[]) a.clone();
		Order(aux, a, 0, a.length);
	}
}
