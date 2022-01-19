package Thread1;

public class Operation extends Thread{
     String operationName;
     int operationTime;

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    @Override
    public void run() {
        try{
            System.out.println("Operation " + operationName + ": started");
            for (int i = 0; i < operationTime; i++) {
                System.out.println("Operation " + operationName + ": " + (i+1) + " second");
            }
            System.out.println("  Operation " + operationName + ": finished");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
