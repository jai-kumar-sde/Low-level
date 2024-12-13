package Problems.SplitWise;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    private List<Group> groups;

    public GroupController() {
        this.groups = new ArrayList<>();
    }

    public void  addGroup(Group group){
        this.groups.add(group);
    }

    public Group getGroup(int groupId){
       return this.groups.get(groupId);
    }
}
