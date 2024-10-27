import java.util.ArrayList;
import java.util.List;

public class Assistant {
    private String assistantName;
    private List<Display> assignedDisplays;

    public Assistant(String assistantName) {
        this.assistantName = assistantName;
        this.assignedDisplays = new ArrayList<>();
    }

    public void assignDisplay(Display d) {
        assignedDisplays.add(d);
    }

    public void assist() {
        if (assignedDisplays.isEmpty()) {
            System.out.println("No displays");
        } else {
            int len = assignedDisplays.size() - 1;
            for (int i = 0; i < len; i++) {
                Display currentDisplay = assignedDisplays.get(i);
                Display nextDisplay = assignedDisplays.get(i + 1);

                System.out.println("Comparing display " + (i + 1) + " with display " + (i + 2) + ": ");
                currentDisplay.compareSize(nextDisplay);
                currentDisplay.compareSharpness(nextDisplay);
                System.out.println();
            }
        }
    }

    public Display buyDisplay(Display d) {
        if (assignedDisplays.remove(d)) {
            System.out.println(d.getModel() + " has been bought and removed from the list.");
            return d;
        } else {
            System.out.println(d.getModel() + " is not in the assigned displays.");
            return null;
        }
    }

    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    public List<Display> getAssignedDisplays() {
        return assignedDisplays;
    }

    public void setAssignedDisplays(List<Display> assignedDisplays) {
        this.assignedDisplays = assignedDisplays;
    }
}
