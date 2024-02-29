import java.util.ArrayList;
import java.util.StringTokenizer;

public class Path {

    ArrayList<Instruction> instructions;
    String fileName;
    public Path(String x, String fileName)
    {
        this.fileName = fileName;
        instructions = new ArrayList<Instruction>();
        StringTokenizer st = new StringTokenizer(x," ");  
        int number = 1;
        String d = "";
        int v = 0;
        while (st.hasMoreTokens()) 
        {  
            if(number % 2 != 0)
            {
                d = st.nextToken();
                number++;
            }
            else
            {
                v = Integer.valueOf(st.nextToken());
                number++;
                Instruction i = new Instruction(d, v);
                instructions.add(i);
            }
        } 
    }
}
