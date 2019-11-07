package project_test1;

public class StringBuilder_Insert {
    public static void main(String[] args) {
    	String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "YES" : "NO");	
    }


static String buildInsertSql(String table, String[] fields) {
    // TODO:
	StringBuilder sb = new StringBuilder(1024);
	sb.append("INSERT INTO ")
	  .append(table)
	  .append(" (")
	  .append(fields[0])
	  .append(", ")
	  .append(fields[1])
	  .append(", ")
	  .append(fields[2])
	  .append(") VALUES (?, ?, ?)");
    return sb.toString();
}
}
