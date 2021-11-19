#include <iostream>

using namespace std;
int arr[]={2,8,5,3,9,4,1,7};
int Merge (int *arr ,int left ,int right)
{
    int Size = (right-left)+1;
    int temp[Size];
    int i=0 ;
    int j=Size/2;
    int k=left;
    for(int m =0 ;m<Size ; m++){temp[m]=arr[k++];}
    k=left;
    while(i< Size/2 && j <Size)
    {
        if(temp[i]<temp[j])
        {
            arr[k++]=temp[i++];
        }
        else{arr[k++]=temp[j++];}
    }

    while(i<Size/2)
    {
        arr[k++] = temp[i++];
    }

    while(j<Size)
    {
        arr[k++] = temp [j++];
    }

}
void mergeSort(int *arr , int left,int right)
{
    if(left<right)
       {
           int mid = (right+left) / 2;
            mergeSort(arr , left , mid);
            mergeSort(arr , mid+1 , right);
            Merge(arr ,left ,right);
       }
}

int main()
{
    cout<<"The  list is :\t";
    for(int i=0 ; i<8 ; i++)
        cout<<'\t'<<arr[i];
    cout<<'\n';
    mergeSort(arr,0,7);
    cout<<"The sorted list is :";
    for(int i=0 ; i<8 ; i++)
        cout<<'\t'<<arr[i];
    return 0;
}
