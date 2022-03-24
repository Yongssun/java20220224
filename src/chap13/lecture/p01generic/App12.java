package chap13.lecture.p01generic;

import java.util.List;

public class App12 {
public static void main(String[] args) {
	List<?> list1=null;
	List<? extends Number> list2=null;
	List<? extends Integer> list3=null;
	List<Integer> list4=null;
	
	List<? super Integer> list5=null;
	List<? super Number> list6=null;
	List<Number> list7=null;
	
	//list7=list4; xxx
	list1= list2;
	list1= list5;
	list2= list3;
	list2= list7;
	
	list3= list4;
	
	list5=list4;
	
	list5=list6;
	
	list6=list7;
	
	
	list1=list2;
	list1=list3;
	list1=list4;
	list1=list5;
	list1=list6;
	list1=list7;
	
	list2=list1;
	list2=list3;
	list2=list4;
	list2=list5;
	list2=list6;
	list2=list7;
	
	list3=list1;
	list3=list2;
	list3=list4;
	list3=list5;
	list3=list6;
	list3=list7;
	
	list4=list1;
	list4=list2;
	list4=list3;
	list4=list5;
	list4=list6;
	list4=list7;
	
	list5=list1;
	list5=list2;
	list5=list3;
	list5=list4;
	list5=list6;
	list5=list7;
	
	list6=list1;
	list6=list2;
	list6=list3;
	list6=list4;
	list6=list5;
	list6=list7;
	
	list7=list1;
	list7=list2;
	list7=list3;
	list7=list4;
	list7=list5;
	list7=list6;
	
	
}
}
