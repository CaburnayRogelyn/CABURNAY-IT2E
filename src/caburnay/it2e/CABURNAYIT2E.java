
package caburnay.it2e;


public class CABURNAYIT2E {
    int aid; String aname; String assignedT; String dueDate; String apriority; String astatus;

    
    public static void main(String[] args) {
    
        public CABURNAYIT2E (int id, String name, String assigned, String DueDate, String priority, String Status){
            
            this.aid = id;
            this.aname = name;
            this.assignedT = assigned;
            this.dueDate = DueDate;       
            this.apriority  = priority;
            this.astatus = Status;       
    }
    
        
        public void viewCABURNAYIT2E(){
          
            System.out.println("%-5d %-10s %-10s %-10s %-10s %-10s \n ", aid,aname,assignedT,dueDate,apriority,astatus);
        }
}
}