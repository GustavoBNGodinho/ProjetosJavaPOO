package ExemplosPoo.MediaPlayer;

public class Duration {
    int time;
    int seconds;
    int minutes;
    int hours;

    Duration(int time) {
        this.time = time;
        hours = time/(3600);
        minutes = (time%3600)/60;
        seconds =(minutes%60);

    }

    public String toString() {
        String hours = String.format("%02d", this.hours);
        String minutes = String.format("%02d", this.minutes);
        String seconds = String.format("%02d", this.seconds);
        return hours + ":" + minutes + ":" + seconds;
    }

    int getTime() {
        return time;
    }

    Duration add(Duration duration) {
        return new Duration(time + duration.getTime());
    }

    public static void main(String[] args) {
        Duration d = new Duration(3661);
        System.out.println(d);
    }
}
