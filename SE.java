class MyException extends Exception{
	String errmsg;
	
	public MyException(String errmsg)
	{
		this.errmsg=errmsg;
	}
	
	public void disperr()
	{
		System.out.println(errmsg);
	}
}

class Party
{
	String pname;
	int voteCount;
	Party(){
		pname="-";
		voteCount=0;
	}
	Party(String pname,int voteCount){
		this.pname=pname;
		this.voteCount=voteCount;
	}
	void display()
	{
		System.out.println("Party Name: "+pname);
		System.out.println("Vote Count: "+voteCount);	
	}
}

class Constituency
{
	String cname;
	Party parr[] = new Party[3];
	
	Constituency(){
		cname="-";
	}
	
	Constituency(String cname,Party[] parr)
	{
		this.cname=cname;
		for(int i=0;i<3;i++){
			this.parr[i]=parr[i];
		}
	}

	void display(){
		System.out.println("Constituency Name: "+cname);
		for(int i=0;i<3;i++){
			System.out.println("Party Name: "+parr[i].pname);
			System.out.println("Vote Count: "+parr[i].voteCount);	
		}
	}
	int getMaxVotes()
	{
		int max=Math.max(parr[0].voteCount,parr[1].voteCount);
		if(parr[2].voteCount > max)
			return parr[2].voteCount;
		else
			return max;
	}

	int getWinner() throws MyException
	{
		if(parr[0].voteCount<0 || parr[1].voteCount<0 || parr[2].voteCount<0)
			throw new MyException("Negative Number Exception");
		else if(parr[0].voteCount>parr[1].voteCount && parr[0].voteCount>parr[2].voteCount)
			return 0;
		else if(parr[1].voteCount>parr[2].voteCount)
			return 1;
		else
			return 2;
	}

}



abstract class State
{
	int cts;
	Constituency carr[]=new Constituency[3];
	abstract void display();
	abstract int getVoteCount();
}

class Maharashtra extends State{
	
	Maharashtra(){
		cts=3;
	}
	Maharashtra(int cts,Constituency[] carr){
		this.cts=cts;
		
		for(int i=0;i<cts;i++){
			this.carr[i]=carr[i];
		}
	}
	@Override
	void display(){
		for(int i=0;i<cts;i++){
			carr[i].display();
		}
	}

	@Override
	int getVoteCount(){
		int votes=0;
		for(int i=0;i<cts;i++){
			votes+=carr[i].getMaxVotes();
		}
		return votes;
	}
 	
 	void declareWinner() throws MyException
 	{
 		int f0=0;
 		int f1=0;
 		int f2=0;
 		
 		for(int i=0;i<cts;i++){
 			if(carr[i].getWinner()==0)
 				f0+=1;
 			else if (carr[i].getWinner()==1)
 				f1+=1;
 			else
 				f2+=1;
 		}
 		if(f0==f1 && f0==f2)
 			throw new MyException("Results Tied");
 		if(f0>f1 && f0>f2)
 			System.out.println("Winner is: "+carr[0].parr[0].pname);
 		else if(f1>f2)
 			System.out.println("Winner is: "+carr[0].parr[1].pname);
 		else
 			System.out.println("Winner is: "+carr[0].parr[2].pname);
 	}

}


class SE
{
	public static void main(String[] args) {
		Party p1 = new Party("BJP",100);
		Party p2 = new Party("SVS",20);
		Party p3 = new Party("INC",30);
		Party[] parr1={p1,p2,p3};

		Party p4 = new Party("BJP",80);
		Party p5 = new Party("SVS",123);
		Party p6 = new Party("INC",20);
		Party[] parr2={p4,p5,p6};

		Party p7 = new Party("BJP",45);
		Party p8 = new Party("SVS",155);
		Party p9 = new Party("INC",37);
		Party[] parr3={p7,p8,p9};
		
		Constituency c1 = new Constituency("XYZ",parr1);
		Constituency c2 = new Constituency("ABC",parr2);
		Constituency c3 = new Constituency("PQR",parr3);
		Constituency[] carr={c1,c2,c3};

		try{
			Maharashtra mh = new Maharashtra(3,carr);
			int a = mh.getVoteCount();
			System.out.println("Maharashtra winning constituencies total vote count: "+a);
			mh.declareWinner();
			mh.display();
		}
		catch(MyException e){
			e.disperr();
		}
		

	}
	
}