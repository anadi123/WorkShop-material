package com.mphasis.cui;


		// TODO Auto-generated method stub

class Box {
	  double width;
	  double height;
	  double depth;

	  // construct clone of an object
	  Box(Box ob) { // pass object to constructor
		  
	  }

	  // constructor used when all dimensions specified
	  Box(double w,double h,double d){
		  this.width=w;
		  this.height=h;
		  this.depth=d;
	  }

	  // constructor used when no dimensions specified
	  Box() {
	    width = -1;  // use -1 to indicate
	    height = -1; // an uninitialized
	    depth = -1;  // box
	  }

	  // constructor used when cube is created
	  Box(double len) {
	    width = height = depth = len;
	  }

	  // compute and return volume
	  double volume() {
	    return width * height * depth;
	  }
	}

	// Here, Box is extened to include weight.
	class BoxWeight extends Box {
	  double weight; // weight of box
	  //box dim;
	  // constructor for BoxWeight
	  BoxWeight(double width1,double height1,double depth1,double weight1){
		  
		  super(width1,height1,depth1);
		  this.weight=weight1;
	  }
	  
	}
	  
	class Q1 { //class DemoBoxWeight
	  public static void main(String[] args) {
	    BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
	    BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
	    double vol;

	    vol = mybox1.volume();
	    System.out.println("Volume of mybox1 is " + vol);
	    System.out.println("Weight of mybox1 is " + mybox1.weight);
	    System.out.println();

	    vol = mybox2.volume();
	    System.out.println("Volume of mybox2 is " + vol);
	    System.out.println("Weight of mybox2 is " + mybox2.weight);
			  }
			}
	


