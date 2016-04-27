
public class Controller {
	
	// window
	private Frame frame;
	
	
	// controller variables 
	private int currentChapter = 0;
	private int currentPage = 0;

	
	// sample data
	private String[][] sampleBook = {
			// 0:Front Content
			{
				// 0:Cover
				"Sample Book\n\nby Sir ABC DEF",
				
				// 1:Preface
				"This is a preface of this sample book.",
				
				// 2:Contents
				"\t\t\t\tContents\n\n\tContent\t\t\t\t\t\tPage\n\tChapter1\t\t\t\t\t\t0\n\tChapter2\t\t\t\t\t\t21\n\tChapter3\t\t\t\t\t\t42\n\tChapter4\t\t\t\t\t\t63\n\tChapter5\t\t\t\t\t\t84\n\tChapter6\t\t\t\t\t\t105\n\tChapter7\t\t\t\t\t\t126\n\tChapter8\t\t\t\t\t\t147\n\tChapter9\t\t\t\t\t\t168\n\tChapter10\t\t\t\t\t\t189\n\tChapter11\t\t\t\t\t\t210\n\tChapter12\t\t\t\t\t\t231\n\tAppendix\t\t\t\t\t\t252\n\tIndex\t\t\t\t\t\t253\n\tReference\t\t\t\t\t\t254"
			},
			
			// 1:Chapter 1
			{
				// 0:Begin Chapter Page
				"This is Chapter 1's Cover",
				
				// 1-20:Page 1-20
				"This is Chapter 1 Page 1",
				"This is Chapter 1 Page 2",
				"This is Chapter 1 Page 3",
				"This is Chapter 1 Page 4",
				"This is Chapter 1 Page 5",
				"This is Chapter 1 Page 6",
				"This is Chapter 1 Page 7",
				"This is Chapter 1 Page 8",
				"This is Chapter 1 Page 9",
				"This is Chapter 1 Page 10",
				"This is Chapter 1 Page 11",
				"This is Chapter 1 Page 12",
				"This is Chapter 1 Page 13",
				"This is Chapter 1 Page 14",
				"This is Chapter 1 Page 15",
				"This is Chapter 1 Page 16",
				"This is Chapter 1 Page 17",
				"This is Chapter 1 Page 18",
				"This is Chapter 1 Page 19",
				"This is Chapter 1 Page 20"
			},
			
			// 2:Chapter 2
			{
				"This is Chapter 2's Cover",

				// 1-20:Page 1-20",
				"This is Chapter 2 Page 1",
				"This is Chapter 2 Page 2",
				"This is Chapter 2 Page 3",
				"This is Chapter 2 Page 4",
				"This is Chapter 2 Page 5",
				"This is Chapter 2 Page 6",
				"This is Chapter 2 Page 7",
				"This is Chapter 2 Page 8",
				"This is Chapter 2 Page 9",
				"This is Chapter 2 Page 10",
				"This is Chapter 2 Page 11",
				"This is Chapter 2 Page 12",
				"This is Chapter 2 Page 13",
				"This is Chapter 2 Page 14",
				"This is Chapter 2 Page 15",
				"This is Chapter 2 Page 16",
				"This is Chapter 2 Page 17",
				"This is Chapter 2 Page 18",
				"This is Chapter 2 Page 19",
				"This is Chapter 2 Page 20"
			},
			
			// 3:Chapter 3
			{
				"This is Chapter 3's Cover",

				// 1-20:Page 1-20",
				"This is Chapter 3 Page 1",
				"This is Chapter 3 Page 2",
				"This is Chapter 3 Page 3",
				"This is Chapter 3 Page 4",
				"This is Chapter 3 Page 5",
				"This is Chapter 3 Page 6",
				"This is Chapter 3 Page 7",
				"This is Chapter 3 Page 8",
				"This is Chapter 3 Page 9",
				"This is Chapter 3 Page 10",
				"This is Chapter 3 Page 11",
				"This is Chapter 3 Page 12",
				"This is Chapter 3 Page 13",
				"This is Chapter 3 Page 14",
				"This is Chapter 3 Page 15",
				"This is Chapter 3 Page 16",
				"This is Chapter 3 Page 17",
				"This is Chapter 3 Page 18",
				"This is Chapter 3 Page 19",
				"This is Chapter 3 Page 20"
			},
			
			// 4:Chapter 4
			{
				"This is Chapter 4's Cover",

				// 1-20:Page 1-20",
				"This is Chapter 4 Page 1",
				"This is Chapter 4 Page 2",
				"This is Chapter 4 Page 3",
				"This is Chapter 4 Page 4",
				"This is Chapter 4 Page 5",
				"This is Chapter 4 Page 6",
				"This is Chapter 4 Page 7",
				"This is Chapter 4 Page 8",
				"This is Chapter 4 Page 9",
				"This is Chapter 4 Page 10",
				"This is Chapter 4 Page 11",
				"This is Chapter 4 Page 12",
				"This is Chapter 4 Page 13",
				"This is Chapter 4 Page 14",
				"This is Chapter 4 Page 15",
				"This is Chapter 4 Page 16",
				"This is Chapter 4 Page 17",
				"This is Chapter 4 Page 18",
				"This is Chapter 4 Page 19",
				"This is Chapter 4 Page 20"
			},
			
			// 5:Chapter 5
			{
				"This is Chapter 5's Cover",

				// 1-20:Page 1-20",
				"This is Chapter 5 Page 1",
				"This is Chapter 5 Page 2",
				"This is Chapter 5 Page 3",
				"This is Chapter 5 Page 4",
				"This is Chapter 5 Page 5",
				"This is Chapter 5 Page 6",
				"This is Chapter 5 Page 7",
				"This is Chapter 5 Page 8",
				"This is Chapter 5 Page 9",
				"This is Chapter 5 Page 10",
				"This is Chapter 5 Page 11",
				"This is Chapter 5 Page 12",
				"This is Chapter 5 Page 13",
				"This is Chapter 5 Page 14",
				"This is Chapter 5 Page 15",
				"This is Chapter 5 Page 16",
				"This is Chapter 5 Page 17",
				"This is Chapter 5 Page 18",
				"This is Chapter 5 Page 19",
				"This is Chapter 5 Page 20"
			},
			
			// 6:Chapter 6
			{
				"This is Chapter 6's Cover",

				// 1-20:Page 1-20",
				"This is Chapter 6 Page 1",
				"This is Chapter 6 Page 2",
				"This is Chapter 6 Page 3",
				"This is Chapter 6 Page 4",
				"This is Chapter 6 Page 5",
				"This is Chapter 6 Page 6",
				"This is Chapter 6 Page 7",
				"This is Chapter 6 Page 8",
				"This is Chapter 6 Page 9",
				"This is Chapter 6 Page 10",
				"This is Chapter 6 Page 11",
				"This is Chapter 6 Page 12",
				"This is Chapter 6 Page 13",
				"This is Chapter 6 Page 14",
				"This is Chapter 6 Page 15",
				"This is Chapter 6 Page 16",
				"This is Chapter 6 Page 17",
				"This is Chapter 6 Page 18",
				"This is Chapter 6 Page 19",
				"This is Chapter 6 Page 20"
			},
			
			// 7:Chapter 7
			{
				"This is Chapter 7's Cover",

				// 1-20:Page 1-20",
				"This is Chapter 7 Page 1",
				"This is Chapter 7 Page 2",
				"This is Chapter 7 Page 3",
				"This is Chapter 7 Page 4",
				"This is Chapter 7 Page 5",
				"This is Chapter 7 Page 6",
				"This is Chapter 7 Page 7",
				"This is Chapter 7 Page 8",
				"This is Chapter 7 Page 9",
				"This is Chapter 7 Page 10",
				"This is Chapter 7 Page 11",
				"This is Chapter 7 Page 12",
				"This is Chapter 7 Page 13",
				"This is Chapter 7 Page 14",
				"This is Chapter 7 Page 15",
				"This is Chapter 7 Page 16",
				"This is Chapter 7 Page 17",
				"This is Chapter 7 Page 18",
				"This is Chapter 7 Page 19",
				"This is Chapter 7 Page 20"
			},
			
			// 8:Chapter 8
			{
				"This is Chapter 8's Cover",

				// 1-20:Page 1-20",
				"This is Chapter 8 Page 1",
				"This is Chapter 8 Page 2",
				"This is Chapter 8 Page 3",
				"This is Chapter 8 Page 4",
				"This is Chapter 8 Page 5",
				"This is Chapter 8 Page 6",
				"This is Chapter 8 Page 7",
				"This is Chapter 8 Page 8",
				"This is Chapter 8 Page 9",
				"This is Chapter 8 Page 10",
				"This is Chapter 8 Page 11",
				"This is Chapter 8 Page 12",
				"This is Chapter 8 Page 13",
				"This is Chapter 8 Page 14",
				"This is Chapter 8 Page 15",
				"This is Chapter 8 Page 16",
				"This is Chapter 8 Page 17",
				"This is Chapter 8 Page 18",
				"This is Chapter 8 Page 19",
				"This is Chapter 8 Page 20"
			},
			
			// 9:Chapter 9
			{
				"This is Chapter 9's Cover",

				// 1-20:Page 1-20",
				"This is Chapter 9 Page 1",
				"This is Chapter 9 Page 2",
				"This is Chapter 9 Page 3",
				"This is Chapter 9 Page 4",
				"This is Chapter 9 Page 5",
				"This is Chapter 9 Page 6",
				"This is Chapter 9 Page 7",
				"This is Chapter 9 Page 8",
				"This is Chapter 9 Page 9",
				"This is Chapter 9 Page 10",
				"This is Chapter 9 Page 11",
				"This is Chapter 9 Page 12",
				"This is Chapter 9 Page 13",
				"This is Chapter 9 Page 14",
				"This is Chapter 9 Page 15",
				"This is Chapter 9 Page 16",
				"This is Chapter 9 Page 17",
				"This is Chapter 9 Page 18",
				"This is Chapter 9 Page 19",
				"This is Chapter 9 Page 20"
			},
			
			// 10:Chapter 10
			{
				"This is Chapter 10's Cover",

				// 1-20:Page 1-20",
				"This is Chapter 10 Page 1",
				"This is Chapter 10 Page 2",
				"This is Chapter 10 Page 3",
				"This is Chapter 10 Page 4",
				"This is Chapter 10 Page 5",
				"This is Chapter 10 Page 6",
				"This is Chapter 10 Page 7",
				"This is Chapter 10 Page 8",
				"This is Chapter 10 Page 9",
				"This is Chapter 10 Page 10",
				"This is Chapter 10 Page 11",
				"This is Chapter 10 Page 12",
				"This is Chapter 10 Page 13",
				"This is Chapter 10 Page 14",
				"This is Chapter 10 Page 15",
				"This is Chapter 10 Page 16",
				"This is Chapter 10 Page 17",
				"This is Chapter 10 Page 18",
				"This is Chapter 10 Page 19",
				"This is Chapter 10 Page 20"
			},
			
			// 11:Chapter 11
			{
				"This is Chapter 11's Cover",

				// 1-20:Page 1-20",
				"This is Chapter 11 Page 1",
				"This is Chapter 11 Page 2",
				"This is Chapter 11 Page 3",
				"This is Chapter 11 Page 4",
				"This is Chapter 11 Page 5",
				"This is Chapter 11 Page 6",
				"This is Chapter 11 Page 7",
				"This is Chapter 11 Page 8",
				"This is Chapter 11 Page 9",
				"This is Chapter 11 Page 10",
				"This is Chapter 11 Page 11",
				"This is Chapter 11 Page 12",
				"This is Chapter 11 Page 13",
				"This is Chapter 11 Page 14",
				"This is Chapter 11 Page 15",
				"This is Chapter 11 Page 16",
				"This is Chapter 11 Page 17",
				"This is Chapter 11 Page 18",
				"This is Chapter 11 Page 19",
				"This is Chapter 11 Page 20"
			},
			
			// 12:Chapter 12
			{
				"This is Chapter 12's Cover",

				// 1-20:Page 1-20",
				"This is Chapter 12 Page 1",
				"This is Chapter 12 Page 2",
				"This is Chapter 12 Page 3",
				"This is Chapter 12 Page 4",
				"This is Chapter 12 Page 5",
				"This is Chapter 12 Page 6",
				"This is Chapter 12 Page 7",
				"This is Chapter 12 Page 8",
				"This is Chapter 12 Page 9",
				"This is Chapter 12 Page 10",
				"This is Chapter 12 Page 11",
				"This is Chapter 12 Page 12",
				"This is Chapter 12 Page 13",
				"This is Chapter 12 Page 14",
				"This is Chapter 12 Page 15",
				"This is Chapter 12 Page 16",
				"This is Chapter 12 Page 17",
				"This is Chapter 12 Page 18",
				"This is Chapter 12 Page 19",
				"This is Chapter 12 Page 20"
			},
			
			// 13:Back Content
			{
				// 0:Appendix
				"This is an appendix of this sample book.",
				
				// 1:Index
				"This is an index of this sample book.",
				
				// 2:Reference
				"This is a reference of this sample book.",
				
				// 3:Back Cover
				"This is a back cover of this sample book."
			}
	};
	
	
	// constructor
	public Controller(Frame frame) {
		this.frame = frame;
	}
	
	
	// update GUI
	private void render() {
		frame.changeContent(sampleBook[currentChapter][currentPage]);
		
		if (currentChapter == 0) {
			frame.updateLocation(currentChapter, 0);
		} else {
			int overallPage = currentPage;
			
			for (int i = 1; i < currentChapter; i++) {
				overallPage += sampleBook[i].length;
			}
			frame.updateLocation(currentChapter, overallPage);
		}
	}
	
	
	// start or stop reading or repeating
	public void startReading() {
		frame.setReading();
	}
	
