public class RoboterArm {
    private AirportBaggageStorage airportBaggageStorage;
    private ConveyorBelt conveyorBelt;

    public RoboterArm(AirportBaggageStorage airportBaggageStorage, ConveyorBelt conveyorBelt) {
        this.airportBaggageStorage = airportBaggageStorage;
        this.conveyorBelt = conveyorBelt;
    }

    public void takeBaggageFromConveyorBelt(){
        if(!conveyorBelt.allBaggageItemsCheckedIn()){
            Baggage baggage = conveyorBelt.pullBaggage();

            if(baggage != null){
                airportBaggageStorage.storeBaggage(baggage);
            }
        }
    }


}
