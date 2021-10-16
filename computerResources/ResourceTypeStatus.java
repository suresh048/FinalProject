package computerResources;

import java.util.Scanner;

public class ResourceTypeStatus implements State {

	@Override
	public void checkStatus(Context context) {
		// TODO Auto-generated method stub
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.print("-------Resources types-----\n" + 
		"1) Resource Selections \n" + "");
		
		System.out.print("");

		int input = usrInpt.nextInt();
		
		if(input ==1) {
			ViewResourceTypeState viewResources = new ViewResourceTypeState();
			viewResources.checkStatus(context);
		}
		
		else {
			System.exit(0);
		}
	context.setState(this);
	}

		
	}


