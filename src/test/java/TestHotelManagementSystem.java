import org.example.HotelManagementSystem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestHotelManagementSystem {

    HotelManagementSystem hotelManagementSystem;
    @Before
    public void setup() {
         hotelManagementSystem = new HotelManagementSystem();
    }

    @Test
    public void validateName() throws Exception {

        Assert.assertTrue(hotelManagementSystem.validateName("abc"));
    }

    @Test
    public void validateAdhaar() throws Exception{
        Assert.assertTrue(hotelManagementSystem.validateAdhaarId("1234567891234567"));
    }

    @Test
    public void validateAddress() throws Exception{
        Assert.assertTrue(hotelManagementSystem.validateAddress("VashiGaonVashi"));
    }

    @Test
    public void validateNoOfPeople() throws Exception{
        Assert.assertTrue(hotelManagementSystem.validateNoOfPeople("2"));
    }



}