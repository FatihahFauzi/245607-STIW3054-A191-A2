package A2_245607;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    private static final ArrayList<Data> follower = new ArrayList<Data>();
    private static final ArrayList<Data> personalData = new ArrayList<Data>();


    public static void main(String[] args) throws IOException {
        ScraperDataSZ scraperDataSZ =new ScraperDataSZ();
        scraperDataSZ.ScraperDataSZ();
        System.out.println();
        System.out.println();
        TraceFollower traceFollower = new TraceFollower();
        TraceResult traceResult = new TraceResult();
        traceFollower.GetData();
        traceResult.GetData2();
        follower.addAll(traceFollower.getResult());
        follower.addAll(traceResult.getResult2());

        ExecutorService executor = Executors.newFixedThreadPool(follower.size());
        for(int i = 0; i < follower.size(); i++){
            String url = follower.get(i).getURL();
            ScraperData worker = new ScraperData(url, personalData);
            executor.execute(worker);
        }
        executor.shutdown();
        // Wait until all threads are finish
        while (!executor.isTerminated()){

        }

        Trace Print = new Trace();
        Print.Print(personalData);

        WriteToExcel excel = new WriteToExcel();
        try{
            excel.WriteToExcel(personalData);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void run() {

    }

}
