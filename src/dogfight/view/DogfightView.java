package dogfight.view;

import java.lang.Runnable;
import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;


public class DogfightView implements IViewSystem , Runnable {
	
	
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfight, Observable obersvble){
		
	}
	
	public void run(){
		
	}
	
	public String displayMessage(String message){
		return message;
		
	}
	
	public void closeAll(){
		
	}

}
