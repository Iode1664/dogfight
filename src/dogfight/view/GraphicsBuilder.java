package dogfight.view;

import java.awt.image.BufferedImage;

import game.frame.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder{

	public int Width;
	public int Height;
	//protected IDoghtFightModel dogfightModel;
	
	
	public GraphicsBuilder(IDogfightModel dogfightModel){
		
		/*this.dogfightModel = new IDogfightModel();
		this.dogfightModel.setGraphicsBuilder(this);*/
		
	}
	
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer){
		
	}
	
	private void buildEmptySky(){
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){
		
	}

	public int getWidth() {
		return Width;
	}

	public int getHeight() {
		return Height;
	}
	
	
	
}

	
	
	
	