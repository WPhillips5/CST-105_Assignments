
public abstract class Player {
	private String name;
	private String team;
	private String pos;
	private String comp;
	private String att;
	private String pct;
	private String attg;
	private String yds;
	private String avg;
	private String ydsg;
	private String td;
	private String intercept;
	private String first;
	private String firstp;
	private String lng;
	private String twenty;
	private String fourty;
	private String sck;
	private String rate;
	
	
	public Player(){}
	public Player(String name ,String team ,String pos ,String comp ,String att ,String pct ,String attg ,String yds ,String avg ,String ydsg ,String td ,String intercept ,String first ,String firstp ,String lng ,String twenthy ,String fourty ,String sck ,String rate){
		this.name = name;
		this.team = team;
		this.pos = pos;
		this.comp = comp;
		this.att = att;
		this.pct = pct;
		this.attg = attg;
		this.yds = yds;
		this.avg = avg;
		this.ydsg = ydsg;
		this.td = td;
		this.intercept = intercept;
		this.first = first;
		this.firstp = firstp;
		this.lng = lng;
		this.twenty = twenty;
		this.fourty = fourty;
		this.sck = sck;
		this.rate = rate;
		
		public String getName(){
			return this.name;
		}

		 public void setName(String name){
			 this.name = name;
		 }

		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			this.team = team;
		}
		public String getPos() {
			return pos;
		}
		public void setPos(String pos) {
			this.pos = pos;
		}
		public String getComp() {
			return comp;
		}
		public void setComp(String comp) {
			this.comp = comp;
		}
		public String getAtt() {
			return att;
		}
		public void setAtt(String att) {
			this.att = att;
		}
		public String getPct() {
			return pct;
		}
		public void setPct(String pct) {
			this.pct = pct;
		}
		public String getAttg() {
			return attg;
		}
		public void setAttg(String attg) {
			this.attg = attg;
		}
		public String getYds() {
			return yds;
		}
		public void setYds(String yds) {
			this.yds = yds;
		}
		public String getAvg() {
			return avg;
		}
		public void setAvg(String avg) {
			this.avg = avg;
		}
		public String getYdsg() {
			return ydsg;
		}
		public void setYdsg(String ydsg) {
			this.ydsg = ydsg;
		}
		public String getTd() {
			return td;
		}
		public void setTd(String td) {
			this.td = td;
		}
		public String getIntercept() {
			return intercept;
		}
		public void setIntercept(String intercept) {
			this.intercept = intercept;
		}
		public String getFirst() {
			return first;
		}
		public void setFirst(String first) {
			this.first = first;
		}
		public String getFirstp() {
			return firstp;
		}
		public void setFirstp(String firstp) {
			this.firstp = firstp;
		}
		public String getLng() {
			return lng;
		}
		public void setLng(String lng) {
			this.lng = lng;
		}
		public String getTwenty() {
			return twenty;
		}
		public void setTwenty(String twenty) {
			this.twenty = twenty;
		}
		public String getFourty() {
			return fourty;
		}
		public void setFourty(String fourty) {
			this.fourty = fourty;
		}
		public String getSck() {
			return sck;
		}
		public void setSck(String sck) {
			this.sck = sck;
		}
		public String getRate() {
			return rate;
		}
		public void setRate(String rate) {
			this.rate = rate;
		}


			}
