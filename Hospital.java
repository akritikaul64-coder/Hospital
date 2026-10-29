import java.util.Scanner;


class Hospital {
    Scanner sc = new Scanner(System.in);
    int[] PatientID = new int[100];
    String[] PatientName = new String[100];
    int[] Age = new int[100];
    String[] Gender = new String[100];
    String[] Disease = new String[100];
    String[] DoctorName = new String[100];
    int[] Priority = new int[100];
    int count;

void removePatient()
    {
        if(count==0)
        {
            System.out.println("No Queue Avil...");
        }
        else
        {
            System.out.println("Enter Id : ");
            int id=sc.nextInt();
            for(int i=0;i<count;i++)
            {
                if(PatientID[i]==id)
                {
                    for(int j=i;j<count-1;j++)
                    {
                        PatientID[j]=PatientID[j+1];
                        PatientName[j]=PatientName[j+1];
                        Age[j]=Age[j+1];
                        Gender[j]=Gender[j+1];
                        Disease[j]=Disease[j+1];
                        DoctorName[j]=DoctorName[j+1];
                        Priority[j]=Priority[j+1];
                    }
                    count--;
                    System.out.println("Patient Removed...");
                }
                else
                {
                    System.out.println("Id Not Match");
                }
            }
        }
    }

    void updatePatient() {
        if (count == 0) {
            System.out.println("No Queue ..");
        } else {
            System.out.println("Enter Id : ");
            int id = sc.nextInt();
            for (int i = 0; i < count; i++) {
                if (PatientID[i] == id) {
                    sc.nextLine();
                    System.out.println(" Add Patient name ");
                    PatientName[count] = sc.nextLine();

                    System.out.println(" Add Patient age ");
                    Age[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.println(" Add Patient gender ");
                    Gender[count] = sc.nextLine();

                    System.out.println(" Add Patient Disease ");
                    Disease[count] = sc.nextLine();

                    System.out.println(" Add Patient DoctorName ");
                    DoctorName[count] = sc.nextLine();

                    System.out.println(" Add Patient Priority (1 = Emergency, 2 = Normal) ");
                    Priority[count] = sc.nextInt();

                    System.out.println("Patient Data Updated...");
                }
                else
                {
                    System.out.println("Id Not Match");
                }
            }
        }
    }

    void searchPatient() {
        if (count == 0) {
            System.out.println("No Queue Avil...");
        } else {
            System.out.println("Enter Id : ");
            int id = sc.nextInt();
            for (int i = 0; i < count; i++) {
                if (PatientID[i] == id) {
                    System.out.println(" Patient id " + PatientID[i]);
                    System.out.println(" Patient name " + PatientName[i]);
                    System.out.println(" Patient age " + Age[i]);
                    System.out.println(" Patient Gender " + Gender[i]);
                    System.out.println(" Patient Disease " + Disease[i]);
                    System.out.println(" Patient DoctorName " + DoctorName[i]);
                    if (Priority[i] == 1) {
                        System.out.println("Emergency");
                    } else {
                        System.out.println("Normal");
                    }
                } else {
                    System.out.println("No Patient Found With this Id" + id);
                }
            }

        }
    }

    void viewPatient() {
        if (count == 0) {
            System.out.println("no record found....");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(" Patient id " + PatientID[i]);
                System.out.println(" Patient name " + PatientName[i]);
                System.out.println(" Patient age " + Age[i]);
                System.out.println(" Patient Gender " + Gender[i]);
                System.out.println(" Patient Disease " + Disease[i]);
                System.out.println(" Patient DoctorName " + DoctorName[i]);
                System.out.println(" Patient age " + Age[i]);

                if (Priority[i] == 1) {
                    System.out.println("Emergency");
                } else {
                    System.out.println("Normal");
                }

            }
        }
    }

    void addPatient() {
        System.out.println(" Add Patient id ");
        PatientID[count] = sc.nextInt();
        sc.nextLine();

        System.out.println(" Add Patient name ");
        PatientName[count] = sc.nextLine();

        System.out.println(" Add Patient age ");
        Age[count] = sc.nextInt();
        sc.nextLine();

        System.out.println(" Add Patient gender ");
        Gender[count] = sc.nextLine();

        System.out.println(" Add Patient Disease ");
        Disease[count] = sc.nextLine();

        System.out.println(" Add Patient DoctorName ");
        DoctorName[count] = sc.nextLine();

        System.out.println(" Add Patient Priority (1 = Emergency, 2 = Normal) ");
        Priority[count] = sc.nextInt();

        count++;
    }

    void menu() {
        System.out.println("========== HOSPITAL QUEUE MANAGEMENT SYSTEM ");
        System.out.println("1. Add Patient");
        System.out.println("2. View All Patients");
        System.out.println("3. Search Patient");
        System.out.println("4. Call Next Patient");
        System.out.println("5. View Waiting Queue");
        System.out.println("6. Sort Patients");
        System.out.println("7. Update Patient");
        System.out.println("8. Remove Patient");
        System.out.println("9. Hospital Report");
        System.out.println("10. Exit");
        System.out.println("========================");
    }

    public static void main(String args[]) {

        Hospital obj = new Hospital();
        int choice;

        do {
            obj.menu();
            System.out.println("Enter Choice : ");
            choice = obj.sc.nextInt();

            switch (choice) {
                case 1:
                    obj.addPatient();
                    break;
                case 2:
                    obj.viewPatient();
                    break;
                case 3:
                    obj.searchPatient();
                    break;
                case 7:
                    obj.updatePatient();
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 10);
    }
}