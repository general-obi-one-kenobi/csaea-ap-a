// Tester class that updates attendance
public class AttendanceTester {
   public static void main(String[] args) {
      // write code to create two AttendanceRecord objects:
      AttendanceRecord jordan = new AttendanceRecord("Jordan",4); // one named "Jordan" with 4 days present
      AttendanceRecord riley = new AttendanceRecord("Riley",7); // one named "Riley" with 7 days present
 
      jordan.markPresent(); // mark Jordan present once more
 
      jordan.printAttendance();
riley.printAttendance(); // print attendance for both students
   }
}
