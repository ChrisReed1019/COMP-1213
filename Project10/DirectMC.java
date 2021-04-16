import java.text.DecimalFormat;

/**
 * DirectMC class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-29-2021
 */
public class DirectMC extends MarketingCampaign {
   private double costPerMailPiece;
   private int numberOfMailPieces;
   /**
    * Base cost of marketing campaign.
    */
   public static final double BASE_COST = 1000;

   /**
    * Base constructor for DirectMC.
    * @param nameIn Name of object.
    * @param revenueIn Revenue of object.
    * @param costPerMailPieceIn Double for costPerMailPiece.
    * @param numberOfMailPiecesIn Int for numberMailPiece.
    */
   public DirectMC(String nameIn, double revenueIn,
                  double costPerMailPieceIn, int numberOfMailPiecesIn) {
      super(nameIn, revenueIn);
      costPerMailPiece = costPerMailPieceIn;
      numberOfMailPieces = numberOfMailPiecesIn;
   }

   /**
    * Returns the variable costPerMailPiece.
    * @return Variable costPerMailPiece.
    */
   public double getCostPerMailPiece() { return costPerMailPiece; }

   /**
    * Returns the variable numberOfMailPieces.
    * @return Variable numberOfMailPieces.
    */
   public int getNumberOfMailPieces() { return numberOfMailPieces; }

   /**
    * Sets the variable costPerMailPiece.
    * @param costPerMailPieceIn Variable to set costPerMailPiece as.
    */
   public void setCostPerMailPiece(double costPerMailPieceIn) { 
      costPerMailPiece = costPerMailPieceIn; 
   }

   /**
    * Sets the variable numberMailPiece.
    * @param numberOfMailPiecesIn Variable to set numberMailPiece as.
    */
   public void setNumberOfMailPieces(int numberOfMailPiecesIn) { 
      numberOfMailPieces = numberOfMailPiecesIn; 
   }

   /**
    * Calculates cost of campaign.
    * @return Double of cost of campaign.
    */
   public double campaignCost() {
      return BASE_COST + (costPerMailPiece * numberOfMailPieces);
   }

   /**
    * ToString method of DirectMC.
    * @return String representation of DirectMC.
    */
   public String toString() {
      DecimalFormat monetaryFormat = new DecimalFormat("$#,##0.00");
      String output = super.toString() + "\n   ";
      output += "Base Cost: " + monetaryFormat.format(BASE_COST) + "\n   ";
      output += "Mail Cost: "
              + monetaryFormat.format(numberOfMailPieces * costPerMailPiece);
      output += " = " + monetaryFormat.format(costPerMailPiece)
              + " per mail piece * ";
      output += numberOfMailPieces + " mail pieces";

      return output;
   }
}