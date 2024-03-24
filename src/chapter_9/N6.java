package chapter_9;

public class N6 {
    public static void main(String[] args) {

        StopWatch stopWatch  = new StopWatch();

        stopWatch.start();

        stopWatch.stop();


        System.out.println(stopWatch.getElapsedTime());



    }
}

class StopWatch {

    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    void start(){
        startTime = System.currentTimeMillis();
    }

    void stop(){
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return  endTime - startTime;
    }

}