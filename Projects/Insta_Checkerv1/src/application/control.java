package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class control {

	private String p;
	
	@FXML Label path;
	
    @FXML
    private TextArea yes;

    @FXML
    private TextArea no;
    @FXML private TextField thread;

   // Choose the file without reading ..
    @FXML
    void OnSelect() {
    	FileChooser fc = new FileChooser();
    	fc.getExtensionFilters().addAll(new ExtensionFilter("Only txt","*.txt"));
    	File sf = fc.showOpenDialog(null);
    	if(sf != null) {
    		path.setText(sf.getName());
    		this.p = sf.getAbsolutePath();
    	}else {
    		path.setText("Please Select any file");
    	}
    
    }
    

    public boolean get_content(String user) throws IOException {

    		try {
    			// Connect to URL and get info as HTML Source
    	    	URL url = new URL("https://www.instagram.com/"+user);
    	    	URLConnection uc = url.openConnection();
    	    	uc.connect();
    	
    	    	
    	    	if(uc instanceof HttpURLConnection) {
    	    		HttpURLConnection h = (HttpURLConnection) uc;
    	    		if(h.getResponseCode()==404) {
    	    			return true;
    	    	}
    		}
    	    	}
    	    	catch (Exception e) {
				
			}
    		
    		return false;
	}
    
    @FXML
    void OnCheck() throws IOException {
    	
    	

    	    	// Open file the read and test with URL
    	Scanner sc = new Scanner(new File(this.p));
    	try {
    		
    		 while(sc.hasNextLine()) {
				String user = sc.nextLine();
				int threads = Integer.parseInt(thread.getText()) ;
		    	Thread.sleep(threads);
		    	if(get_content(user)==true) {
		    		yes.appendText(user+"\n");;
		    	}else {
		    		no.appendText(user+"\n");
		    	}
		    	 }


    		
    		
    	}catch (Exception e) {
    		path.setText("There is Problem with the file");
		}
    
    	
    }
    

    

    

}
