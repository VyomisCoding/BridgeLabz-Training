import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole>{
    private List<T> candidateList = new ArrayList<>();
    public void addResume(T candidate){
        candidateList.add(candidate);
    }
    public List<T> getAllResumes(){
        return candidateList;
    }
}
