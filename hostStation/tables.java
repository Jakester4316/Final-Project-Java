package hostStation;

class tableInfo {
  public static void main(String args[]) {
    tables tabN[] = new tables[8];

    tabN[0] = new tables(1, 0);
    tabN[1] = new tables(2, 4);
    tabN[2] = new tables(3, 2);
    tabN[3] = new tables(4, 0);
    tabN[4] = new tables(5, 3);
    tabN[5] = new tables(6, 0);
    tabN[6] = new tables(7, 1);
    tabN[7] = new tables(8, 0);

    for(int i=0; i < tabN.length; i++) tabN[i].show();
  }


class tables implements tableIF {

  tables(int t, int g) {
    tN = t;
    gN = g;
  }

  for(int i=0; i < 8; i++);
  if(g=0) stat = ("Open");
    else stat = ("Seated");
  void show() {
    System.out.print("Table #: " + table + "|" + guest + " " + status);
    System.out.println();
  }
}
