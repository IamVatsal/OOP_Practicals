public class Prac3 {
    public static void main(String[] args) {
        String[] array = {"10", "20", null, "thirty", "40"};

        for (int i = 0; i < array.length + 1; i++) {
            try {
                // Potential ArrayIndexOutOfBoundsException
                String value = array[i];

                // Potential NullPointerException
                if (value.equals("thirty")) {
                    throw new NumberFormatException("Manually throwing NumberFormatException for value 'thirty'");
                }
                // Potential NumberFormatException
                int number = Integer.parseInt(value);
                System.out.println("Converted number: " + number);
        
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index accessed.");
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException caught: Cannot convert string to number - " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught: Attempted to perform operation on a null object.");
            } finally {
                System.out.println("This is the finally block, it always executes.");
            }
        }
        System.out.println("Program continues after try-catch-finally blocks.");
   }
}