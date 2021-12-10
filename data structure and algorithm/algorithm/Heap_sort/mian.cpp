#include<iostream>
using namespace std ;
int arr[9] = {20,30,5,50,25,12,60,15,100};
void Swap(int *arr ,int a ,int b)
{
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] =temp;
}
void heapify (int *arr ,int parent ,int size)
{
    bool swap = false ;
    int largest = parent ; 
    int left = 2 * parent +1 ;
    int right = 2 * parent +2 ;
    if (left <= size && arr[left] > arr[largest])
    {
        largest = left ;
        swap = true;
    }
    if (right <= size && arr[right] > arr[largest])
    {
        largest = right  ;
        swap = true;
    }
    if(swap)
    {
        Swap(arr, parent , largest);
        /*call on heapify on affected subtree */
        heapify(arr , largest , size );

    }
}
void heapSort(int arr[], int size)
{
    
    for (int i = (size - 1 )/2; i >= 0; i--)
        heapify(arr , i , size );
    
    /*cout <<"\nafter heapifylist is :-\n";
    for(int i=0 ; i<9 ; i++)
    {
        cout<<'\t' <<arr[i] ;
    }*/
    // One by one extract an element from heap
    for (int i = size ; i > 0; i--) {
        // Move current root to end
        swap(arr[0], arr[i]);
        /*cout <<"\nswapped first and last  is :-\n";
         for(int i=0 ; i<9 ; i++)
        {
            cout<<'\t' <<arr[i] ;
        }*/
        // call max heapify on the reduced heap
        heapSort(arr, size-1);
    }
}


int main (void)
{
    cout <<"\nlist is :-\n";
    for(int i=0 ; i<9 ; i++)
    {
        cout<<'\t' <<arr[i] ;
    }
    heapSort(arr , 8 );
    cout <<"\nlist is :-\n";
    for(int i=0 ; i<9 ; i++)
    {
        cout<<'\t' <<arr[i] ;
    }
    return 0;
}
