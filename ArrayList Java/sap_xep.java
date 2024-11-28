import java.util.Scanner;

public class sap_xep {
    
    //Linear Sort
    public static void linearSort(int a[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
            System.out.println("Buoc " + (i+1) + " : ");
            for(int j=0;j<n;j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }

    // SELECTION SORT
    public static void selectionSort(int a[],int n){
        for(int i=0;i<n-1;i++){
            int min_pos=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_pos]){
                    min_pos=j;
                }
            }
            System.out.print("Buoc " + (i+1) +" : ");
            int tmp=a[i];
            a[i]=a[min_pos];
            a[min_pos]=tmp;
            for(int j=0;j<n;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }

    // INSERTION SORT
    public static void insertionSort(int a[],int n){
        System.out.println("Buoc 0: " + a[0]);
        for(int i=0;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                --j;
            }
            a[j+1]=key;
            System.out.print("Buoc " + (i+1) + ": ");
            for(int k=0;k<=i;k++){
                System.out.print(a[k]+ " ");
            }
            System.out.println();
        }
    }

    // BUBBLE SORT
    public static void bubbleSort(int a[],int n){
        int m=1;
        for(int i=0;i<n-1;i++){
            boolean ok=true;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                    ok=false;
                }
            }
            if(ok==true){
                break;
            }
            System.out.print("Buoc " + (m++) + ": ");
            for(int j=0;j<n;j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }

    // MERGE SORT
    public static void merge(int a[],int l,int m,int r){
        int n1=m-l+1,n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=a[i+l];
        }
        for(int i=0;i<n2;i++){
            R[i]=a[i+m+1];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                a[k++]=L[i++];
            }
            else a[k++]=R[j++];
        }
        while(i<n1) a[k++]=L[i++];
        while(j<n2) a[k++]=R[j++];
    }
    public static void mergeSort(int a[],int l,int r){
        if(l<r){
            int m=(l+r)/2;
            mergeSort(a, l, m);
            mergeSort(a, m+1, r);
            merge(a, l, m, r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        bubbleSort(a, n);
    }
}
