package java_professional.stream_methods;

import java.util.ArrayList;
import java.util.List;

public class TrafficAnalyser {
    private List<LineTrafficUsing> trafficList;

    public TrafficAnalyser() {
        this.trafficList = new ArrayList<LineTrafficUsing>();
    }

    public List<LineTrafficUsing> getTrafficList() {
        return trafficList;
    }

    public void setTrafficList(List<LineTrafficUsing> trafficList) {
        this.trafficList = trafficList;
    }
}
