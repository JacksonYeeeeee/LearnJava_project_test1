package project_test1;
import java.util.StringJoiner;

public class StringJoiner_practice {
	public static void main(String []args){
	String[] fields = { "name", "position", "salary" };
    String table = "employee";
    String select = buildSelectSql(table, fields);
    System.out.println(select);
    System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "YES" : "NO");
	} 
    static String buildSelectSql(String table, String[] fields) {
        // TODO:
    	StringJoiner sj = new StringJoiner(", ","SELECT "," FROM "+table);
    	for(String fieldss:fields)
    	{
    		sj.add(fieldss);
    	}
    	//sj.add(table);
        return sj.toString();

     }
}
