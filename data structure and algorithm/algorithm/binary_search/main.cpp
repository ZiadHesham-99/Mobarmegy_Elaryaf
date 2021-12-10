#include<iostream>
using namespace std ;
int arr[9] ={1,2,3,4,5,6,7,8,9};
void binarySearch(int *arr ,int start ,int end ,int var)
{
    if(start<=end)
    {
        int mid = start + ((end-start)/2);
        if(arr[mid] == var)
        {cout<<"found the variable: ("<<var<<") at index "<<mid<<endl; return;}
        else if (arr[mid]<var)
        {
            binarySearch(arr , mid+1 , end ,var);
        }
        else{
            binarySearch(arr ,start , mid ,var);
        }


    }
    else{
        cout <<"There is no such value in that array "<<endl;
    }

}
int main (void)
{
    binarySearch(arr,0,8,0);

}