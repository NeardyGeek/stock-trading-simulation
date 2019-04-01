package Plattern;
import java.text.*;

public class Stats {
	public int numberOfTrades, numberLong, numberShort, numberWinners, numberLosers;
	public int longWinners, longLosers, shortWinners, shortLosers;
	public int numberDays, numberLongDays, numberShortDays;
	double totalWinnings, totalLoss, totalLongWinnings, totalLongLoss, totalShortWinnings;
	double totalShortLoss;
	
	public Stats() {
		numberOfTrades= numberLong= numberShort= numberWinners= numberLosers = 0;
		longWinners= longLosers= shortWinners= shortLosers = 0;
		numberDays= numberLongDays= numberShortDays=0;
		totalWinnings= totalLoss= totalLongWinnings= totalLongLoss= totalShortWinnings = 0.0;
		totalShortLoss = 0.0;
		
	}
	
	public String toString() {
		
		
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		double AveragePLpercent = (totalWinnings - totalLoss) / numberOfTrades;
		
		double AveragePLshort = (totalShortWinnings - totalShortLoss )/ numberShort;
		double AveragePLlong = (totalLongWinnings - totalLongLoss)/numberLong;
		double AverageHoldingPeriod = (double)numberDays/numberOfTrades;
		double PercentWinners = (double)numberWinners/numberOfTrades*100.0;
		double PercentLongwinners = (double)longWinners/numberLong * 100.0;
		double PercentShortwin = (double)shortWinners/numberShort*100.0;

	
				
		String s =numberOfTrades + "\t\t"+ numberLong + "\t\t" + numberShort + "\t\t\t" + df.format(PercentWinners)
					+ "\t\t\t" + df.format(AveragePLpercent) + "\t\t\t" + df.format(AverageHoldingPeriod) + "\t\t\t" + df.format(PercentLongwinners)
					+ "\t\t\t" + df.format(PercentShortwin) + "\t\t\t" + df.format(AveragePLlong) + "\t\t" + df.format(AveragePLshort);
	
				
				
				
				
		/*
		String s = "\tNumOfTrades:"+numberOfTrades + " "+"Winners:" + df.format(PercentWinners)+"%"
				+ "\tAvrgProfit: " +df.format(Averageprofit) + "\t\tLongwinners: " +df.format(PercentLongwinners)+"%" + 
				"\tAvrgProfitWinner: "+ df.format(AverageProfitWinners) + "\tNumOfShort:" + numberShort + 
				"\tShortwinners: " + PercentShortwin+"%" + "\tAvrgProfitShort:"+df.format(AverageProfitShort) + 
				"\tAvrgProfitLong:"+df.format(AverageProfitLong) +"\t\tAvrgHoldingPeriod: "+ AverageHoldingPeriod;
		*/
		
		return s;
	}

}
