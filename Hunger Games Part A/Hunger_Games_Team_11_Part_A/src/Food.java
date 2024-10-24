/*
 * аместгс йазлайалидгс┌ Aел: 9627 тгкежымо: 6980613638 webmail: anestisk@ece.auth.gr
 * йымстамтимос йакалаяас┌ аел:9716 тгкежымо: 6974965296 webmail: kkalamar@ece.auth.gr
 */

public class Food {

	int id;
	int x;
	int y;
	int points;
	
	/*
	 * id : food id
	 * x: position on X-axis
	 * y: position on Y-axis
	 * points: points a player gets picking up this food(between 1 and 10)
	 */
	
	// Constructors
	Food(int id,int x,int y,int points){
		this.id=id;
		this.x=x;
		this.y=y;
		this.points=points;
		
	}
	
	Food(Food a){
		this.id=a.id;
		this.x=a.x;
		this.y=a.y;
		this.points=a.points;
		
	}
	
	// Getters/Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	
}


