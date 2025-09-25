ISLU Student Portal - Data Files and Structures

Data file headers
- Database.txt: First two lines are a title and a format descriptor. Records follow as CSV with optional profile data after a pipe.
  - Header: "=== STUDENT DATABASE ==="
  - Format line: "Format: StudentID,LastName,FirstName,MiddleName,DateOfBirth,Password|ProfileKey=Value;..."

- paymentLogs.txt: First two lines are a title and a format descriptor. Amount may contain commas.
  - Header: "=== PAYMENT LOGS ==="
  - Format line: "Format: DateTime,Channel,Reference,Amount,StudentID"

- attendanceRecords.txt, courseSchedules.txt, gradeRecords.txt already include similar headers.

Parsing behavior
- DataManager skips lines starting with "===", "Format:", or "#", and blank lines.
- Payment amounts are parsed by joining tokens between reference and StudentID to preserve commas.

Data structures
- MySinglyLinkedList: Now implements Iterable, includes contains, clear, isEmpty.
- MyDoublyLinkedList: Iterable with typical deque operations.

Notes
- New records appended via DataManager will auto-create headers for missing/empty files.
