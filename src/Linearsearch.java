public class Linearsearch{


public static void search(int arr[],int key){

for(int i=0;i<arr.length;i++)
{

if(key==arr[i]){
return i;

}
else {
return -1;
}
}
public static void main(String args[]){

int arr[]={10,20,30,50};

int key=50;
search(arr,key);
}