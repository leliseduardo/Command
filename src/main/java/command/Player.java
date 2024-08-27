package command;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Function> functions = new ArrayList<>();

    public void executeFunction(Function function) {
        this.functions.add(function);
        function.execute();
    }

    public void cancelLastFunction() {
        if (functions.size() != 0) {
            Function function = this.functions.get(this.functions.size() - 1);
            function.cancel();
            this.functions.remove(this.functions.size() - 1);
        }
    }
}
