#include <iostream>

using namespace std;
template <class var>
class List{
public:
    int static const Length = 10 ;
    var List[Length];
    void insertion_sort (void);
private:
    void Swap(int a ,int b);
    int key;

} ;

template <class var>
void  List<var>::Swap(int a , int b)
{
    cout<<"you entered swap\n";
    var temp ;
    temp = List[a];
    List[a] = List[b];
    List[b] = temp;
}
template <class var>
void List<var>::insertion_sort(void)
{
    for(key=1 ; key<Length ;key ++ )
    {
        for(int i=0 ; i <=key ;i++)
            if(List[key-i] < List[key-i-1])
        {
            Swap(key-i,key-i-1);
        }
        else{break;}
    }
}
int main()
{
     List<int> L;
    for(int i=0 ; i<10 ; i++)
    {
        cout<<"List["<< i+1 <<"] =  ";
        cin>>L.List[i];
    }
    L.insertion_sort();
    for(int i=0 ; i<10 ; i++)
    {
        cout<<"list["<<i+1<<"] :" <<L.List[i] <<endl;
    }
    return 0;
}
