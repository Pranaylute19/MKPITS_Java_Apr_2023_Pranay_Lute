public class MainPolymorphism{
		public static void main(String[] args){
			
//String Overloading of two string			
		MultipleArgumentPolymorphism Poly=new MultipleArgumentPolymorphism();
			Poly.subtract("Pranay " , "pranay");
//Addition Of 3 number	Polymorphism Overloading	
		
			
		AdditionPolymorphism poly=new AdditionPolymorphism();	
			int sum=poly.additionInteger(6,7,7);
			System.out.println(sum);
			
// Substraction of 2 number Polymorphism overloading			
			
		SubstractionPolymorphism subpolymorphism=new SubstractionPolymorphism();
		 double substract=subpolymorphism.substraction(2,5);
		 int substract1=subpolymorphism.substraction(2,9);
 
		System.out.println(substract);
		System.out.println(substract1);
		
// shape		
		Shape shape=new Shape();
			shape.circle();
			
//Multiplication of 2/3 number polymorphism Overloading
				MultiplicationPolumorphism multiplication=new MultiplicationPolumorphism();
				int MultiplicationCal =multiplication.multiply(2,6);
				System.out.println(MultiplicationCal);
				
//Area of circle and Rectangle
         AreaPolymorphismOveloading area=new AreaPolymorphismOveloading();
			double areas= area.Area(5,8);
			System.out.println(areas);
			
//perimeter of rectangle and square		

		PerimeterPolymorphismOverloading perimeter=new PerimeterPolymorphismOverloading();
		int per=perimeter.Perimeter(2,5);
		System.out.println(per);
		
//kinetic and potential energy

          //for 3 argument you must first value put 9.8 because first value is Gravity
			EnergyPolymorphismOverloading energy=new EnergyPolymorphismOverloading();
			double ener=energy.Energy(9.8,8.1,9.2);
			System.out.println(ener);
					
    }
}
