/*
* This class creates a truck which is a type of vehicle.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-12-17
*/

public class Truck extends Vehicle {
  // Initializing fields
  private String plateNum;

  /**
   * Setting field values with a constructor. Also assigns the trucks colour
   * to a constant in this subclass
   */
  public Truck(String truckColour) {
    super(truckColour);
    this.colour = truckColour;
    plateNum = "";
  }

  /**
   * This setter sets the plate number of the truck.
   */
  public void setPlates(String userPlateNum) {
    this.plateNum = userPlateNum;
  }

  /**
   * This getter gets the plate number of the truck.
   */
  public String getPlates() {
    return plateNum;
  }
  
  /**
   * method to return the honking noise of the truck.
   */
  public String callHonk() {
    String honkNoise = ("HONK!");
    return honkNoise;
  }
}