	public void stopReading() {
		frame.setNotReading();
	}
	
	public void repeating() {
		frame.setRepeating();
	}
	
	
	// next or previous page
	public void nextPage() {
		currentPage++;
		
		if (currentPage >= sampleBook[currentChapter].length) {
			nextChapter();
		} else {
			render();
		}
	}
	
	public void previousPage() {
		currentPage--;
		
		if (currentPage < 0) {			
			previousChapter();
			
			currentPage = sampleBook[currentChapter].length - 1;
			
			render();
		} else {
			render();
		}
	}
	
	
	// next or previous chapter
	public void nextChapter() {
		currentChapter++;
		currentPage = 0;
		
		if (currentChapter >= sampleBook.length) {
			goToBackCover();
		} else {
			render();
		}
	}
	
	public void previousChapter() {
		currentChapter--;
		currentPage = 0;
		
		if (currentChapter < 0) {
			goToFrontCover();
		} else {
			render();
		}
	}
	

	// go to ...
	public void goToFrontCover() {
		currentChapter = 0;
		currentPage = 0;
		
		render();
	}
	
	public void goToBackCover() {
		currentChapter = 13;
		currentPage = 3;
		
		render();
	}
	
	public void goToPreface() {
		currentChapter = 0;
		currentPage = 1;
		
		render();
	}
	
