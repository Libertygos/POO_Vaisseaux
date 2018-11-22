
public class Spaceship extends Playable {
	private int speed;
	private int production_time;
	private int attack;
	private int owner;
	private int status;
	private boolean is_alive;
	private int pos_x;
	private int pos_y;
	private int type;
	
	public Spaceship(int speed, int production_time, int attack, int owner, int status, boolean is_alive, int pos_x,
			int pos_y, int type) {
		this.speed = speed;
		this.production_time = production_time;
		this.attack = attack;
		this.owner = owner;
		this.status = status;
		this.is_alive = is_alive;
		this.pos_x = pos_x;
		this.pos_y = pos_y;
		this.type = type;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getProduction_time() {
		return production_time;
	}
	
	public void setProduction_time(int production_time) {
		this.production_time = production_time;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getOwner() {
		return owner;
	}
	
	public void setOwner(int owner) {
		this.owner = owner;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public boolean isIs_alive() {
		return is_alive;
	}
	
	public void setIs_alive(boolean is_alive) {
		this.is_alive = is_alive;
	}
	
	public int getPos_x() {
		return pos_x;
	}
	
	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}
	
	public int getPos_y() {
		return pos_y;
	}
	
	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}

}