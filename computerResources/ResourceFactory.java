package computerResources;

import java.util.Scanner;

public class ResourceFactory {
	public void chooseResource() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\n------------Select Resource Type----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) Display Resources\n"+
		"2) Processor Resources\n"+"");
		
		
		int resourceChoice = input.nextInt();
		
		
		if(resourceChoice ==1) {
			DisplayType displayType = new DisplayType();
			PrintDisplayTypes printDisplayTypes = new PrintDisplayTypes(displayType);
			
			printDisplayTypes.printType();
		}
		if (resourceChoice ==2) {
			ProcessorType processorType = new ProcessorType();
			PrintProcessorTypes printProcessorTypes=new PrintProcessorTypes(processorType);
			
			printProcessorTypes.printType();
		}
		
		
		Context context = new Context();
		
		
	}
}



