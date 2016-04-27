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
        launch();
        while (true) {
            try {
                String s = outputStream.readLine();
                System.out.println(s);
                if (s.indexOf("SENT-START") == 0) {
                    int end = s.indexOf("SENT-END");
                    String input;
                    System.err.println(input = s.substring(0, end));
                    parser(input);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        HTKReader r = new HTKReader(null);
        r.run();
    }

    private void parser(String s) {
    	String[] l = s.split(" ");

        switch (l[1]) {
            case "read":
                control.startReading();
                break;
            case "stop":
                control.stopReading();
                break;
            case "continue":
                control.startReading();
                break;
            case "repeat":
                control.repeating();
                break;
            case "openTo":
            case "flipTo":
            case "goTo":
            case "goAt":
                switch (l[2]) {
                    case "cover":
                        control.goToFrontCover();
                        break;
                    case "contents":
                        control.goToContent();
                        break;
                    case "preface":
                        control.goToPreface();
                        break;
                    case "appendix":
                        control.goToAppendix();
                        break;
                    case "reference":
                        control.goToReference();
                        break;
                    case "index":
                        control.goToIndex();
                        break;
                    case "backCover":
                        control.goToBackCover();
                        break;
                    case "beginChapter":
                        control.goToBeginOfChapter();
                        break;
                    case "endChapter":
                        control.goToEndOfChapter();
                        break;
                    case "nextChapter":
                        control.nextChapter();
                        break;
                    case "previousChapter":
                        control.previousChapter();
                        break;
                    case "chapter":
                        String no = "";
                        for (int i = 3; i < l.length; i++) {
                            if (l[i].equals("one")) {
                                no += "1";
                            } else if (l[i].equals("two")) {
                                no += "2";
                            } else if (l[i].equals("three")) {
                                no += "3";
                            } else if (l[i].equals("four")) {
                                no += "4";
                            } else if (l[i].equals("five")) {
                                no += "5";
                            } else if (l[i].equals("six")) {
                                no += "6";
                            } else if (l[i].equals("seven")) {
                                no += "7";
                            } else if (l[i].equals("eight")) {
                                no += "8";
                            } else if (l[i].equals("nine")) {
                                no += "9";
                            } else if (l[i].equals("zero")) {
                                no += "0";
                            }
                        }
                        control.goToChapter(Integer.parseInt(no));
                        break;
                }
                break;
        }

    }
}
