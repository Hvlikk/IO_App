package WorkersApiPrezenter.WorkersApi;

public interface IAvailabilityProvider {

	/**
	 * 
	 * @param WorkerId
	 * @param IAvailabilityModel
	 */
	boolean ChangeAvailability(integer WorkerId, int IAvailabilityModel);

}