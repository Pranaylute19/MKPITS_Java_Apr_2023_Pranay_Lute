class EnergyPolymorphismOverloading{
	
		public double Energy(double gravityAcceleration, double mass , double velocity){
			return gravityAcceleration*mass*velocity;
		}
		public double Energy(double mass , double speed ){
				return 0.5*mass*speed*speed;
		}
}
