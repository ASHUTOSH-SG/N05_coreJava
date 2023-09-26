package org.tns.finalkeyword;

public class Circle extends Shape{

	 final float area =34.6f;
	// final method
	 
	 // can not override the final method from shape
	//final void printShapeType() {
	//	System.out.println(area+"sq.cm");
	//}
	 
	 private void printShapeType (float area) {
		 System.out.println(area+"sq.cm");
	 }
}
