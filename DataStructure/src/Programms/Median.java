package Programms;

import java.util.Arrays;
import java.util.List;

public class Median {
	
	public static void main(String[] args) {
		
		int[] i= {1,3,5};
		int[] j= {2,4,6};
		int x=i.length+j.length;
		int m[]=new int[6];
	
		int n=0;
		for (int k = 0; k < i.length; k++) {
			 int l=i[k];
			for (int z = 0; z < j.length; z++) {
				if(l>=j[z]) {
					m[n++]=j[z];
					break;
				}else {
					m[n++]=l;
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(m));
	}

}
