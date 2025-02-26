class Solution {
    public double[] convertTemperature(double celsius) {
        double kel,fah;
        kel = celsius + 273.15;
        fah = (celsius * 1.8) + 32;

        return new double [] {kel,fah};
    }
}