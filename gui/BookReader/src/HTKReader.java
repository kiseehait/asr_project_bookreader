import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by innocenat on 2016-04-27.
 */
public class HTKReader implements Runnable {
    final String htkCommand = "C:\\Users\\innocenat\\Desktop\\HTK-Classroom\\htk-real\\12_LiveRecog.bat";
    final File workingDir = new File("C:\\Users\\innocenat\\Desktop\\HTK-Classroom\\htk-real");

    private BufferedReader outputStream;
    private Process process;
    private Controller control;

    public HTKReader(Controller control) {
        this.control = control;
    }

    public void launch() {
        ProcessBuilder builder = new ProcessBuilder(htkCommand);
        builder.directory(workingDir);
        try {
            process = builder.start();
            outputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                String s = outputStream.readLine();
                System.out.println(s);
                if (s.indexOf("SENT-START") == 0) {
                    int end = s.indexOf("SENT-END");
                    System.err.println(s.substring(0, end));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        HTKReader r = new HTKReader(null);
        r.launch();
        r.run();
    }
}
