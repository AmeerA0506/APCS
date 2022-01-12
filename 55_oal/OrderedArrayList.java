// Team Aliens Arriving Naughtily: Nakib Abedin + Ameer Alnasser + Alif Rahman
// APCS pd06
// Lab02
// 2022-1-11
/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 **********************************************/
import java.util.ArrayList;
public class OrderedArrayList
{
 // instance of class ArrayList, holding objects of type Integer
 // (i.e., objects of a class that implements interface Integer)
 private ArrayList<Integer> _data;
 // default constructor
 // initializes instance variables
 public OrderedArrayList() {
    _data = new ArrayList<Integer>();
 }
// overloaded constructor which helps to initialize instance variable
 public OrderedArrayList(int length) {
   _data = new ArrayList<Integer>(length);
 }
// creates String version of ArrayList
 public String toString()
 {
   if (size() ==0) return "{}";
   String out = "";
  for (int e : _data) {
   out += ","+e;
   }
   return "{" + out.substring(1) + "}";
   }
   public void add(int x){
   addLinear(x);
  }
//Best Case: O(1) -> runs a get function, which is a constant execution time
//Worst Case: O(n) -> index not in list
 public Integer remove( int i )
 {
   Integer x = _data.get(i);
   _data.remove(i);
   return x;
   }
//Best Case: O(1) -> a property of arrayLIST, can never be different
//Worst Case: O(1) -> a property of arrayLIST, can never be different
public int size(){
   return _data.size();
   }

//Best Case: O(1) -> runs the get function from ArrayList, which is a constant execution time
//Worst Case: O(n) -> index not in list
public Integer get( int i ){
  return _data.get(i);
 }

//Best Case: O(1) -> Item is at beginning of list
//Worst Case: O(n) -> Item is at end of list
public void addLinear(Integer newVal){
 // if (size() == 0) {
 // _data.add(0, newVal);
 // return;
 // }
   for (int i = 0; i < _data.size(); i++) {
     if(get(i) > newVal) {
     _data.add(i, newVal);
     return;
     }
     }
   _data.add(size(), newVal);
   }
//Best Case: O(1) -> Item is at beginning of list,
//Worst Case: O(n) -> Item is at end of list, n is from the iteration being done for this
 public void addBinary(Integer newVal)
 {
 if (size() == 0) {
 _data.add(0, newVal);
 return;
 }
 _data.add(binarySearch(_data, 0, size(), newVal), newVal);
  for (int i = 0; i < _data.size(); i++) {
     if(get(i) > newVal) {
     add(i, newVal);
     return;
    }
 }
 add(size(), newElement);
 }
//helper method which searches
//Best Case: O(1) -> Item is at beginning of list
//Worst Case: O(log_2 (n)) -> Item is at end of list
 public int binarySearch(ArrayList<Integer> arr,int startIndex, int endIndex, int target)
 {
 int mid = (startIndex + endIndex) / 2;
 // base case:
 if (endIndex-startIndex == 1) { //if one element left in array
 return startIndex; //return that index
 }

 if (arr.get(mid-1) < target) {
 return binarySearch(arr, mid, endIndex, target);
 } else if ( arr.get(mid-1) == target){
 return mid;
 }
 else {
 return binarySearch(arr, startIndex, mid, target);
 }
 }
}//end class OrderedArrayList
