public class TicketSorter{
    public static void quickSort(Ticket[] tickets, int low, int high){   // Quick Sort
        if(low < high){
            int pivotIndex = partition(tickets, low, high);
            quickSort(tickets, low, pivotIndex - 1);
            quickSort(tickets, pivotIndex + 1, high);
        }
    }
    
    private static int partition(Ticket[] tickets, int low, int high){   // Partition logic
        double pivot = tickets[high].price;    // choose last element as pivot
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(tickets[j].price <= pivot){
                i++;
                swap(tickets, i, j);
            }
        }
        swap(tickets, i + 1, high);
        return i + 1;
    }
    private static void swap(Ticket[] tickets, int i, int j){
        Ticket temp = tickets[i];
        tickets[i] = tickets[j];
        tickets[j] = temp;
    }
}