	public void goToContent() {
		currentChapter = 0;
		currentPage = 2;
		
		render();
	}
	
	public void goToAppendix() {
		currentChapter = 13;
		currentPage = 0;
		
		render();
	}
	
	public void goToIndex() {
		currentChapter = 13;
		currentPage = 1;
		
		render();
	}
	
	public void goToReference() {
		currentChapter = 13;
		currentPage = 2;
		
		render();
	}
	
	public void goToBeginOfChapter() {
		currentPage = 0;
		
		render();
	}
	
	public void goToEndOfChapter() {
		currentPage = sampleBook[currentChapter].length - 1;
		
		render();
	}
	
	public void goToPage(int page) {
		if (page < 0) {
			goToFrontCover();
		} else {
			int i = 1;
			
			for (i = 1; i < sampleBook.length; i++) {
				if (page >= sampleBook[i].length) {
					page -= sampleBook[i].length;
				} else {
					break;
				}
			}
			
			if (page >= sampleBook[i].length) {
				goToBackCover();
			} else {
				currentChapter = i;
				currentPage = page;
				
				render();
			}
		}		
	}
	
	public void goToChapter(int chapter) {
		if (chapter < 0) {
			goToFrontCover();
		} else if (chapter >= sampleBook.length) {
			goToBackCover();
		} else {
			currentChapter = chapter;
			currentPage = 0;
			
			render();
		}
	}
	
}
