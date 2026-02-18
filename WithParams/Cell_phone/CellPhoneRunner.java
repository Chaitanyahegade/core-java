public class CellPhoneRunner {
    public static void main(String[] args) {
        String contactName = "Bob";

        long contactNo = CellPhone.getContactNumber(contactName);
        System.out.println(contactNo);


        long number1 = CellPhone.getContactNumber("Lana");
        System.out.println("Lana Contact Number: " + number1);

        long number2 = CellPhone.getContactNumber("Harvey");
        System.out.println("Harvey Contact Number: " + number2);

        long number3 = CellPhone.getContactNumber("Vivaan");
        System.out.println("Vivaan Contact Number: " + number3);

        long number4 = CellPhone.getContactNumber("Unknown");
        System.out.println("Unknown Contact Number: " + number4);

    }
}