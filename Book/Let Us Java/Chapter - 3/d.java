// in a town men percentage of men is 52. total literacy rate is 48. if total literate men is 35% of the total population find the illiterate men and woman in the town. town population is 80,000.
public class d {
    public static void main(String[] args) {
        final int totalPopulation = 80000;
        final int totalLiteracyRate = 48;
        final int totalMenPercentage = 52;
        final int totalLiterateMenPercentage = 35;
        final int totalLiterateWomenPercentage = totalLiteracyRate - totalLiterateMenPercentage;
        final int totalWomenPercentage = 100 - totalMenPercentage;
        final int totalLiterateMen = (totalLiterateMenPercentage * totalPopulation) / 100;
        final int totalLiterateWomen = (totalLiterateWomenPercentage * totalPopulation) / 100;
        final int totalIlliterateMen = (totalMenPercentage * totalPopulation) / 100 - totalLiterateMen;
        final int totalIlliterateWomen = (totalWomenPercentage * totalPopulation) / 100 - totalLiterateWomen;
        System.out.println("Illiterate men: " + totalIlliterateMen);
        System.out.println("Illiterate women: " + totalIlliterateWomen);
    }
}
