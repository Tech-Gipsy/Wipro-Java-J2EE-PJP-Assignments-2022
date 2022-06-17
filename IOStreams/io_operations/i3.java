/*  
Write a program to count the occurrences of each word in an input file and write the word along with its corresponding count in an output file.

[Note: The words should be sorted alphabetically in the output file]

(Hint : Consider using Map Collection)

For Example, let's assume the following are the contents of inputFile.txt

Manoj works at Wipro
Katari works at Wipro
Sureka works at Wipro
Harish works at Wipro
Anitha works at Wipro
Janani works at Wipro

D:\&gt;Java FileWordCount inputFile.txt outputFile.txt

After Execution of the program the contents of outputFile.txt should be as below

Anitha : 1
Harish : 1
Janani : 1
Katari : 1
Manoj : 1
Sureka : 1
Wipro : 6
at : 6
works : 6 */
package IOStreams.io_operations;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
public class i3 {

    public static void main(String[] args) throws IOException {
        File f1 = new File(System.getProperty("user.dir") + "\\src\\IOStreams\\io_operations\\"+args[0]);
        File f2 = new File(System.getProperty("user.dir") + "\\src\\IOStreams\\io_operations\\"+args[1]);
        BufferedReader br = new BufferedReader(new FileReader(f1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
        Map<String, Integer> map = new TreeMap<>();

        String str;
        while ((str = br.readLine()) != null) {
            str = str.trim();
            String[] words = str.split(" ");

            for (String word : words) {
                if (!map.containsKey(word))
                    map.put(word, 1);
                else
                    map.put(word, map.get(word) + 1);
            }
        };

        Set<Entry<String, Integer>> set = map.entrySet();
        Iterator<Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Entry<String, Integer> me = it.next();

            bw.write(me.getKey() + " : " + me.getValue() + "\n");
        }

        br.close();
        bw.close();
    }
}
