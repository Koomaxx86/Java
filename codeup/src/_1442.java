
public class _1442 {
public static void main(String[] args) {
	
//	#include <stdio.h> // ????
	int a[10001];
	int n, i, j, temp, min;

	    for (i=1; i<n; i++) {
	        min=i; // 비교하기위한 선택 i 값
	        for (j=i+1; j<=n; j++) {
	        	// 이 부분에 들어가야 될 코드를 작성하여 제출
	        	if(a[i] < j);

	        	
	        }
	        temp = a[i]; // i의 값을 temp에 임시 저장
	        a[i] = a[min]; // min(최소값)을 i에 저장
	        a[min] = temp; // temp의 임시값을 min에 저장
	    }
