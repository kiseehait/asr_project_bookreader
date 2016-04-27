import java.util.Scanner;

public class TestParser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            String e = s.nextLine();
            parser(e);
        }
    }

    private static void parser(String s) {
        String[] l = s.split(" ");

        if (l[1].equals("read")) {
            System.out.println("start read");
        } else if (l[1].equals("stop")) {
            System.out.println("stop read");
        } else if (l[1].equals("continue")) {
            System.out.println("start read");
        } else if (l[1].equals("repeat")) {
            System.out.println("repeat");
        } else if (l[1].equals("openTo") || l[1].equals("flipTo") || l[1].equals("goTo") || l[1].equals("goAt")) {
            if (l[2].equals("cover")) {
               System.out.println("go front cover");
            } else if (l[2].equals("contents")) {
               System.out.println("go content");
            } else if (l[2].equals("preface")) {
                System.out.println("go preface");
            } else if (l[2].equals("appendix")) {
                System.out.println("go appendix");
            } else if (l[2].equals("reference")) {
                System.out.println("go reference");
            } else if (l[2].equals("index")) {
                System.out.println("go index");
            } else if (l[2].equals("backCover")) {
                System.out.println("go back cover");
            } else if (l[2].equals("beginChapter")) {
                System.out.println("go begin chapter");
            } else if (l[2].equals("endChapter")) {
                System.out.println("go end chapter");
            } else if (l[2].equals("nextChapter")) {
                System.out.println("go next chapter");
            } else if (l[2].equals("previousChapter")) {
                System.out.println("go previous chapter");
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

                System.out.println("go chapter " + no);

            }
        }

    }
}