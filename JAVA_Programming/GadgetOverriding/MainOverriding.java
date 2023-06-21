class MainOverriding{
	public static void main(String []args){
		Vehicle1 vehicle=new Bike();
		vehicle.run();
		
		Hospital hospital=new Doctors();
		hospital.staff();
		
		House house=new Room();
		house.wall();
		
		
		ShapeOverriding shape=new CircleOverriding();
		shape.editor();
		
		 SubstractOverriding sub =new  SubstractOverriding();
		 SubstractOverriding1 sub1=new SubstractOverriding1();
		System.out.println( sub. Subtract( 2,3));
	    System.out.println( sub1. Subtract( 2.1f,3.4f));
		
		
		AdditionOverriding add=new AdditionOverriding1();
		float addit=add.addition(1,2);
		System.out.println(addit);
		
		Gadget gadget=new Mobile();
		gadget.electronics();
		
		Language language=new Java();
		language.coding();
		
		}
		}