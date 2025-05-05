public class Distance{
	public static void main(String[] args){
	String name="Eric";
	String fromcity="chennai", viacity="vellore", tocity="Banglore";
	double distancefromcitytoviacity=156.6;
	double distancefromviacitytocity=211.8;
	int timefromcitytoviacity=4*60+4;
	int timeviacitytocity=4*60+25;
	double totaldistance=distancefromcitytoviacity+distancefromviacitytocity;
	int totaltime=timefromcitytoviacity+timeviacitytocity;
	System.out.print("The name of the person is:"+name+"he travel from chennai to banglore via vellore distance of"+totaldistance+"in time of"+totaltime);
	}
}