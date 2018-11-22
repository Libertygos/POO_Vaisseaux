
public class Planet extends Playable {
	private boolean is_original;
	private int owner; //-1 IA, 0 neutral, 1 human
	private int production_capacity;
	private int take_off_capacity;
	private int status; //-1 take off, 0 peace, 1 under attack
	private int pos_x;
	private int pos_y;
	
	public Planet(boolean is_original, int owner, int production_capacity) {
		this.is_original = is_original;
		if (!is_original) {
			this.owner = 0;
		}
		else {
			this.owner = owner;
		}
		this.production_capacity = production_capacity;
	}

	public boolean isIs_original() {
		return is_original;
	}

	public void setIs_original(boolean is_original) {
		this.is_original = is_original;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public int getProduction_capacity() {
		return production_capacity;
	}

	public void setProduction_capacity(int production_capacity) {
		this.production_capacity = production_capacity;
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

	public int getTake_off_capacity() {
		return take_off_capacity;
	}

	public void setTake_off_capacity(int take_off_capacity) {
		this.take_off_capacity = take_off_capacity;
	}
}
