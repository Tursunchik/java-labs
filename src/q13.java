
        import java.util.Scanner;

        public class q13 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int sizeOfVectors;
        
                do {
                    System.out.println("Size of the vectors:");
                    sizeOfVectors = sc.nextInt();
        
                    if (sizeOfVectors <= 0) {
                        System.out.println("Bye!");
                        break;
                    }
        
                    int[] result = new int[sizeOfVectors];
                     int [] x = new int[sizeOfVectors];
                     int [] y = new int[sizeOfVectors];
                     System.out.println("First vector (x):");
                    for (int i = 0; i < sizeOfVectors; i++) {
                        
                        x[i] = sc.nextInt();
                    }
                    System.out.println("Second vector (y):");
                    for (int i = 0; i < sizeOfVectors; i++) {
                        y[i] = sc.nextInt();
                    }
                        for(int i = 0; i < sizeOfVectors; i++){
                            int f = ((5 * x[i]) - (2 * y[i]))*2;
                            result[i] = f;
                        }
                    
                
                    System.out.print("Result: [");
                    for (int i = 0; i < sizeOfVectors; i++) {
                        if (i == sizeOfVectors - 1) {
                            System.out.print(result[i]);
                        } else {
                            System.out.print(result[i] + " ");
                        }
                    }
                    System.out.println("]");
        
                } while (sizeOfVectors > 0);
            } 
        }
