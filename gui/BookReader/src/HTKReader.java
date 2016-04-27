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

    private void parser(String s) {
    	String[] l = s.split(" ");

    	if (l[1].equals("read")) {
    		control.startReading();
    	} else if (l[1].equals("stop")) {
    		control.stopReading();
    	} else if (l[1].equals("continue")) {
    		control.startReading();
    	} else if (l[1].equals("repeat")) {
    		control.repeating();
    	} else if (l[1].equals("openTo") || l[1].equals("flipTo") || l[1].equals("goTo") || l[1].equals("goAt")) {
    		if (l[2].equals("cover")) {
    			control.goToFrontCover();
    		} else if (l[2].equals("contents")) {
    			control.goToContent();
    		} else if (l[2].equals("preface")) {
    			control.goToPreface();
    		} else if (l[2].equals("appendix")) {
    			control.goToAppendix();
    		} else if (l[2].equals("reference")) {
    			control.gotoReference();
    		} else if (l[2].equals("index")) {
    			control.goToIndex();
    		} else if (l[2].equals("backCover")) {
    			control.goToBackCover();
    		} else if (l[2].equals("beginChapter")) {
    			control.goToBeginOfChapter();
    		} else if (l[2].equals("endChapter")) {
    			control.goToEndOfChapter();
    		} else if (l[2].equals("nextChapter")) {
    			control.nextChapter();
    		} else if (l[2].equals("previousChapter")) {
    			control.previousChapter();
    		} else if (l[2].equals("chapter")) {
    			String no = "";
                for (int i = 3; i < l.length - 1; i++) {
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
    		}
    	}

    }
}
