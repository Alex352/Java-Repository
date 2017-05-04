package excersises;
import java.util.Scanner;
public class TestScoreStats {

 
		// TODO Auto-generated method stub
		 private int total;  
		   private int count;  
		   private int highest; 
		   private int lowest;  

		   public void TestScoreStatistics()
		   {
		      this.total = 0;
		      this.count = 0;
		      this.highest = 0;
		      this.lowest = 0;
		   }
		   public int getCount()
		   {
		      return this.count;
		   }
		   public int getHighest()
		   {
		      return this.highest;
		   }
		   public int getLowest()
		   {
		      return this.lowest;
		   }
		   public double average()
		   {
		      if (this.count == 0)
		         return 0.0;
		         
		      return (double)this.total / this.count;
		   }
		   public void addScore(int score)
		   {
		      if (score < 0 || score > 100)
		         throw new RuntimeException("Invalid Test Score: " + score);
		      
		      this.count = this.count + 1;
		      this.total = this.total + score;
		      
		      if (this.count == 1 || score > this.highest)
		         this.highest = score;
		      
		      if (this.count == 1 || score < this.lowest)
		         this.lowest = score;
	
	
	
	
	}
}