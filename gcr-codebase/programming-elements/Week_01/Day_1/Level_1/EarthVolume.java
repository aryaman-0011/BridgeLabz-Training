public class EarthVolume {
    public static void main(String[] args) {

        // Radius of the Earth in kilometers
        double radiusKm = 6378;

        // Value of PI
        double pi = Math.PI;

        // Formula for volume of a sphere: (4/3) * π * r³
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Conversion: 1 kilometer = 0.621371 miles
        double radiusMiles = radiusKm * 0.621371;

        // Volume of Earth in cubic miles
        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles
        );
    }
}
