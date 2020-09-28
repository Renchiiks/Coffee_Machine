class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (minutes == 59) {
            minutes = 0;
            if (hours == 12) {
                hours = 1;
            } else {
                hours++;
            }

        } else {
            minutes++;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.hours = 12;
        clock.minutes = 59;

        clock.next();
        System.out.println(clock.hours +" " + clock.minutes);
    }
}