
public class ExpensiveObjectImpl implements ExpensiveObject {
	boolean config = false;
	
    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
    if (config) {
    	System.out.println("processing complete.");
    } else { 
    	System.out.println("The configuration hasn't loaded yet");
    }
    }

    private void heavyInitialConfiguration() {
    	System.out.println("Loading initial configuration..");
    	for (int i = 0; i < 10000000; i++) {
    		if (i % 1000000 == 0) {
    			System.out.println("Time elapsed: " + i/1000000 + " s");
    		}
    	} System.out.println("Configuration complete..");
    	config = true;
    }
}
