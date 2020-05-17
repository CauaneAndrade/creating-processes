import java.io.*;

public class OSProcess {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java OSProcess <command>");
            System.exit(0);
        }

        // args[0] is the command
        ProcessBuilder pb = new ProcessBuilder(args[0]);
        process proc = pb.start();

        // obtain the input stream
        InputStrem is = proc.getInputStream();
        InputStremReader isr = new InputStremReader(is);
        BufferedReader br = new BufferedReader(isr);

        // read what is returned by the command
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);

        br.close();
    }
}