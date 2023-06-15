
class DistanceBwPoint
{
	public static void main(String args[])
	{int x1,y1,x2,y2;
		x1=45;y1=45;x2=89;y2=78; 
		double dis;
		dis=Math.sqrt((x1-x2)*(x1-x2)+(y2-y1)*(y2-y1));
		System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);

	}
}