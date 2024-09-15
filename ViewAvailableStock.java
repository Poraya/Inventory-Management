import java.util.List;

class ViewAvailableStock {
    public static void viewAvailableStock() {
        List<String[]> data = Csv.readData("/Users/porayasingjai/Downloads/Management 5.csv");
        System.out.println("\nAvailable Stock\n");

        for (int i = 1; i < data.size(); i++) {
            String name = data.get(i)[1];
            int quantities = Integer.parseInt(data.get(i)[3]);
            if (quantities > 0) {
                System.out.println("Name : " + name + "        \tQuantities : " + quantities);
            }
        }
    }
}
