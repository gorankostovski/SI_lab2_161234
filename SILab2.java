import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Time> timesList) {
        List<Integer> result = new ArrayList<>(); //0

        for (int i = 0; i < timesList.size(); i++) { //1
            int hr = timesList.get(i).getHours(); //2
            int min = timesList.get(i).getMinutes(); //3
            int sec = timesList.get(i).getSeconds(); //4
            if (hr < 0 || hr > 24){ //5
                if (hr < 0){ //6
                    throw new RuntimeException("The hours are smaller than the minimum"); //7
                }
                else { //8
                    throw new RuntimeException("The hours are grater than the maximum"); //9
                }
            }
            else if (hr < 24) { //10
                if (min < 0 || min > 59) //11
                    throw new RuntimeException("The minutes are not valid!"); //12
                else { //13
                    if (sec >= 0 && sec <= 59) //14
                        result.add(hr * 3600 + min * 60 + sec); //15
                    else //16
                        throw new RuntimeException("The seconds are not valid"); //17
                }
            } 
            else if (hr == 24 && min == 0 && sec == 0) { //18
                    result.add(hr * 3600 + min * 60 + sec); //19
            } 
            else { //20
                throw new RuntimeException("The time is greater than the maximum"); //21
            }
        }
        return result; //22
    }
} //23
