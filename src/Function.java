/**
 * Created by adavi on 18.09.2017.
 */
public class Function implements FunctionInterface {
    @Override
    public int factorial(int number) {
        try{
            if (number != 0 ){
                if (number == 1){
                    return 1;
                }else{
                    return factorial(number -1)* number;
                }
            }
        }catch (Exception e){
            System.out.println("Ви що ввели 0?");
        }
        return number;
    }
}
