public class WeatherData
{
    // Daily high temperatures, in order. Never null, no null elements.
    private ArrayList<Double> temps;


    public void cleanData(double low, double high)  {
        for (int i = temps.size() - 1; i >= 0 ; i --){
            if (temps.get(i) < low || temps.get(i) > high){
                temps.remove(i);
            }
        }
        return temps;
    }
    public int longestHotStreak(double limit)       {
        int current = 0;
        int longest = 0;
        for (int i = 0; i < temps.size(); i++){
            if (temps.get(i) > limit){
                current ++;
            }
            else {
                if (current > longest){
                    longest = current;
                }
                current = 0;
            }
        }
        return longest;

    }
}
